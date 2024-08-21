<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Editor</title>
</head>
<body bgcolor="#faebd7">
	<h1 align="center">Welcome Editor ${editor.editor_id}</h1>

	<h1>
		<a href="createAdmin" style="font-style: italic; font-size: xx-large;">Add
			Admin</a>
	</h1>
	<h3>Admins</h3>
	<table bgcolor="#eead0e" align="center" border="1">
		<tr>
			<th>Admin Id</th>
			<th>Admin name</th>
			<th>Admin Mail</th>
			<th>Contact No</th>
		</tr>

		<c:forEach items="${adminList}" var="admin">
			<tr>
				<td><c:out value="${admin.admin_id}"></c:out></td>
				<td><c:out value="${admin.username}"></c:out></td>
				<td><c:out value="${admin.email}"></c:out></td>
				<td><c:out value="${admin.mobile_no}"></c:out></td>
				<td align="center"><a href="edit?id=${admin.admin_id}">Edit</a>
					| <a href="delete.html?id=${admin.admin_id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>
