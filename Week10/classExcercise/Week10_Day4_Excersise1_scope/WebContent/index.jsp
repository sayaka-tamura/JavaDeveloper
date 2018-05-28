<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Home</title>
	</head>
	<body>
		<%
			/* For Application Scope */
			Integer app_counter = (Integer)application.getAttribute("App_counter");
			if( app_counter ==null) {
		        /* First visit */
		        app_counter = 0;
		     } 
		     
		     /* For Session Scope */
		    Integer session_counter = (Integer)session.getAttribute("Session_counter");
			if( session_counter==null) {
	            /* First visit */
	            session_counter = 0;
			}
		%>
		<nav>
			<a href="index.jsp">Home</a>
			<a href="p1.jsp">Page 1</a>
			<a href="p2.jsp">Page 2</a>
			<a href="p3.jsp">Page 3</a>		
		</nav>
		
		<div>Page 1:</div>
		<div>Application Counter: <%= app_counter %></div>
		<div>Session Counter: <%= session_counter %></div>
	</body>
</html>