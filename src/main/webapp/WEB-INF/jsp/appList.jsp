<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%-- <link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/AppListCss.css" /> --%>
<link href="<c:url  value="/resources/css/AppListCss.css"/>"
	rel="stylesheet" type="text/css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/jquery-1.12.1.min.js" /></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/bootstrap-hover-dropdown.js" /></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/bootstrap-hover-dropdown.min.js" /></script>

<title>Insert title here</title>
</head>
<body>
	<div class="div1">
		<select id="appId">
			<option selected="selected" disabled="true" value="">Select
				AppName</option>

			<c:forEach items="${appsList}" var="app">
				<option value="${app.appId}"><c:out
						value="${app.applicationName}"></c:out>
				</option>

			</c:forEach>
		</select>
		<ul>
			<li class="dropdown"><a href="#" class="dropdown-toggle"
				data-toggle="dropdown" data-hover="dropdown" data-delay="1000"
				data-close-others="false"> Account <b class="caret"></b>
			</a>
		</ul>
		<ul class="dropdown-menu">
			<li><a tabindex="-1" href="#">My Account</a></li>
			<li><a tabindex="-1" href="#">Change Email</a></li>
			<li><a tabindex="-1" href="#">Change Password</a></li>
			<li><a tabindex="-1" href="#">Logout</a></li>
		</ul>
	</div>
</body>
</html>