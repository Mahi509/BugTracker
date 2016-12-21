<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet"
	href="<c:url  value="/resources/css/adminAddDetails.css"/>" />
<title><tiles:insertAttribute name="title" ignore="true"></tiles:insertAttribute>
</title>
</head>
<body>
	<table cellpadding="0" cellspacing="0" align="center">
		<tr>
			<td height="10" colspan="2"><tiles:insertAttribute name="header"></tiles:insertAttribute></td>
		</tr>
		<tr>
			<td colspan="2" align="left"><tiles:insertAttribute
					name="leftBody"></tiles:insertAttribute></td>
		</tr>
		<tr>
			<td width="1000" height="50"><tiles:insertAttribute name="body"></tiles:insertAttribute></td>
		</tr>
		<tr>
			<td height="10" colspan="2"><tiles:insertAttribute name="footer"></tiles:insertAttribute></td>
		</tr>
	</table>
</body>
</html>