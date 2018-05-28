<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page session="true" %>
<%@page buffer="8kb" %>
<%@page import="java.util.Date" %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Greeting</title>
		<link rel="stylesheet" type="text/css" href="CSS/main.css">
	</head>
	<!-- for NullPointer Exception -->
	<%
		Date date = new Date();
		
		String userName = null;
		if(session.getAttribute("userName")==null){
			response.sendRedirect("login.jsp");
		} else {
			userName = session.getAttribute("userName").toString();
		}
	%>
	
	<body>
		<!----------- Header ----------->
		<div id = "header" style="background-color: blue; height=20%;">
			<%@include file="header.html" %>
		</div>
		<!----------- Body ----------->
		<div style="background-color: olive; text-align: center;">
		Current Date<%=date %>
		</div>
		
		<div id="content" style="background-color:gray; height:70%; text-align: center;">
			<br>
			<span style="color:green; font-size: 100px;">Welcome <%=userName %></span>
		</div>
		<!----------- Footer ----------->
		<div style="height:8%; bottom:0; position:relative;">
			<%@include file="footer.html" %>
		</div>
	</body>
</html>