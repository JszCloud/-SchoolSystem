<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0-beta/css/bootstrap.min.css">
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container w-70">
		<table class="table table-striped table-bordered table-hover ">
			<thead >
				<tr class="table-info">
					<td>学号</td>
					<td>姓名</td>
					<td>性别</td>
					<td>手机</td>
					<td>生日</td>
					<td>操作</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list }" var="obj">
					<tr>
						<td>${ obj.studentno}</td>
						<td>${ obj.studentname}</td>
						<td>${ obj.sex?"男":"女"}</td>
						<td>${ obj.phone}</td>
						<td>
							<fmt:formatDate value="${ obj.borndate}" pattern="yyyy-MM-dd"/>	
						</td>
						<td>
							<a href="DetilsServlet?stuNo=${obj.studentno }">详情</a>
							<a href="EditServlet?stuNo=${obj.studentno }">编辑</a>
							<a href="RemoveServlet?stuNo=${obj.studentno }">删除</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>