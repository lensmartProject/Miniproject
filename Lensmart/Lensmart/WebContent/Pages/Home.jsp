<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style >
.header {
  background-color: #f1f1f1;
  padding: 30px;
  text-align: center;
  font-size: 35px;
}
</style>
</head>
<body>
<div class="header">
<h1><a href="#"><span><img src="Logo.png" alt="specs" style="width:500px;height:130px;"></span></a></h1>
<nav>
			<a href="Products.jsp">Home</a>
			<a href="Login.jsp">Login</a>
			<a href="Registration.jsp">Register</a>
			<a href="#">Cart</a>
			<a href="Contact.html">Contact</a>
			
			</nav>

	</div>


<jsp:include page="Slider.html" />  
</body>
</html>