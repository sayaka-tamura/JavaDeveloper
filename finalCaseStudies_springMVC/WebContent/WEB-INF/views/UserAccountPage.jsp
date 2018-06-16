<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "springwork.model.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>User Account Page</title>
	</head>
	<body>
		<div>User Account Page</div>
		
		<nav>
			<a href="topPage_user">Home</a> |
			<a href="IncomeExpense">Income / Expense</a> |
			<a href="History">History</a> |
			<a href="UserAccountPage">User Account</a>
		</nav>
		
		<% User u= (User) session.getAttribute("login_user"); %>
		<div class="user_table">
			<table>
				<tr>
					<td>First Name</td>
					<td>${login_user.user_fname}</td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td>${login_user.user_lname}</td>
				</tr>
				<tr>
					<td>Email</td>
					<td>${login_user.user_email}</td>
				</tr>
				<tr>
					<td>Password</td>
					<td>${login_user.user_password}</td>
				</tr>

			</table>
			<a href="edit_user/${login_user.user_id}">Edit</a>
		</div>
	</body>
</html>