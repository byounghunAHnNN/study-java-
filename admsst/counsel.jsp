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
<title>학습지원관리</title>
<!-- sweet alert import -->
<script src='${CTX_PATH}/js/sweetalert/sweetalert.min.js'></script>
<jsp:include page="/WEB-INF/view/common/common_include.jsp"></jsp:include>
<!-- sweet swal import -->

<script type="text/javascript">
    
    var pagesize = 3;
    var pagenumsize = 5;
    

	
	/** OnLoad event */ 
	$(function() {
	
		fListCounsel();

		fRegisterButtonClickEvent();

	});
	
	/** 버튼 이벤트 등록 */
	function fRegisterButtonClickEvent() {
		$('a[name=btn]').click(function(e) {
			e.preventDefault();

			var btnId = $(this).attr('id');
			
			switch (btnId) {
				case 'btnSearch' :
					fListCounsel();
					break;
				case 'btnSave' :
					consultsave();
					break;		
				case 'btnClose' :
					gfCloseModal();
					break;
			}
		});
	}
	
	function fListCounsel(clickpagenum) {
		
		clickpagenum = clickpagenum || 1;
		
		var param = {
				searchtype : $("#searchtype").val(),
				searchvalue : $("#searchvalue").val(),
				clickpagenum : clickpagenum,
				pagesize : pagesize
		};
		
		var searchcallback = function(returndata) {
			
			console.log("returndata : " + returndata);
			
			searchcallbackprocess(returndata,clickpagenum);
			
		}
		
		callAjax("/admsst/listCounsel.do", "post", "text", true, param, searchcallback);
			
	}
	// 수강상담이력  과정명 클릭시 콜백 함수 과장명에 등록된 학생 명을 가져오기 위해 데려간 느낌.  
	function searchcallbackprocess(returndata,clickpagenum) {
		
		$("#listCounsel").empty().append(returndata); //초기화의 느낌인가? 
		
		var totalcnt = $("#searchlistcnt").val();
		
		var paginationHtml = getPaginationHtml(clickpagenum, totalcnt, pagesize, pagenumsize, 'fListCounsel');
		
		console.log("paginationHtml @@@@@: " + paginationHtml);
		//swal(paginationHtml);
		$("#comnfileuploadPagination").empty().append( paginationHtml );
		
		$("#hclickpagenum").val(clickpagenum);
	}
	
	function fListclick(no) {
		$("#li_no").val(no);
		
		fListCounselDtl();
	}
	//참여학생목록
	function fListCounselDtl (clickpagenum) {
		
		clickpagenum = clickpagenum || 1;
		
		//var li_no =  $("selectli_no").val();
		
		var param = {
				
				li_no : $("#li_no").val() ,
				clickpagenum : clickpagenum,
				pagesize : pagesize
				
		};
		
		var searchcallback = function(returndata) {
			
			console.log("returndata : " + returndata);
			
			searchcallbackprocess2(returndata,clickpagenum);
			
		}
		
		callAjax("/admsst/listCounselDtl.do", "post", "text", true, param, searchcallback);
			
	}
	
	//참여학생목록
	function searchcallbackprocess2(returndata,clickpagenum) {
		
		console.log("searchcallbackprocess2 : " + returndata);	
	
		$("#listCounselDtl").empty().append(returndata);
		
		var totalcnt = $("#searchlistcnt2").val();
		
		var paginationHtml = getPaginationHtml(clickpagenum, totalcnt, pagesize, pagenumsize, 'fListCounselDtl');
		console.log("paginationHtml : " + paginationHtml);
		//swal(paginationHtml);
		$("#comnfileuploadPagination").empty().append( paginationHtml );
		
		$("#hclickpagenum").val(clickpagenum);
	}
	
		//상담이력 목록 조회
	function Listconsulting(loginID, clickpagenum) {
	/*	console.log("Listconsulting : " + loginID);	
			
		$("#loginID").val(loginID);
		
		fListCounselDtl2();
	}

	function fListCounselDtl2 (clickpagenum) {
		*/
		
		
		clickpagenum = clickpagenum || 1;
		
		//var loginID =  $("loginID").val();
		
		var param = {
				loginID : loginID ,
				clickpagenum : clickpagenum,
				pagesize : pagesize
				
		};
	
		var searchcallback2 = function(returndata) {
			
			console.log("returndata : " + returndata);
			
			searchcallbackprocess3(returndata,clickpagenum);
		
	}
	
		callAjax("/admsst/listCounselDtl2.do", "post", "text", true, param, searchcallback2);
		
}
		//상담이력 목록조회 
		function searchcallbackprocess3(returndata,clickpagenum) {
			
			$("#listCounselDtl2").empty().append(returndata);
			
			var totalcnt = $("#searchlistcnt2").val();
			
			var paginationHtml = getPaginationHtml(clickpagenum, totalcnt, pagesize, pagenumsize, 'fListCounselDtl2');
			console.log("paginationHtml : " + paginationHtml);
			//swal(paginationHtml);
			$("#comnfileuploadPagination").empty().append( paginationHtml );
			
			$("#hclickpagenum").val(clickpagenum);
		}

		function fPopModal() {		
			$("#action").val("I");
			
		 var loginID = $("#loginID").val();
			if (loginID == null || loginID=="")
				alert("학생을 선택해주세요.");
				
			fn_forminit();
			
			gfModalPop("#layer1");
		}  
		
		function fn_forminit(object) {
			   	
			    var li_no = $("#li_no").val();
			
				if (object == null || object=="") {
					//$("#loginID").val("");
					$("#cont").val("");
                    $("#li_no").val(li_no);	
                    //$("#btnregister").hide();
					$("#loginID").focus();
				} else {
					$("#loginID").val(object.loginID);					
					$("#cont").val(object.tc.cs_ct);
				    //$("#btnregister").show();
					$("#li_no").val(object.li_no);
				}						
		}
		


		function fselectone(no) {
			
			var param = { li_no : no };
			
			var selectonecallback = function( selectonersn ) {
				console.log(JSON.stringify(selectonersn));
				//console.log(JSON.stringify(selectonersn.searchone));
								
				$("#action").val("U");			
				fn_forminit(selectonersn.searchone);
				
				gfModalPop("#layer1");
			}
			
			callAjax("/admsst/selectConsult.do", "post", "json", true, param, selectonecallback);
		}
		
		//등록버튼시 보
		function consultsave() {
			
			console.log("consultsave : " + $("#loginID").val());
			
			var param = {
					li_no : $("#selli").val(),
					loginID : $("#loginID").val(),
					cs_ct : $("#cs_ct").val(),
					action : $("#action").val(),
			};
			
			var savecallback= function(rtn) {
				console.log(JSON.stringify(rtn));
				
				alert("저장 되었습니다.");
				
				gfCloseModal();
				
				var savepageno = 1;
				
				if($("#action").val() == "U") {
					savepageno = $("#hclickpagenum").val();
				}
				
				fListCounsel(savepageno);
				
			}
		
			callAjax("/admsst/saveConsult.do", "post", "json", true,  $("#myForm").serialize(), savecallback);
		}


		

