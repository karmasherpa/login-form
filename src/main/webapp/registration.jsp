<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Registration page</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>

<body>
<div class="container">
	
  <h2>Registration form</h2>
  
  <form action="registrationServlet" method="post">
    <div class="form-group">
      <label for="usrname">Username:</label>
      <input type="text" class="form-control" placeholder="Enter username" name="username">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" placeholder= "Enter password" name="password">
    </div>
     <div class="form-group">
      <label for="fullname">Full name:</label>
      <input type="text" class="form-control" placeholder= "Enter fullname" name="fullname">
    </div>
     <div class="form-group">
      <label for="email">Email:</label>
      <input type="text" class="form-control" placeholder= "Enter email" name="email">
    </div>
     <div class="form-group">
      <label for="gender">Gender:</label>
      <select name="gender" class="form-control">
      <option>Male</option>
       <option>Female</option>
       <option>Other</option>
      </select>
    </div>
    
    <button type="submit" class="btn btn-primary">Submit</button> 

   
  
  </form>
  <br> <p>OR</p>
   <a href="login.jsp"> <button type="submit" class="btn btn-primary">Sign in</button>
   </a>
    
</div>

</body>

</html>