<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="register" method="post">
		<div>
			<label>Username: </label> <input type="text" name="username" required>
		</div>
		<div>
			<label>Password: </label> <input type="password" name="password"
				required>
		</div>
		<div>
			<label>Email: </label> <input type="email" name="email" required>
		</div>
		<div>
			<input type="submit" value="Register">
		</div>
	</form>

</body>
</html>