<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "springwork.model.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Top Page</title>
	</head>
	
	<body>
		<% User u= (User) session.getAttribute("login_user"); %>
		<div class="container">
			<nav>
				<a href="#">Home</a> |
				<a href="IncomeExpense">Income / Expense</a> |
				<a href="History">History</a> |
				<a href="UserAccountPage">User Account</a>
			</nav>
			<div>Welcome ${login_user.user_fname}</div>
		</div>
	</body>
</html>