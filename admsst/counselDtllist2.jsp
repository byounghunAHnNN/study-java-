<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
						   
							<c:if test="${searchlistcnt2 eq 0 }">
								<tr>
									<td colspan="2">데이터가 존재하지 않습니다.</td>
								</tr>
							</c:if>
							<c:if test="${searchlistcnt2 > 0 }">
								<c:forEach items="${listCounselDtl2}" var="list">
									<tr>
										<td><a href="javascript:Listconsulting('${list.loginID}')"></a>${list.li_no}</td>
										<td>${list.cs_date}</td>
										<td>${list.cs_place}</td>
										<td>${list.cs_nm}</td>
										
									</tr>
								</c:forEach>
							</c:if>
						
							<input type="hidden" id="searchlistcnt2" name="searchlistcnt2" value ="${searchlistcnt2}"/>
							