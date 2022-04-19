<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Congratulations page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>


<h1>${message} </h1>

<div class="container">
  <h2>Student Information</h2>

  <table class="table">
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
  
 <h4>You have logged in successfully</h4>
 
    <a href="allRecord">Get all records</a>
    
</div>


</body>
</html>