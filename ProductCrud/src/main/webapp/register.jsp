<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="register" method="post">
	Name: <input type="text" name="name" id="nm"><br>
     email: <input type="email" name="email" id="email"><br>
     user name: <input type="text" name="uname" id="unm"><br>
     password: <input type="password" name="pass" id="pass"><br>
     Confirm password: <input type="password" name="pass" id="pass"><br>
     Gender: <input type="radio" name="gender" id="male" value="male">
     <label for="male">Male</label>
     <input type="radio" name="gender" id="female" value="female">
     <label for="male">Female</label><br>
      <button type="submit" name="btn" id="btn">Login</button>
	</form>

</body>
</html>