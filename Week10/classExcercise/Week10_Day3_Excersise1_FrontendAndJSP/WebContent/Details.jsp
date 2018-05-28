<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Registration Details</title>
		<link rel="stylesheet" type="text/css" href="CSS/main.css">
	</head>
	<body>
		<!----------- Header ----------->
		<div id = "main-header">
			<%@include file="header.html" %>
		</div>
		<!----------- Body ----------->
		<div id="content">
		<%
			String message = "";
			String firstName = request.getParameter("firstName");
			String lastName = request.getParameter("lastName");
			String password = request.getParameter("password");
			String userName = request.getParameter("userName");
			String gender = request.getParameter("gender");
			String[] hobbies = request.getParameterValues("hobbies");
			String country = request.getParameter("country");
			String arrayHobbies ="";
			
			// session.setAttribute("firstname", firstname);
	
			if(firstName.isEmpty()) {
				message = "First Name+";;
			} 
			if (lastName.isEmpty()){
				message += "Last Name+";
			} 
			if (password.isEmpty()){
				message += "Password+";
			} 
			if (userName.isEmpty()){
				message += "User Name+";
			} 
			if (gender == null){
				message += "Gender+";
			} 
			if (hobbies == null){
				message += "Hobbies+";
			} else {
				for(String h : hobbies) {
					if(h != null){
						arrayHobbies += h + ", ";
					}
				}
			}
			if (country == ""){
				message += "Country";
			} 
			
			if(message != ""){
				String temp = "";
				
				for(int i = 0; i < message.length(); i++){
					if(message.charAt(i) == '+'){
						temp += ", ";
					}else{
						temp += message.charAt(i);
					}
						
				}
				message = temp;
			}
	
		%>
		<% if(!firstName.isEmpty() && !lastName.isEmpty() && !password.isEmpty() && !userName.isEmpty() && gender != null && hobbies != null && country != null){ %>
		<div>Registration Details</div>
		<table>
			<tr>
				<td>First name</td>
				<td><%= firstName %></td>
			</tr>
			<tr>
				<td>Last name</td>
				<td><%= lastName %></td>
			</tr>		
			<tr>
				<td>User Name</td>
				<td><%= userName %></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><%= gender %></td>
			</tr>
			<tr>
				<td>Hobbies</td>
				<td><%= arrayHobbies %></td>
			</tr>
			<tr>
				<td>Country</td>
				<td><%= country %></td>
			</tr>
		</table>
		<%  }else{
				message += " cannot be null";
				response.sendRedirect("registration.jsp?message=" + message);
		   } 
		%>
		</div>
		<!----------- Footer ----------->
		<div id="main-footer">
			<%@include file="footer.html" %>
		</div>	
	</body>
</html>