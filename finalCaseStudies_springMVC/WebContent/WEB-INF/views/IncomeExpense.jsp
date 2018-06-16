<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:useBean id="date" class="java.util.Date"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Input</title>
	</head>
	<body>
		<div>Input</div>
		<div class="container">
			<nav>
				<a href="topPage_user">Home</a> |
				<a href="IncomeExpense">Income / Expense</a> |
				<a href="History">History</a> | 
				<a href="UserAccountPage">User Account</a>
			</nav>
			<div id="expence">
				<!-- Message for Failed Log In -->
				<% 
					 String paramValue = request.getParameter("record_expense");
					 if (paramValue!=null){
						 	if(session.getAttribute("success_newEx")!= null){%>
								<h3> <% out.println(session.getAttribute("success_newEx")); %></h3>
							<% } else { %>
								<h3> <% out.println(session.getAttribute("Failed_addEx")); %></h3>
							<% }
					 }
				%>
				
				<form:form action="expense_form" method="POST" modelAttribute="itemkey">
				<form:errors path = "*" cssClass = "errorblock" element = "div" />
				  <div class="sub_field">
				    <label>Expense:</label><br />
				    $ <input type="number" class="input" name="item_price" step="0.01" placeholder="Price" /><br />
				  	<form:errors path="item_price" cssClass = "error" />
				  </div>
 				  <div class="sub_field">
				    <label>Date:</label><br />
				    <input type="text" path="item_date" class= "date" name = "item_date" placeholder="MM-dd-yyyy" value = "<fmt:formatDate value="${cForm.item_date}" pattern="MM-dd-yyyy" />"/>
				    <div>Please do not forget "-" between Month, date and year </div>
				  	<form:errors path="item_date" cssClass = "error" />
				  </div>
				  <div class="sub_field">
				    <label>Quantity:</label><br />
				    <input type="number" class="input" name="item_quantity" step="1" placeholder="Quantity" /><br />
				  	<form:errors path="item_quantity" cssClass = "error" />
				  </div>
				  <div class="sub_field">
				    <label>Category:</label><br />
				    <input type="radio" name="item_category" value = "Food" checked />Food<br>
					  <input type="radio" name="item_category" value = "Clothing" />Clothing<br>
					  <input type="radio" name="item_category" value = "Housing" />Housing<br>
					  <input type="radio" name="item_category" value = "Utilities" />Utilities<br>
					  <input type="radio" name="item_category" value = "Entertainment" />Entertainment<br>
					  <input type="radio" name="item_category" value = "Auto/Transportation" />Auto / Transportation<br>
					  <input type="radio" name="item_category" value = "Medical/Dental" />Medical / Dental<br>
					  <input type="radio" name="item_category" value = "Others" />Others<br>
				  </div>
				  <div class="sub_field">
				    <label>Description:</label><br />
				    <input type="text" class="input" name="item_name" size="20" /><br />
				  	<form:errors path="item_name" cssClass = "error" />
				  </div>
				   
				  <input type="submit" name="record_expense" value="Record" />
				</form:form>
			</div>
			
			<br/>
			<br/>
			
			<div id="income">
				<form id="income_form" action="#" method="POST">
				  <div class="row">
				    <label class="required" for="expence">Income:</label><br />
				    $ <input id="expence" class="input" name="expence" type="number" placeholder="price"/><br />
				  </div>
				  <div class="row">
				    <label class="required" for="input_description">Description:</label><br />
				    <input id="input_description" class="input" name="input_description" type="text" value="" size="30"/><br />
				  </div>
				  <div class="row">Bank Account <a href="#">Login</a></div>
				    
				  <input id="submit_button" type="submit" value="Record" />
				</form>
			</div>
		</div>
	</body>
</html>