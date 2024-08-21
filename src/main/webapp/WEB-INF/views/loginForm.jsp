<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body alink="#0000ff">
	<p align="center" style="border-style: dotted; border-color: lime;">Login
		to see Best Deal's And Offers</p>
	<h2 align="center">Enter You'r Credentials</h2>

	<form:form action="loginEntity"  method="POST">

		<a style="font-style: italic;">UserName<input name="username" /></a>
		<br>
		<br>
		<a style="font-style: italic;"> Password: <input name="lastName" /></a>
		<br>
		<a style="align-self: center;">Login as</a>
		<br>

		<a style="font-style: italic;">user<input type="radio" name="post"
			value="user"></a>
		<a style="font-style: italic;">Admin<input type="radio"
			name="post" value="admin"></a>

		<br>
		<button type="submit">Login</button>



	</form:form>
	<p align="center">
		<big style="font-style: italic; left: auto;">don't have Account
		</big>
	</p>
	<h2 align="center">
		<a
			style="border-style: dotted; font-style: italic; align-content: center; align-self: center;"
			href="createEntity"><font size="45"></font> Create Account</a>
	</h2>

</body>
</html>
