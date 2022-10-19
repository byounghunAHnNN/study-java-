<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${sessionScope.userType ne 'A'}">
    <c:redirect url="/dashboard/dashboard.do"/>
</c:if>
<!DOCTYPE html>
<html lang="ko">
<head>
<!-- abc -->
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<title>파일업로드 샘플</title>
<!-- sweet alert import -->
<script src='${CTX_PATH}/js/sweetalert/sweetalert.min.js'></script>
<jsp:include page="/WEB-INF/view/common/common_include.jsp"></jsp:include>
<!-- sweet swal import -->

<script type="text/javascript">
    
    var pagesize = 5;
    var pagenumsize = 5;
    
	/** OnLoad event */ 
	$(function() {
	
		// 게시판 조회
		fListfileupload();
		
		fRegisterButtonClickEvent();
	});
    
	/** 버튼 이벤트 등록 */
	function fRegisterButtonClickEvent() {
		$('a[name=btn]').click(function(e) {
			e.preventDefault();

			var btnId = $(this).attr('id');
			
			switch (btnId) {
				case 'btnSearch' :
					fListfileupload();
					break;
				case 'btnSave' :
					fsavefileupload();
					break;	
				case 'btnDelete' :
					$("#action").val("D");
					fsavefileupload();
					break;		
				case 'btnCloseGrpCod' :
				case 'btnCloseDtlCod' :
					gfCloseModal();
					break;
			}
		});
	}
	
	function fListfileupload(clickpagenum) {
		
		clickpagenum = clickpagenum || 1;
		
		var param = {
				searchtype : $("#searchtype").val() ,
				searchvalue : $("#searchvalue").val() ,
				clickpagenum : clickpagenum,
				pagesize : pagesize
		};
		
		var searchcallback = function(returndata) {
			console.log("returndata : " + returndata);
			
			searchcallbackprocess(returndata,clickpagenum);
			
		}
		
		callAjax("/admsst/listFileupload.do", "post", "text", true, param, searchcallback);
		
		
	}
	
	function searchcallbackprocess(returndata,clickpagenum) {
		
		$("#listfileupload").empty().append(returndata);
		
		var totalcnt = $("#searchlistcnt").val();
		
		var paginationHtml = getPaginationHtml(clickpagenum, totalcnt, pagesize, pagenumsize, 'fListfileupload');
		console.log("paginationHtml : " + paginationHtml);
		//swal(paginationHtml);
		$("#comnfileuploadPagination").empty().append( paginationHtml );
		
		$("#hclickpagenum").val(clickpagenum);
	}
	
	function fPopModal() {		
		$("#action").val("I");
		
		fn_forminit();
		
		gfModalPop("#layer1");
	}  
	
	function fn_forminit(object) {
		
		if (object == null || object=="") {
			$("#title").val("");
			$("#cont").val("");
			$("#btnDelete").hide();
			$("#bd_no").val("");
			
			$("#title").focus();
		} else {
			$("#title").val(object.bd_title);
			$("#cont").val(object.bd_contents);
			$("#btnDelete").show();
			
			$("#bd_no").val(object.bd_no);
		}

		
	}
	
	function fselectone(no) {
		
		var param = { bd_no : no };
		
		var selectonecallback = function( selectonersn ) {
			console.log(JSON.stringify(selectonersn));
			//console.log(JSON.stringify(selectonersn.searchone));
			
			$("#action").val("U");			
			fn_forminit(selectonersn.searchone);
			
			gfModalPop("#layer1");
		}
		
		callAjax("/admsst/selectFileupload.do", "post", "json", true, param, selectonecallback);
	}
	
	function fsavefileupload() {
		
		var param = {
				bd_no : $("#bd_no").val(),
				title : $("#title").val(),
				cont : $("#cont").val(),
				action : $("#action").val()
		};
		
		var savecallback= function(rtn) {
			console.log(JSON.stringify(rtn));
			
			alert("저장 되었습니다.");
			
			gfCloseModal();
			
			var savepageno = 1;
			
			if($("#action").val() == "U") {
				savepageno = $("#hclickpagenum").val();
			}
			
			fListfileupload(savepageno);
			
		}
		
		//callAjax("/admsst/saveFileupload.do", "post", "json", true, param, savecallback);
		callAjax("/admsst/saveFileupload.do", "post", "json", true,  $("#myForm").serialize(), savecallback);
	}
	
</script>

