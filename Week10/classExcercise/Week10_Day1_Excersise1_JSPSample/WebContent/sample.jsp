<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Week10_Day1_Ex1</title>
	</head>
	<%!
		int count=0;
		void incrementCount(){
			count++;
		}
		String username = "sayaka";
		String password = "sayaka2";
	%>
	<body>
		<h1 style="margin-left:25%;">Sample Page</h1>
		<h2>
			<% 	
				int localVariable = 0;
				out.print("This page is viewed " + count + " times <br>");
				incrementCount();
			%>
		</h2>
		The value of the global value is 
 		<%=localVariable%>
 		<% localVariable++; %>
 		
 		<form METHOD="POST">
 			<input type="text" name="name" id="name" placeholder="Name"></input>
 			<input type="text" name="password" id="password" placeholder="Password"></input>
 			<input type="submit" value="Submit">
 		</form>
 		<%
 			if("POST".equalsIgnoreCase(request.getMethod()))
 			{
 				String typedUsername = request.getParameter("name");
 				String typedPassword = request.getParameter("password");
				
 				if(username.equals(typedUsername)){
 					out.print("Username is corect");
 				}else{
 					out.print("Username is NOT corect");
 				}
 			
 				if(password.equals(typedPassword)){
 					out.print("<br>Password is corect");
 				} else {
 					out.print("<br>Password is NOT corect");
 				}
 			}
 		%>
 		
 		<form METHOD="POST">
 			<input type="text" name="val1" placeholder="Value 1"></input>
 			<input type="text" name="symbol" placeholder="+,-,*,/" maxlength="1"></input>
 			<input type="text" name="val2" placeholder="Value 2"></input>
 			<input type="submit" name="calc" value="Calclate">
 		</form>
 		
 		<%			
			if(request.getParameter("calc")!=null){
				int val1 = Integer.parseInt(request.getParameter("val1"));
				int val2 = Integer.parseInt(request.getParameter("val2"));
				String choice = request.getParameter("symbol"); %>
				<h1>
				<%
					switch(choice) {
						case "+":
							out.print(val1 + val2);
							break;
						case "-":
							out.print(val1 - val2);
							break;
						case "*":
							out.print(val1 * val2);
							break;
						case "/":
							out.print(val1 / val2);
							break;
						default:
							break;
					}
				%>
				</h1>
				<%
			}	
 		 %>
	</body>
</html>