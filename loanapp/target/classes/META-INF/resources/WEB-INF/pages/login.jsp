<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet"/>
<title>Login Page</title>
</head>
<body>
<h1> Login </h1>
<form action="loginsubmit">
	User Id : <input type="text" name="userid" placeholder="Enter User Id"/>
	User Password : <input type="password" name="pass" placeholder="Enter User Password"/>
	<div class="msg">${msg}</div>
	<input type="submit" value="Login"/>
</form>
<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>