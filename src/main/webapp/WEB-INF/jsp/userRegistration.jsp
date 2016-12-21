<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/jquery-1.12.1.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/jquery.validate.min.js"></script>
<!-- <script src="//code.jquery.com/jquery-1.12.0.min.js"></script> -->
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>

<link rel="stylesheet"
	href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/admin_Style.css" />
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/landingPage.css" />
<title>Insert title here</title>
</head>
<body>
	<form:form id="userReg" action="${pageContext.request.contextPath}"
		modelAttribute="userDetails" method="post">
		<div id="content">
			<div id="content_int">
				<div class="white_content">
					<div class="txt_hdr_forms">Sign Up here for User!!</div>
					<div class="content_divider_forms">Welcome to User Register
						panel</div>

					<div class="small_txt">
						Fields Marked<span class="red_mark"><sup
							style="color: red;">*</sup></span>are required
					</div>
					<div class="adminLogo">
						<h4>User Information</h4>
					</div>
					<div class="login_shadow"></div>
					<!-- <fieldset class="login_pg"> -->

					<c:if test="${Success != null}">
						<div style="color: green;">${Success}</div>
					</c:if>
					<div class="login-field"></div>

					<div class="login-field">
						<form:label path="name">UserName:<sup
								style="color: red;">*</sup>
						</form:label>
						<form:input path="name" id="name" name="name" spellcheck="false"
							placeholder="UserName" title="UserName goes here" />
					</div>
					<div class="login-field">
						<form:label path="password">Password:
						</form:label>
						<form:input path="password" id="password" name="password"
							spellcheck="false" placeholder="Password"
							title="Password goes here" />
					</div>
					<div class="login-field">
						<form:label path="confirmPassword">ConfirmPassword:<sup
								style="color: red;">*</sup>
						</form:label>
						<form:input path="confirmPassword" id="confirmPassword"
							name="confirmPassword" spellcheck="false"
							placeholder="ConfirmPassword" title="ConfirmPassword goes here" />
					</div>
					<div class="login-field">
						<form:label path="email">Email:<sup
								style="color: red;">*</sup>
						</form:label>
						<form:input path="email" id="email" name="email"
							spellcheck="false" placeholder="Email Address"
							title="Email goes here" />
					</div>
					<div class="login-field1">
						<div class="save_cont">
							<input type="submit" value="submit" class="submit">
						</div>
						<div class="save_cont">
							<input type="reset" id="reset" value="reset">
						</div>
					</div>
				</div>
			</div>
		</div>
	</form:form>
</body>
</html>