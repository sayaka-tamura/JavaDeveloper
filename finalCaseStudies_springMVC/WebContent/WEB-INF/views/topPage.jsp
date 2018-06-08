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
		<% User u= (User) session.getAttribute("userk"); %>
		<div>Welcome</div>
		<div class="container">
			
			<div>
				<div class="sub_field">
					<div>First Name: <%=u.getUser_fname() %></div>				
				</div>
				<div class="sub_field">
					<div>Last Name: <%=u.getUser_lname() %> </div>				
				</div>
				
			</div>
		</div>
	</body>
</html>