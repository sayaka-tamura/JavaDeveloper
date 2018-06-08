<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Register</title>
	<spring:url value="/resources/CSS/main.css" var="mainCss" />
	
	<link href="${mainCss}" rel="stylesheet" />
</head>
<% String msg="";
	
%>
<body>
	<div id="container">
		<div>Welcome to Household Bookkeeping Application</div>
		<div class="column">
			<div>Log in</div>
			<form action="login" method="POST">
				<div class="sub_field">
					<label>Email</label>
					<input type="text" id="user_email" name="user_email" />				
				</div>
				<div class="sub_field">
					<label>Password</label>
					<input type="text" id="user_password" name="user_password" />				
				</div>
	
				<div class="btn">
					<input type="submit" name="submit" value="login" />
				</div>			
			</form>
			<%-- <% out.print(msg) %> --%>
		</div>
		<div class="column">
			<div>Go to Sign Up Page</div>
			<div><a href="signup">Sign up</a></div>
		</div>

	</div>
</body>
</html>