<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Edited page</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>

<body>
<div class="container">
	
  <form action="updateServlet" method="post">
    <div class="form-group">
      <label for="usrname">Username:</label>
      <input type="hidden" class="form-control" name="username" value="${userDTO.username}">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" name="password" value="${userDTO.password}">
    </div>
     <div class="form-group">
      <label for="fullname">Full name:</label>
      <input type="text" class="form-control" name="fullname" value="${userDTO.fullname}">
    </div>
     <div class="form-group">
      <label for="email">Email:</label>
      <input type="text" class="form-control" name="email" value="${userDTO.email}">
    </div>
<!--      <div class="form-group"> -->
<!--       <label for="gender">Gender:</label><br> -->
<!--       <input type="radio" id="male" name="gender" value="Male"> -->
<!--   	  <label for="male">Male</label><br> -->
<!--   	  <input type="radio" id="female" name="gender" value="Female"> -->
<!--   	  <label for="female">Female</label><br> -->
<!--   	  <input type="radio" id="other" name="gender" value="Other"> -->
<!--   	  <label for="Other">Other</label> -->
<!-- 	</div> -->
	
	<div class="form-group">
				<label for="gender">Gender:</label>
				 <select id="gender" class="form-control"  name="gender" value="${userDTO.gender}">
				 <c:if test="${userDTO.gender =='male'}">
				  <option value="male" <c:out value='selected' />>Male</option>
				   </c:if>
				   <c:if test="${userDTO.gender =='female'}">
					<option value="female" <c:out value='selected' />>Female</option>
					</c:if>
					 <c:if test="${userDTO.gender =='other'}">
					<option value="other" <c:out value='selected' />>Other</option>
					</c:if>
				</select>
		</div>

    <button type="submit" class="btn btn-primary">Update</button>
    
  </form>
  
</div>

</body>
</html>