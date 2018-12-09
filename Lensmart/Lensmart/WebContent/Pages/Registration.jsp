<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
 <link rel="stylesheet" href="RegistrationStyle.css" media="screen" type="text/css" />
</head>
<body>
 <form action="/Lensmart/registrationDetailServlet" method="post">
 <div class="registration-card">
    <h1>Registration</h1><br>
 
   <input type="text" name="fullname" placeholder="Enter Full name " required>
    <input type="text" name="username" placeholder="Enter Username" required>
    <input type="password" name="password" placeholder="Enter Password" required>
     <input type="password" name="confirmpassword" placeholder="Please confirm Password" required>
     <input type="text" name="mobilenumber" placeholder="Enter PhoneNo" required >
      <input type="text" name="address" placeholder="Provide Address " required>
       <input type="text" name="emailid" placeholder="Enter valid email-id " required >
      
    <input type="submit" name="login" class="registration registration-submit" value="register">
  </form>
  <div class="registration-help">
    <a href="Login.jsp">Already a member login please</a> 
    <button type="button" onclick="location.href='Home.jsp'" class="btn">Back to home</a></button>
  </div>
</div>
</body>
</html>