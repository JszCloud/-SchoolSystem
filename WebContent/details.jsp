<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>详细信息</title>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0-beta/css/bootstrap.min.css">
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container w-100" style="height: 100%;">
	  <div class="row">
	    <div class="col-sm-2 " style="height: 60px">
	    <h4>学号</h4>
	    </div>
	    <div class="col-sm-10" style="height: 60px">
	    ${list.studentno}
	    </div>
	  </div>
	  
	  <div class="row">
	    <div class="col-sm-2 " style="height: 60px">
	    <h4>姓名</h4>
	    </div>
	    <div class="col-sm-10" style="height: 60px">
	   ${list.studentname}
	    </div>
	  </div>
	  <div class="row">
	    <div class="col-sm-2 " style="height: 60px">
	    <h4>密码</h4>
	    </div>
	    <div class="col-sm-10" style="height: 60px">
	   ${list.loginpwd}
	    </div>
	  </div>
	  <div class="row">
	    <div class="col-sm-2 " style="height: 60px">
	    <h4>性别</h4>
	    </div>
	    <div class="col-sm-10" style="height: 60px">
	    ${list.sex?"男":"女"}
	    </div>
	  </div>
	  <div class="row">
	    <div class="col-sm-2 " style="height: 60px">
	    <h4>电话号码</h4></div>
	    <div class="col-sm-10" style="height: 60px">
	    ${list.phone}
	    </div>
	  </div>
	  <div class="row">
	    <div class="col-sm-2 " style="height: 60px">
	    <h4>生日</h4></div>
	    <div class="col-sm-10" style="height: 60px">
	    <fmt:formatDate value="${list.borndate}" pattern="yyyy-MM-dd"/>
	    </div>
	  </div>
	  <div class="row">
	    <div class="col-sm-2 " style="height: 60px">
	    <h4>家庭住址</h4></div>
	    <div class="col-sm-10" style="height: 60px">
	    ${list.address}
	    </div>
	  </div>
	  <div class="row">
	    <div class="col-sm-2 " style="height: 60px">
	    <h4>身份证号</h4></div>
	    <div class="col-sm-10" style="height: 60px">
	    ${list.identitycard}
	    </div>
	  </div>
	  <div class="row">
	    <div class="col-sm-2 " style="height: 60px">
	    <h4>邮箱</h4></div>
	    <div class="col-sm-10" style="height: 60px">
	    ${list.email}
	    </div>
	  </div>
	  <div class="row">
	    <div class="col-sm-2 " style="height: 60px">
	    <h4>班级编号</h4></div>
	    <div class="col-sm-10" style="height: 60px">
	    ${list.gradeid}
	    </div>
	  </div>
	  
	  
	</div>

</body>
</html>