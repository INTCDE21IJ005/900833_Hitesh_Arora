<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="/css/style.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">

    <title>HAKAR Bank</title>
  <style>
    
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
    
    <div class="container">
    
     <form  action="/AboutUs" method="get">
                    <input type="button" class="button button1" value="About Us">
                    </form>
       
      <div class="row">
      
      
          <div class="col-md-6">
          <img src="/Realestates/Files/Logo HB.jpg" alt="logo" width="100" height="100">
              <div class="card">
               
                  <div class="box">
     
                    
                      <h1 style="color: aliceblue;"><b>HAKAR Bank Welcomes You!</b></h1>
                      <p class="text-muted"><i><b>A Proud History, A Strong Future Together</b></i> <br>
											Credits, Debits, Loans, Investments<br> We are always at your service!<br>
											As our name suggests, We never say no!
                      </p> 
                       <!-- Button trigger modal -->
                       <form  action="/customerlogin" method="get">
                    <input type="submit"  value="Customer Login" >
                    </form>
                    <form action="/employeelogin" method="get">
                    <input type="submit"  value="Employee Login" >
                    
                   
                  </form>
                  
              </div>
              </div>
          </div>
      </div>
  </div>
  

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>

  </body>
</html>