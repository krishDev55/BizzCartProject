
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admin</title>
</head>
<body bgcolor="skyblue">
	<h3 align="center" dir="ltr" style="azimuth: grad;">Welcome Admin
		${admin.username}</h3>
		<h4>product list without coursor</h4>
		<c:out value="${productList}"></c:out>
	<table style="border-style: dotted;" bgcolor="#a8a8a8" align="center"
		border="1">
		
		<tr>
			<th>Product Id</th>
			<th>Product Name</th>
			<th>Product Description</th>
		</tr>
		<c:forEach items="${productList}" var="product">
			<tr>
				<td><c:out value="${product.product_id}"></c:out></td>
				<td><c:out value="${product.product_name}"></c:out></td>
				<td><c:out value="${product.description}"></c:out></td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>
