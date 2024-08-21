<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body bgcolor="skyblue">
	<h3 align="center" dir="ltr" style="azimuth: grad;">Welcome    ${use.username}</h3>
	<h2 align="center">Check the information is perfect </h2>
	<br>
	
	<h3>  Name  	 :   ${use.username} </h3>
	
	<h3>  Id   	     :   ${use.user_id} </h3>
	
	<h3>  email      :   ${use.email} </h3>

	<h3>  Date of birth   :   ${use.birth_d} </h3>

	<b> Want to modify   <a href="updateuser/${use.user_id}"></a> update</b>
</body>
</html>
