<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body bgcolor="#98f5ff">
	<h3 align="center" dir="ltr" style="border-bottom-style azimuth: grad;">Enter
		You'r Values Carefully</h3>
	<form:form cssStyle="" action="loginEntity" method="POST">
		<form:label cssStyle="" path="id">ID  :</form:label>
		<form:input path="id"  />
		<form:label path="password">Password  :</form:label>
		<form:input path="id"  />

	</form:form>
	<br>

	<h3>Name : ${use.username}</h3>

	<h3>Id : ${use.user_id}</h3>

	<h3>email : ${use.email}</h3>

	<h3>Date of birth : ${use.birth_d}</h3>

	<b> Want to modify <a href="updateuser/${use.user_id}"></a> update
	</b>
</body>
</html>
