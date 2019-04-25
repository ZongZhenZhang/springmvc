<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String contextPath = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>标题</h1>
	<table border="1">
		<thead>
			<tr align="center" bgcolor="blue">
				<td width="200px">用户名</td>
				<td width="300px">邮箱</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${ page.datas}" var="item">
				<tr>
					<td>${ item.username }</td>
					<td>${ item.mail}}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br/>
	<a href="<%=contextPath%>/user/list?start=${next}&limit=10">下一页</a>

	<script type="text/javascript">
	</script>
</body>
</html>