<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Updated Record</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>



<div class="container">
<img alt="" src="img/roles.jpg" style="height: 100px; "> 
          
  <h4><b>Your records updated successfully</b></h4>
  
  <table class="table table-hover">
   
    <thead>
      <tr bgcolor="skyblue">
        <th>Username</th>
        <th>Password</th>
        <th>Name</th>
        <th>Email</th>
        <th>Gender</th>
     
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>${userDTO.username}</td>
        <td>${userDTO.password}</td>
        <td>${userDTO.fullname}</td>
        <td>${userDTO.email}</td>
        <td>${userDTO.gender}</td>
      </tr>
    </tbody>
  </table>
  
  <a href="allRecord">Get all updated records</a>
  
</div>

</body>
</html>