

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
 <link rel="stylesheet" href="style.css" media="screen" type="text/css" />
</head>
<body>
<body>
 <form action="LoginDetailServlet" method="post">
  <div class="login-card">
    <h1>Log-in</h1><br>
 
    <input type="text" name="userName" placeholder="Username " >
    <input type="password" name="passWord" placeholder="Password">
    <input type="submit" name="login" class="login login-submit" value="login">

  </form>
  <div class="login-help">
    <a href="#">Register</a>  <a href="#">Forgot Password</a>
  </div>
</div>



</body>
</html>