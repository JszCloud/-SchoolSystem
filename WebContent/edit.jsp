<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改</title>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0-beta/css/bootstrap.min.css">
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container w-100" style="height: 800px;">
		<form action="EditServlet" method="post">
		
		  <div class="form-group">
		    <label for="studentno">studentno:</label>
		    <input type="text" name="studentno" value="${list.studentno }" class="form-control" id="studentno" required="required" pattern="[0-9]{4,}">

		    <label for="loginpwd">loginpwd:</label>
		    <input type="password" name="loginpwd" value="${list.loginpwd }" class="form-control" id="loginpwd" required="required" pattern="([0-9]|[a-z]|[A-Z]){6,}">

		    <label for="studentname">studentname:</label>
		    <input type="text" name="studentname" value="${list.studentname }" class="form-control" id="studentname" required="required">

		    <label for="gradeid">gradeid:</label>
		    <input type="number" name="gradeid" value="${list.gradeid }" class="form-control" id="gradeid" required="required">

		    <label for="phone">phone:</label>
		    <input type="tel" name="phone" value="${list.phone }" class="form-control" id="phone" required="required" pattern="(\d{3,4}\)|\d{3,4}-|\s)?\d{7,14}">
	
		    <label for="address">address:</label>
		    <input type="text" name="address" value="${list.address }" class="form-control" id="address" required="required">
		
		    <label for="borndate">borndate:</label>
		    <input type="date" name="borndate" value="${list.borndate }" class="form-control" id="borndate" required="required">

		    <label for="email">email:</label>
		    <input type="email" name="email" value="${list.email }" class="form-control" id="email" required="required">
		    
		    <label for="identitycard">identitycard:</label>
		    <input type="text" name="identitycard" value="${list.identitycard }" class="form-control" id="identitycard" required="required">
		    
		  </div>
		  <div class="form-group">
		    <label >
		    	男:
		    	<input type="radio" checked="checked" class="form-control" name="sex" value="1">
		    </label>
		    <label >
		    	女:
		    	<input type="radio" class="form-control" name="sex" value="0">
		    </label>
		   </div>
		  <button type="submit" class="btn btn-primary">保存</button>
		  <button type="reset" class="btn btn-primary">取消</button>
		</form>
	
	</div>
</body>
</html>