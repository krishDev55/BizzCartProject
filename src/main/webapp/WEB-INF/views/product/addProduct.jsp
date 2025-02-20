<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Product</title>
</head>
<body bgcolor="#808b96">
	<p align="center">Add Product</p>

	<h3 align="center">Enter Product Details</h3>

	<!-- Plain HTML form starts here -->
	<form action="http://localhost:8081/Shop/admin/addProduct" method="POST" enctype="multipart/form-data">
		<table align="center">
			<!-- Product ID -->
			<tr>
				<td><label for="product_id">Product ID :</label></td>
				<td><input type="text" id="product_id" name="product_id" value="${product.product_id}"required/></td>
			</tr>

			<!-- Product Name -->
			<tr>
				<td><label for="product_name">Product Name :</label></td>
				<td><input type="text" id="product_name" name="product_name"  value="${product.product_name}" required/></td>
			</tr>

			<!-- Description -->
			<tr>		
				<td><label for="description">Description :</label></td>
				<td><textarea id="description" name="description" value="${product.description}" ></textarea></td>
			</tr>
			<tr>
				<td><label for="product_prise">Product Price :</label></td>
				<td><input type="text" id="product_prise" name="product_prise"  value="${product.product_prise}" required/></td>
			</tr>
			
			<!-- Product Image -->
			<tr>
				<td><label for="image">Product Image :</label></td>
				<td><input type="file" id="image" name="image" required multiple/></td>
			</tr>

			<!-- Category Selection -->
			<tr>
				<td><label for="category_id">Category :</label></td>
				<td><select id="category_id" name="category_id">
						<option value="">Select a Category</option>
						<!-- Iterate over categories in the model (you need to populate this in your controller) -->
						<c:forEach var="cat" items="${categories}">
							<option value="${cat.category_id}">${cat.category_name}</option>
							  <!-- Hidden field to hold category name -->
                               <!--  <input type="hidden" id="category_Id" name="category_Id"/> -->
						</c:forEach>
						  <input type="hidden" id="category_Id" name="category_Id"/>
				</select></td>
			</tr>

			<!-- Submit Button -->
			<tr align="center">
				<td colspan="2"><input type="submit" value="Add Product" /></td>
			</tr>
		</table>
	</form>
</body>
</html>