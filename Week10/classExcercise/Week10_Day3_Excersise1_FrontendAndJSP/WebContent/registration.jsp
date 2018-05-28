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
		if(request.getParameter("message")!=null){
			message = request.getParameter("message");
		}
	%>
	<body>
		<!----------- Header ----------->
		<div id = "main-header">
			<%@include file="header.html" %>
		</div>
		<!----------- Body ----------->
		<div id="content">
			<form action="Details.jsp" method="post">
				<%
					 if(message != null){
						out.print("<h6 class=\"error\">" + message + "</h6>");
					} 
				%>
				<label for="firstName">First Name </label><input type="text" name="firstName">
				<br/>
				<label for="lastName">Last Name </label><input type="text" name="lastName" />
				<br/>
				<label for="password">Password </label><input type="text" name="password" />
				<br/>
				<label for="userName">User Name </label><input type="text" name="userName" />
				<br/>
				<label for="gender">Gender</label><br/>
				<input type="radio"  name="gender" value="male" /> Male<br/>
				<input type="radio"  name="gender" value="female" /> Female<br/>
				
				<label for="hobbies">Hobbies</label><br/>
				<input type="checkbox" name="hobbies" value="Dance"> Dance<br>
				<input type="checkbox" name="hobbies" value="Music"> Music<br>
				<input type="checkbox" name="hobbies" value="Sports"> Sports<br>
				<input type="checkbox" name="hobbies" value="Painting"> Painting<br>			
				
				<b>Country</b><br/>
				<% String country[] = {"","United States","China","England","Japan"}; %>
				<select id="country" name="country">
					<%for(int i = 0; i < country.length ; i++){ %>
					    <option value="<%= i %>"><%= country[i] %></option>
					<%} %>
				</select>
				
				<br/>
				<input type ="submit" name="register" value="Register" />
						
			</form>
		</div>
		<!----------- Footer ----------->
		<div id="main-footer">
			<%@include file="footer.html" %>
		</div>
	</body>
</html>