<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String contextPath = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="<%=contextPath%>/static/css/homepage.css" />
</head>
<body class="homepage">
	<h1>${name},Welcome!</h1>
	<form action="upload" method="post" enctype="multipart/form-data">
		<input type="file" name="file" /><br />
		<button type="submit">提交</button>
	</form>
	<div>${msg }</div>
	<img alt="picture"
		src="${ uploadFile }">
</body>
</html>