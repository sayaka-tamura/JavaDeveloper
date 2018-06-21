<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "springwork.model.*" %>
<%@ page import = "java.util.List" %>
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "javax.servlet.http.*" %>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>History</title>
		
		<!-------------- CSS -------------->
		<spring:url value="/resources/CSS/function.css" var="functionCss" />
		<link href="${functionCss}" rel="stylesheet" />
	</head>
	<body>	
		<div id="container">
			<nav>
				<a href="topPage_user">Home</a> |
				<a href="IncomeExpense">Income / Expense</a> |
				<a href="History">History</a> |
				<a href="UserAccountPage">User Account</a> |
				<a href="logout">Logout</a>
			</nav>
			<div id="page_title">History</div>
				<!-- Message for Failed Delete an Item -->
				<% 	 
					 	if(session.getAttribute("success_delItem")!= null){%>
							<h3> <% 
											out.println(session.getAttribute("success_delItem"));
											session.removeAttribute("success_delItem");
										%>
							</h3>
						<% }
						if(session.getAttribute("Failed_delItem") != null) { %>
							<h3> <% 
											out.println(session.getAttribute("Failed_delItem")); 
											session.removeAttribute("Failed_delItem");
										%>
							</h3>
						<% }
				%>
			<div class="items">
				<table border="2" cellpadding="2">
					<thead>
						<tr>
					    <th>Item ID</th>
					    <th>Date</th> 
					    <th>Item Name</th>
					    <th>Price</th>
					    <th>Quantity</th>
					    <th>Category</th>
					    <th>Shopping ID</th>
					    <th>Edit</th>
					    <th>Delete</th>
					  </tr>
					</thead>								
					<tbody>
						<c:forEach var="item" items="${itemlist}">
						<tr>
							<td>${item.item_id}</td>
							<td><fmt:formatDate type='DATE' value='${item.item_date}' dateStyle='SHORT'/></td>
							<td>${item.item_name}</td>
							<td>${item.item_price}</td>
							<td>${item.item_quantity}</td>
							<td>${item.item_category}</td>
							<td>${item.item_shopping_id}</td>
							<td><a href="edit_item/${item.item_id}">Edit</a></td>
							<td><a href="delete_item/${item.item_id}">Delete</a></td>
							</tr>
							</c:forEach>
						<tr>
					</tbody>
				</table>
			</div>
		</div>
	</body>
</html>