<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "springwork.model.User" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

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
			<a href="UserAccountPage">User Account</a> |
			<a href="logout">Logout</a>
		</nav>
		
		<!-- message for deleting User Account -->
		<% 	
			 	if(session.getAttribute("success_delUser")!= null){%>
					<h3> <% 
									out.println(session.getAttribute("success_delUser"));
									session.removeAttribute("success_delUser");
								%>
					</h3>
				<% }		
			 	if(session.getAttribute("Failed_delUser")!= null){%>
					<h3> <% 
									out.println(session.getAttribute("Failed_delUser"));
									session.removeAttribute("Failed_delUser");
								%>
					</h3>
				<% }
		%>

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
			<a href="delete_user">Delete Your Account</a>
		</div>
	</body>
</html>