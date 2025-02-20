<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<script>
    function togglePassword() {
        var passwordField = document.getElementById("password");
        var toggleIcon = document.getElementById("togglePasswordIcon");
        if (passwordField.type === "password") {
            passwordField.type = "text";
            toggleIcon.innerHTML = "Hide";
        } else {
            passwordField.type = "password";
            toggleIcon.innerHTML = "Show";
        }
    }
</script>
</head>
<body alink="#0000ff">
	<p align="center" style="border-style: dotted; border-color: lime;">
		Login to see Best Deal's And Offers</p>
	<h2 align="center">Enter Your Credentials</h2>

	<form action="/Shop/loginEntity" method="POST">
		<table align="center">
			<tr>
				<td>ID:</td>
				<td><input name="id" value="${id}" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" id="password" name="password"
					value="${password}" />
					<button type="button" onclick="togglePassword()"
						id="togglePasswordIcon">Show</button></td>
			</tr>
			<tr>
				<td>Login as:</td>
				<td><label>User</label> <input type="radio" name="post"
					value="user" /> <label>Admin</label> <input type="radio"
					name="post" value="admin" /></td>
			</tr>
			<tr>
				<td> <input type="hidden" name="productId"  readonly="readonly" value="${productId}"> </td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<button type="submit">Login</button>
				</td>
			</tr>
			
		</table>
	</form>

	<br>
	<h2 style="font-style: italic;">${message}</h2>

	<br>
	<p align="center">
		<big style="font-style: italic;">Don't have an account?</big>
	</p>
	<h2 align="center">
		<a style="border-style: dotted; font-style: italic;"
			href="user/createEntity"> Create Account </a>
	</h2>
	<p align="center">
		<big style="font-style: italic; color: red; font-size: x-large;">
			Only new users can register </big>
	</p>
</body>
</html>
