<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户增删改查</title>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0-beta/css/bootstrap.min.css">
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container w-100" style="height: 800px;">
	  <div class="row">
	    <div class="col-sm-2 " style="height: 800px">
	    	<a href="SelectServlet" target="myFrame">浏览学生列表</a>
	    	<br/>
	    	<a href="add.jsp" target="myFrame">添加</a>
	    </div>
	    <div class="col-sm-10" style="height: 800px">
	    	<iframe name="myFrame" src="SelectServlet" scrolling="0" frameborder="0" style="width: 100%;height: 100%;margin: 0px;padding: 0px"></iframe>
	    </div>
	  </div>
	</div>
</body>
</html>