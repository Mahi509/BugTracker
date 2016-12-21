<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet"
	href="<c:url  value="/resources/css/adminHome.css"/>" />
<title>Insert title here</title>
</head>
<body>
	<br>
	<div class="dropdown">
		<button class="dropbtn">Applications</button>
		<div class="dropdown-content">
			<c:forEach items="${appsList}" var="app">
				<a
					href="<%=request.getContextPath()%>/adminClient/showBugs/${app.appId}"><c:out
						value="${app.applicationName}"></c:out></a>
			</c:forEach>
		</div>
	</div>
</body>
</html>