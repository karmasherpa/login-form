<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
   <title>All users page</title>
   <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>

<body>
<div class="container">

<!-- <img src="congrat.jpeg" alt="image is not working" style="width:180px;height:80px;"> -->
<h2>Student Information</h2>

  <table class="table table-bordered">
    <thead>
      <tr bgcolor="skyblue">
        <th>Username</th>
        <th>Password</th>
        <th>Name</th>
        <th>Email</th>
        <th>Gender</th>
        <th colspan=2>(Delete/Edit)</th>
      </tr>
    </thead>
    <tbody>
    	<c:forEach items="${userList}" var ="user">
      <tr>
        <td>${user.username}</td>
        <td>${user.password}</td>
        <td>${user.fullname}</td>
        <td>${user.email}</td>
        <td>${user.gender}</td>
        <td><a href="deleteServlet?username=${user.username}"><button type="button" class="btn bt-primary"><img src="image/delete.png"></button></a>
        </td>
        <td><a href="editServlet?username=${user.username}"><button type="button" class="btn bt-primary"><img src="image/edit.png"></button></a>
        </td>
      </tr>
     	</c:forEach>
    </tbody>
  
  </table>
  
   <a href="registration.jsp"> <button type="button" class="btn btn-primary">Sign up</button>
   </a>
   <a href="login.jsp"> <button type="button" class="btn btn-primary">Sign in</button>
   </a>
     
</div>

</body>
</html>



