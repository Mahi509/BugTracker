<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="header">
		<!--toplinks start here-->
		<div class="top_links">
			<ul>
				<li><a href="<%=request.getContextPath()%>/logout">LogOut</a></li>
				<li><a href="<%=request.getContextPath()%>/admin/showAddMarks">Register User</a></li>
				<%-- <li class="last"><a href="#">Welcome <c:out
							value="${pageContext.request.userPrincipal.name}"></c:out></a></li> --%>
			</ul>
		</div>
		<div class="clear"></div>
	</div>
</body>
</html>