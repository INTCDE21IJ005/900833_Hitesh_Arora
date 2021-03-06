<%@page import="java.net.http.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/register.css" rel="stylesheet">
<title>Create Customer</title>
<style>
#message
{
	color : red; 
}
input::-webkit-outer-spin-button,
input::-webkit-inner-spin-button {
  -webkit-appearance: none;
  margin: 0;
}

/* Firefox */
input[type=number] {
  -moz-appearance: textfield;
}
body {
			margin: 0;
			font-family: sans-serif;
			color:white;
			background: rgb(2,0,36);
			background: radial-gradient(circle, rgba(2,0,36,1) 0%, rgba(200,191,14,1) 46%, rgba(0,212,255,1) 96%);
			
	}
	.footer {
opacity:0.6;
   position: fixed;
   left: 0;
   bottom: 0;
   width: 100%;
   background-color: blue;
   color: white;
   text-align: center;
}
</style>
</head>
<body>
<div class="footer">

  <p><i>Created By CTS Interns POD-2 INTCDE21IJ005</i></p>
	 </div>
<img src="/Realestates/Files/Logo HB.jpg" alt="logo" width="100" height="100">
<div align="center">
		
		
	<%
		
		if (session.getAttribute("token") == null) {
	%>
	<c:redirect url="/403" />
	<%
		}
	%>
<br><br>
         <!-- <h1 style="font-weight: bold">HAKAR Bank</h1> -->
	<div id="login-box">
    <div class="card  " style="width: 480px;height:630px; background: rgb(0, 0, 0); /* Fallback color */
  					background: rgba(0, 0, 0, 0.5); /* Black background with 0.5 opacity */
  					color: #f1f1f1;">
  					<br>
    <h2 class="signup" style="color:white;">Customer Sign up</h2>
    <br><br>
    <form:form action="/finishedCustomerCreation" method="post" modelAttribute="customer">
    
	    <label for="userid">Enter Customer Id:</label><span class="required" style="color: red;"> *</span><br>
	    <form:input type="text" class="form-control form-rounded" path="userid" name="Id" placeholder="Enter CUSTOMER ID" autocomplete="off" required="required"/>
	   
		<label for="username">Enter Username:</label><span class="required" style="color: red;"> *</span><br>
	    <form:input type="text" class="form-control form-rounded" path="username" name="username" placeholder="Enter Username" autocomplete="off" required="required"/>
	    
		<label for="password">Enter Password:</label><span class="required" style="color: red;"> *</span><br>
		<form:input type="password" class="form-control form-rounded" path="password" name="password" placeholder="Enter Password" required="required"/>
	    
		<label for="dateOfBirth">Enter Date Of Birth:</label><span class="required" style="color: red;"> *</span><br>
		<form:input type="date" class="form-control form-rounded" id="date" path="dateOfBirth" name="dob" placeholder="Date of Birth"/>

		<label for="pan">Enter Pan Number: </label><span class="required" style="color: red;">*</span><br>
		<form:input type="text" class="form-control form-rounded" path="pan" name="pan" placeholder="Pan Number" autocomplete="off" required="required"/>

		<label for="address">Enter Address</label><span class="required" style="color: red;"> *</span><br>
		<form:input type="text" class="form-control form-rounded" path="address" name="address" placeholder="Address" autocomplete="off" required="required"/>  
	    <input type="submit" name="signup_submit" value="Create" />
    
    </form:form>
	<p id="message">${msg }</p>
    </div>
    </div>   

</div>
</body>
</html>