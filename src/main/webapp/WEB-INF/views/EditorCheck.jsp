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
<body alink="#0000ff">
	<h1 align="center">Welcome Editor</h1>
	<h3 align="center">Enter You'r Values</h3>

	<form:form action="http://localhost:8081/Shop/editor/login"
		modelAttribute="editor" method="POST">

		<a style="font-style: italic; font-size: xx-large;">Id :<input
			name="id" value="${editor.editor_id}" /></a>
		<br>
		<br>
		<a style="font-style: italic; font-size: xx-large;">Passkey :<input
			name="passkey" value="${editor.passkey}" /></a>
		<br>
		<br>
		<button type="submit">Proceed</button>

	</form:form>
	<h3 align="center">${message }</h3>
</body>
</html>
