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
	<table border="1" cellspacing="1">
		<tr>
			<td><h5>AppId:${AppId}</h5></td>
		</tr>
		<tr>
			<th>BugId</th>
			<th>BugCategory</th>
			<th>BusStatus</th>
			<th>PriorityLevel</th>
			<th>SeverityLevel</th>
			<th>ApplicationName</th>
			<th>Platform</th>
			<th>CreationDate</th>
			<th>Description</th>
		</tr>

		<c:forEach items="${listOfBugs}" var="bug">
			<tr>
				<td><c:out value="${bug.bugId}"></c:out></td>
				<td><c:out value=" ${bug.bugCategory1.categoryName}"></c:out></td>
				<td><c:out value=" ${bug.busStatus1.bugStatusName}"></c:out></td>
				<td><c:out value=" ${bug.priorityLevel1.priorityName}"></c:out></td>
				<td><c:out value=" ${bug.severityLevel1.severityName}"></c:out></td>
				<td><c:out value="${bug.application.applicationName}"></c:out></td>
				<td><c:out value="${bug.platform}"></c:out></td>
				<td><c:out value="${bug.bugCreationDate}"></c:out></td>
				<td><c:out value="${bug.bugDescription}"></c:out></td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>