<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "springwork.model.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Modify User Account Info</title>
	</head>
	
	<body>
		<% User u= (User) session.getAttribute("userkey"); %>
		<div>Change User Information</div>
		<div class="container">
			<form action="submit_changes" method="POST">
				<div class="sub_field">
					<label>First Name</label>
					<input type="text" id="user_fname" name="user_fname" value=<%=u.getUser_fname() %> />				
				</div>
				<div class="sub_field">
					<label>Last Name</label>
					<input type="text" id="user_lname" name="user_lname" value=<%=u.getUser_lname() %> />				
				</div>
				<div class="sub_field">
					<label>Email</label>
					<input type="text" id="user_email" name="user_email" value=<%=u.getUser_email() %> />				
				</div>
				<div class="sub_field">
					<label>Password</label>
					<input type="text" id="user_password" name="user_password" value=<%=u.getUser_password() %> />				
				</div>

				<div class="btn">
					<input type="submit" name="submit" value="Modify" />
				</div>	
			</form>
		</div>
	</body>
</html>