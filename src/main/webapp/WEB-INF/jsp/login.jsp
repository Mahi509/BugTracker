<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/admin_Style.css" />
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/bxslider/4.2.5/jquery.bxslider.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div id="content">
		<div id="content_int">
			<!--content starts here-->
			<div class="white_content">
				<div class="txt_hdr_forms" align="center">WELCOME TO Bug
					Tracking CENTER</div>
				<div class="content_divider_forms">Sign in to your account</div>
				<form:form
					action="${pageContext.request.contextPath}/login/loginAdmin"
					method="post" id="loginForm">
					<div class="register_panel">
						<c:if test="${SUCCESS_MESSAGE != null}">
							<div style="color: green;">${SUCCESS_MESSAGE}</div>
						</c:if>
						<c:if test="${ERROR_MESSAGE != null}">
							<div style="color: red;">${ERROR_MESSAGE}</div>
						</c:if>

						<div class="login_bg">
							<h1>I'm registered</h1>
						</div>
						<fieldset class="login">

							<label for="email">User name </label> <input name="j_username"
								id="j_username" type="text" class="required" /> <label
								for="Password">Password</label> <input name="j_password"
								type="password" id="j_password" class="required" />
						</fieldset>
						<div class="button_panel">
							<div class="save_cont">
								<input type="submit" value="Login" class="submit">
								<%-- <a href="<%=request.getContextPath()%>/admin/loginAdmin"
							title="login">Login</a> --%>
							</div>
							<div class="save_cont">
								<!-- <input type="reset" value="Reset"> -->
								<input type="reset" value="reset" class="submit">
							</div>

						</div>

					</div>
				</form:form>
				<div class="not_register_panel">
					<div class="login_bg">
						<h1>i'm not registered</h1>
					</div>
					<p>If you wish to create a new account please continue below</p>
					<div class="button_panel">
						<div class="save_cont">
							<a href="<%=request.getContextPath()%>/user/showUserRegister"
								title="Continue">Continue</a>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--content ends here-->
	</div>

</body>
</html>