</script>

</head>
<body>
<form id="myForm" action=""  method="">
	<input type="hidden" id="hclickpagenum" name="hclickpagenum"  value="" />
	<input type="hidden" id="action" name="action"  value="" />
	<input type="hidden" id="li_no" name="li_no"  value="" />
	<input type="hidden" id="loginID" name="loginID" value =""/>
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
								class="btn_nav bold">학습지원</span> <span class="btn_nav bold">수강상담이력</span> <a href="../system/comnCodMgr.do" class="btn_set refresh">새로고침</a>
						</p>

						<p class="conTitle">
							<span>수강상담이력</span> <span class="fr"> 
							</span>
						</p>
						<table style="margin-top: 10px" width="100%" cellpadding="5" cellspacing="0" border="1"  align="left"   style="collapse; border: 1px #50bcdf;">
	                        <tr style="border: 0px; border-color: blue">
	                        
	                           <td width="50" height="25" style="font-size: 100%; text-align:left; padding-right:25px;">

								     <span>과정명</span></a>

									</select> 
	     	                       <input type="text" style="width: 700px; height: 25px;" id="searchvalue" name="searchvalue">                    
		                           <a href="" class="btnType blue" id="btnSearch" name="btn"><span>검  색</span></a>
	                           </td> 
	                           
	                        </tr>
                        </table> 
						<div class="divfileuploadList">
							<table class="col">
								<caption>caption</caption>
								<colgroup>
									<col width="30%">
									<col width="70%">
								</colgroup>
	
								<thead>
									<tr>
										<th scope="col">과정명</th>
										<th scope="col">기간</th>

									</tr>
								</thead>
								<tbody id="listCounsel"></tbody> 
							</table>
						</div>
	
						<div class="paging_area"  id="comnfileuploadPagination"> </div>
						
						<div class="content">
						<p class="conTitle mt50">
							<span>참여학생목록</span> <span class="fr"> 
							</span>
						</p>
						<table style="margin-top: 10px" width="50%" cellpadding="5" cellspacing="0" border="1"  align="left"   style="collapse; border: 1px #50bcdf;">
	                        <tr style="border: 0px; border-color: blue">
	                        
	                           <td width="50" height="25" style="font-size: 100%; text-align:left; padding-right:25px;">
	                           
									</select> 
	                           </td> 
	                        </tr>
                        </table> 
						<div class="divfileuploadList">
							<table class="col">
								<caption>caption</caption>
								<colgroup>
									<col width="30%">
									<col width="70%">
								</colgroup>
	
								<thead>
									<tr>
										<th scope="col">학생명</th>
										<th scope="col">시험최종점수</th>

									</tr>
								</thead>
								<tbody id="listCounselDtl"></tbody> 
								
							</table>
						</div>
	
						<div class="paging_area"  id="comnfileuploadPagination"> </div>
						
							<div class="content">
						<p class="conTitle mt50">
							<span>상담이력 목록 조회</span> <span class="fr"> 
							<a href="javascript:fPopModal();" class="btnType blue" id="btnregister" name="modal"> <span>등 록</span> </a>
							</span>
						</p>
				
						<table style="margin-top: 10px" width="50%" cellpadding="5" cellspacing="0" border="1"  align="left"   style="collapse; border: 1px #50bcdf;">
	                        <tr style="border: 0px; border-color: blue">
	                        
	                           <td width="50" height="25" style="font-size: 100%; text-align:left; padding-right:25px;">
	                           
									</select> 
	                           </td> 
	                        </tr>
                        </table> 
						<div class="divfileuploadList">
							<table class="col">
								<caption>caption</caption>
								<colgroup>
									<col width="30%">
									<col width="50%">
									<col width="20%">
								</colgroup>
	
								<thead>
									<tr>
										<th scope="col">상담일자</th>
										<th scope="col">상담장소</th>
										<th scope="col">상담자</th>

									</tr>
								</thead>
								<tbody id="listCounselDtl2"></tbody> 
								
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
			<dd class="content">
				<!-- s : 여기에 내용입력 -->
				<table class="row">
					<caption>caption</caption>
					<colgroup>
						<col width="120px">
						<col width="*">
					</colgroup>

					<tbody>
							<th > 
							  <select id="selli" name="selli" style="width: 150px;" >
		     	                            <option value="" >spring</option>
											<option value="seq" >a</option>
											<option value="title" >파일업로드<option>
											<option value="writer" >과목명A</option>
							  </select> 
							 </th>
							 
						<tr>

						</tr>
						<tr>
							<th scope="row">내용 <span class="font_red">*</span></th>
							<td>
							     <textarea class="inputTxt p300"	name="cont" id="cont" > </textarea>
							     
						
						   </td>
						</tr>
						
								  
						</tr>
					</tbody>
				</table>

				<!-- e : 여기에 내용입력 -->

				<div class="btn_areaC mt30">
					<a href="" class="btnType blue" id="btnSave" name="btn"><span>저장</span></a>  
					<a href=""	class="btnType gray"  id="btnClose" name="btn"><span>취소</span></a>
				</div>
			</dd>
		</dl>
		<a href="" class="closePop"><span class="hidden">닫기</span></a>
	</div>

</form>
</body>
</html>