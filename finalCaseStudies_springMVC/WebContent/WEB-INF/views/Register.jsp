<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Register</title>
</head>

<body>
	<div id="container">
		<div>Register</div>
		<div>Please review your information then click on "Confirm" button.</div>
		<div>Your Information:</div>
		<form action="register_userinfo" method="POST">
			<div class="sub_field">
				<label>First Name</label>
				<input type="text" id="user_fname" name="user_fname" value=${userkey.user_fname} />				
			</div>
			<div class="sub_field">
				<label>Last Name</label>
				<input type="text" id="user_lname" name="user_lname" value=${userkey.user_lname} />				
			</div>
			<div class="sub_field">
				<label>Email</label>
				<input type="text" id="user_email" name="user_email" value=${userkey.user_email} />				
			</div>
			<div class="sub_field">
				<label>Password</label>
				<input type="text" id="user_password" name="user_password" value=${userkey.user_password} />				
			</div>

			<div class="btn">
				<input type="submit" name="submit" value="Confirm" />
			</div>			
		</form>
	</div>
</body>
</html>