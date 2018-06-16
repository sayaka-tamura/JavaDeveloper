 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Create Account</title>
	</head>
	<body>
		<div class="container">
			<div>Create Account</div>
			<form:form action="userInfo" method="POST" modelAttribute="userkey">
			<form:errors path = "*" cssClass = "errorblock" element = "div" />
				<div class="sub_field">
					<label>First Name</label>
					<input type="text" id="user_fname" name="user_fname" />
					<form:errors path="user_fname" cssClass = "error" />
				</div>
				<div class="sub_field">
					<label>Last Name</label>
					<input type="text" id="user_lname" name="user_lname" />
					<form:errors path="user_lname" cssClass = "error" />
				</div>
				<div class="sub_field">
					<label>Email</label>
					<form:input type="text" id="user_email" path="user_email" />
					<form:errors path="user_email" cssClass = "error" />
				</div>
				<div class="sub_field">
					<label>Password</label>
					<form:input type="password" id="user_password" path="user_password" />
					<form:errors path="user_password" cssClass = "error" />
				</div>
				
				<div class="btn">
					<input type="submit" name="submit" value="Create Account" />
				</div>			
			</form:form>
		</div>
	</body>
</html>