<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<%
			String userName = null;
			if(session.getAttribute("userName")==null){
				response.sendRedirect("login.jsp");
			} else {
				userName = session.getAttribute("userName").toString();
			}
		%>
		<h1 style=margin-left:40%>Inbox</h1>
		<h3>Welcome &nbsp;<%=userName%></h3>
		<a href="sentItems.jsp">Sent Items</a>
		<br/>
		<a href="logout.jsp">Log Out</a>
	</body>
</html>