<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User</title>
</head>
<body bgcolor="skyblue">
	<h3 align="center" dir="ltr" style="azimuth: grad;">Welcome
		${user.username}</h3>
	<h2 align="center">Thiss is just contaxdt us profile page dont take sireoud</h2>
	<br>

		style="stress: inherit; border-bottom: groove; border-top-color: buttontext; padding: pt; font-size: large;">
		Want to modify </b>
	<br>
	<a style="font-size: x-large;"
		href="user/forwardUserUpdate/${user.user_id}"> update</a>
	<br>
	<br>
	
	<br>
	<c:if test="${productId >=0}">
		<b
			style="stress: inherit; border-bottom: dotted;; border-top-color: buttontext; font-size: xx-large;">
			continue To buy Product <a href="user/bProduct/${productId}">Continue</a>
		</b>
	</c:if>
</body>
</html>
