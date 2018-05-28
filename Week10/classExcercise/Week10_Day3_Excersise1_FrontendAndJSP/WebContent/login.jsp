<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Registration Page</title>
		<link rel="stylesheet" type="text/css" href="CSS/main.css">
	</head>
	<%
		String message = null;
		if(request.getParameter("login")!=null){
			String userName = request.getParameter("userName");
			String password = request.getParameter("password");
			if("tom".equals(userName)&&"jerry".equals(password)){
				session.setAttribute("userName",userName);
				response.sendRedirect("greeting.jsp");
			} else {
				message = "Password and Username does not match";
			}
		}
	%>
	<body>
		<!----------- Header ----------->
		<div id = "main-header">
			<%@include file="header.html" %>
		</div>
		<!----------- Body ----------->
		<div id="content">
			<%
				if(message !=null)
					out.print("<span style ='color:red'>" + message + "</span>");
			%>
			<form method="post">
				UserName<input type="text" name="userName" />
				<br/>
				Password<input type="text" name="password" />
				<br/>
				<input type ="submit" name="login" value="Login" />
			</form>
		</div>
		<!----------- Footer ----------->
		<div id="main-footer">
			<%@include file="footer.html" %>
		</div>
	</body>
</html>