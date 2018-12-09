<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<html lang="en">
<head>
<title>CSS Template</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {
  box-sizing: border-box;
}

body {
  font-family: Arial, Helvetica, sans-serif;
}

/* Style the header */
.header {
  background-color: #f1f1f1;
  padding: 30px;
  text-align: center;
  font-size: 35px;
}

/* Create three equal columns that floats next to each other */
.column {
  float: left;
  width: 33.33%;
  padding: 10px;
  height: 300px; /* Should be removed. Only for demonstration */
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}

/* Style the footer */
.footer {
  background-color: #f1f1f1;
  padding: 10px;
  text-align: center;
}
.button {
  background-color: #4CAF50;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}
/* Responsive layout - makes the three columns stack on top of each other instead of next to each other */
@media (max-width: 600px) {
  .column {
    width: 100%;
  }
}
</style>
<script>
function Redirect() {
    window.location.href="Addressform.jsp";
    }
</script>
</head>
<body>
<div class="header">
  <h2>Enjoy shopping with lensmart</h2>
</div>

<div class="row">
  <div class="column" style="background-color:#aaa;">HORN RIMMED GLASSES<img src="glasses3.png" style="width:100%">Price:450 only<br>
  <button>Add to cart</button><button onclick="Redirect();"/>Buy Now</button></div>
  
   <div class="column" style="background-color:#aaa;">Colorful transparent glasses<img src="glasses2.png" style="width:100%">Price:359 only<br>
  <button>Add to cart</button><button onclick="Redirect();">Buy Now</button></div>
   <div class="column" style="background-color:#aaa;">HIPSTER SQUARE GLASSES<img src="glasses3.png" style="width:100%">Price:799 only<br>
  <button>Add to cart</button><button onclick="Redirect();">Buy Now</button></div>
  
    <div class="column" style="background-color:#aaa;">HORN RIMMED GLASSES<img src="eyeglasses8.png" style="width:100%">Price:800 only<br>
  <button>Add to cart</button><button onclick="Redirect();">Buy Now</button></div>
   <div class="column" style="background-color:#aaa;">HORN RIMMED GLASSES<img src="glasses7.png" style="width:100%">Price:1000 only<br>
  <button>Add to cart</button><button onclick="Redirect();">Buy Now</button></div>
   <div class="column" style="background-color:#aaa;">HORN RIMMED GLASSES<img src="glasses9.png" style="width:100%">Price:3600 only<br>
  <button>Add to cart</button><button onclick="Redirect();">Buy Now</button></div>
   <div class="column" style="background-color:#aaa;">trendy EYEGLASSES<img src="glasses3.png" style="width:100%">Price:800 only<br>
  <button>Add to cart</button><button onclick="Redirect();">Buy Now</button></div>
   <div class="column" style="background-color:#aaa;">HORN RIMMED GLASSES<img src="glasses2.png" style="width:100%">Price:1000 only<br>
  <button>Add to cart</button><button onclick="Redirect();">Buy Now</button></div>
   <div class="column" style="background-color:#aaa;">HORN RIMMED GLASSES<img src="glasses3.png" style="width:100%">Price:3600 only<br>
  <button>Add to cart</button><button onclick="Redirect();">Buy Now</button></div>
</div>

<div class="footer">
  <p> <small>&copy; Copyright 2058, Lensmart Corporation</small></p>
</div>


</body>
</html>

</body>
</html>