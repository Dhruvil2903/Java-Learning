<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	<form action="login" method = "post">
		<div>
			<div>
				<label for = "username" >UserName : </label><br>
				<input type = "text" id = "name" class = "name" required placeholder="Enter the username">			
			</div>
			
			<div>
				<label for = "password" >Password : </label><br>
				<input type = "password" id = "password" class = "password" required placeholder="Enter the password"> 
			</div>
			<div>
				<input type = "button" value = "Login">
			</div>
		</div>
	</form>
	
	
	
</body>
</html>