<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Register</title>
	
	<!-------------- CSS -------------->
	<spring:url value="/resources/CSS/main.css" var="mainCss" />
	<link href="${mainCss}" rel="stylesheet" />
</head>
<body>
	<div id="container">
		<div>Welcome to Household Bookkeeping Application</div>
		<!-- message for Log Out Successfully -->
		<% 	 
			 	if(session.getAttribute("success_logout")!= null){%>
					<h3> <% 
									out.println(session.getAttribute("success_logout"));
									session.removeAttribute("success_logout");
								%>
					</h3>
				<% }
		%>
		
		<!-- Error message for Failed Log In -->
		<% 
			 String paramValue = request.getParameter("submit");
			 if (paramValue!=null){
				 	if(session.getAttribute("msg")!= null){
						out.println(session.getAttribute("msg"));}
			 }
		%>
		<div class = "wrapper">
			<div class="column">
				<div>Log in</div>
				<form:form action="login" method="POST" modelAttribute="userkey">
					<div class="sub_field">
						<label>Email</label>
						<input type="email" id="user_email" name="user_email" />				
					</div>
					<div class="sub_field">
						<label>Password</label>
						<input type="text" id="user_password" name="user_password" />				
					</div>
		
					<div class="btn">
						<input type="submit" name="submit" value="login" />
					</div>			
				</form:form>
			</div>
			<div class="column">
				<div>No Account yet?</div>
				<div><a href="signup">Create Account</a></div>
			</div>
		</div>
	</div>
</body>
</html>