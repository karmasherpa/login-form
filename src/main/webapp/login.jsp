<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Login page</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>

<body>

<div class="container">



  <h2>Login form</h2>
  <form action="loginServlet" method="post">
    <div class="form-group">
      <label for="usrname">Username:</label>
      <input type="text" class="form-control" placeholder="Enter username" name="username">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder= "Enter password" name="password">
    </div>
    
    <button type="submit" class="btn btn-primary">Sign in</button>
    <button type="reset" class="btn btn-success">Clear</button>
    
    <a href="registration.jsp"> <button type="button" class="btn btn-primary">Sign up</button>
    </a>
    	
  </form>
  <br>${message}
</div>


</body>
</html>