</head>
<body>
<form id="myForm" action=""  method="">
	<input type="hidden" id="hclickpagenum" name="hclickpagenum"  value="" />
	<input type="hidden" id="action" name="action"  value="" />
	<input type="hidden" id="bd_no" name="bd_no"  value="" />
	
	<!-- 모달 배경 -->
	<div id="mask"></div>

	<div id="wrap_area">

		<h2 class="hidden">header 영역</h2>
		<jsp:include page="/WEB-INF/view/common/header.jsp"></jsp:include>

		<h2 class="hidden">컨텐츠 영역</h2>
		<div id="container">
			<ul>
				<li class="lnb">
					<!-- lnb 영역 --> <jsp:include
						page="/WEB-INF/view/common/lnbMenu.jsp"></jsp:include> <!--// lnb 영역 -->
				</li>
				<li class="contents">
					<!-- contents -->
					<h3 class="hidden">contents 영역</h3> <!-- content -->
					<div class="content">

						<p class="Location">
							<a href="../dashboard/dashboard.do" class="btn_set home">메인으로</a> <span
								class="btn_nav bold">학습관리</span> <span class="btn_nav bold">게시판</span> <a href="../system/comnCodMgr.do" class="btn_set refresh">새로고침</a>
						</p>

						<p class="conTitle">
							<span>게시판</span> <span class="fr"> <a
								// class="btnType blue" href="javascript:fPopModal();" name="modal"><span>신규등록</span></a>
							</span>
						</p>
						<table style="margin-top: 10px" width="100%" cellpadding="5" cellspacing="0" border="1"  align="left"   style="collapse; border: 1px #50bcdf;">
	                        <tr style="border: 0px; border-color: blue">
	                           <td width="50" height="25" style="font-size: 100%; text-align:left; padding-right:25px;">
		     	                      <select id="searchtype" name="searchtype" style="width: 150px;" v-model="searchKey">
		     	                            <option value="" >전체</option>
											<option value="seq" >순번</option>
											<option value="title" >제목</option>
											<option value="writer" >작성자</option>
									</select> 
								
	     	                       <input type="text" style="width: 300px; height: 25px;" id="searchvalue" name="searchvalue">                    
		                           <a href="" class="btnType blue" id="btnSearch" name="btn"><span>검  색</span></a>
	                           </td> 
	                           
	                        </tr>
                        </table> 
						<div class="divfileuploadList">
							<table class="col">
								<caption>caption</caption>
								<colgroup>
									<col width="10%">
									<col width="40%">
									<col width="25%">
									<col width="25%">
								</colgroup>
	
								<thead>
									<tr>
										<th scope="col">순번</th>
										<th scope="col">제목</th>
										<th scope="col">작성자</th>
										<th scope="col">작성일</th>
									</tr>
								</thead>
								<tbody id="listfileupload"></tbody>
							</table>
						</div>
	
						<div class="paging_area"  id="comnfileuploadPagination"> </div>
						
						
						
					</div> <!--// content -->

					<h3 class="hidden">풋터 영역</h3>
						<jsp:include page="/WEB-INF/view/common/footer.jsp"></jsp:include>
				</li>
			</ul>
		</div>
	</div>

	<!-- 모달팝업 -->
	<div id="layer1" class="layerPop layerType2" style="width: 600px;">
		<dl>
			<dt>
				<strong>글 편집</strong>
			</dt>
			<dd class="content">
				<!-- s : 여기에 내용입력 -->
				<table class="row">
					<caption>caption</caption>
					<colgroup>
						<col width="120px">
						<col width="*">
					</colgroup>

					<tbody>
						<tr>
							<th scope="row">제목 <span class="font_red">*</span></th>
							<td><input type="text" class="inputTxt p100" name="title" id="title" /></td>
						</tr>
						<tr>
							<th scope="row">내용 <span class="font_red">*</span></th>
							<td>
							     <textarea class="inputTxt p100"	name="cont" id="cont" > </textarea>
						   </td>
						</tr>
					</tbody>
				</table>

				<!-- e : 여기에 내용입력 -->

				<div class="btn_areaC mt30">
					<a href="" class="btnType blue" id="btnSave" name="btn"><span>저장</span></a> 
					<a href="" class="btnType blue" id="btnDelete" name="btn"><span>삭제</span></a> 
					<a href=""	class="btnType gray"  id="btnClose" name="btn"><span>취소</span></a>
				</div>
			</dd>
		</dl>
		<a href="" class="closePop"><span class="hidden">닫기</span></a>
	</div>

	<!--// 모달팝업 -->
</form>
</body>
</html>