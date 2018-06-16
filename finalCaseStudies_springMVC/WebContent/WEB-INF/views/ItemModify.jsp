<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "springwork.model.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Edit Item</title>
	</head>
	<body>
		<% Item i= (Item) session.getAttribute("itemkey"); %>
		<div>Edit Item Record</div>
		<div class="container">
			<form action="/finalCaseStudies_springMVC/submit_edit_item" method="POST">
				<div class="sub_field">
					<div>Item ID :<%=i.getItem_id() %></div>		
				</div>
				<div class="sub_field">
					<label>Date</label>
					<input type="text" id="item_date" name="item_date" value=<%=i.getItem_date() %> />				
				</div>
				<div class="sub_field">
					<label>Item Name</label>
					<input type="text" id="item_name" name="item_name" value=<%=i.getItem_name() %> />				
				</div>
				<div class="sub_field">
					<label>Price</label>
					<input type="text" id="item_price" name="item_price" value=<%=i.getItem_price() %> />				
				</div>
				<div class="sub_field">
					<label>Quantity</label>
					<input type="text" id="item_quantity" name="item_quantity" value=<%=i.getItem_quantity() %> />				
				</div>
				<div class="sub_field">
					<label>Category</label>
					<input type="text" id="item_category" name="item_category" value=<%=i.getItem_category() %> />				
				</div>
				<div class="sub_field">
					<div>Shopping ID :<%=i.getItem_shopping_id() %></div>
				</div>

				<div class="btn">
					<input type="submit" name="submit" value="Edit" />
				</div>	
			</form>
		</div>
	</body>
</html>