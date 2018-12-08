

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
 <form action="/Lensmart/loginDetailServlet" method="post">
  <div class="login-card">
    <h1>Log-in</h1><br>
 
    <input type="text" name="userName" placeholder="Username " >
    <input type="text" name="passWord" placeholder="Password">
    <input type="submit" name="login" class="login login-submit" value="login">
<a href="Registration.jsp" >&nbsp &nbsp &nbsp  Don't have an account? Sign Up</a>
  </form>
  
</div>



</body>
</html>