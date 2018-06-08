 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Sign Up</title>
	</head>
	<body>
		<div class="container">
			<div>Sign Up Page</div>
			<form:form action="userInfo" method="POST" modelAttribute="userkey">
				<div class="sub_field">
					<label>First Name</label>
					<input type="text" id="user_fname" name="user_fname" />
					<form:errors path="user_fname" />
				</div>
				<div class="sub_field">
					<label>Last Name</label>
					<input type="text" id="user_lname" name="user_lname" />
					<form:errors path="user_lname" />
				</div>
				<div class="sub_field">
					<label>Email</label>
					<form:input type="text" id="user_email" path="user_email" />
					<form:errors path="user_email" />
				</div>
				<div class="sub_field">
					<label>Password</label>
					<form:input type="password" id="user_password" path="user_password" />
					<form:errors path="user_password" />
				</div>
				
				<div class="btn">
					<input type="submit" name="submit" value="Sign Up" />
				</div>			
			</form:form>
		</div>
	</body>
</html>