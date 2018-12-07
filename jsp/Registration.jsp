<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
 <link rel="stylesheet" href="RegistrationStyle.css" media="screen" type="text/css" />
</head>
<body>
 <div class="registration-card">
    <h1>Registration</h1><br>
  <form>
   <input type="text" name="FullName" placeholder="Enter Full name " required>
    <input type="text" name="UserName" placeholder="Enter Username" required>
    <input type="password" name="Password" placeholder="Enter Password" required>
     <input type="password" name="ConfirmPassword" placeholder="Please confirm Password" required>
     <input type="text" name="MobileNumber" placeholder="Enter PhoneNo" required >
      <input type="text" name="Address" placeholder="Provide Address " required>
       <input type="text" name="Email-Id" placeholder="Enter valid email-id " required >
      
    <input type="submit" name="login" class="registration registration-submit" value="register">
  </form>
  <div class="registration-help">
    <a href="#">Already a member login please</a> 
  </div>
</div>
</body>
</html>