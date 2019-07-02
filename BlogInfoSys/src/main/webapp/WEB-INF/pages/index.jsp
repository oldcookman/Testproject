<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="../userInfo/gotoAdd.action">注册</a>
	<a href="../userInfo/gotoLogin.action">登录</a>
	<h1>热门文章列表</h1>
	<table border="1" width="900">
		<tr>
			<th>序号</th>
			<th>文章标题</th>
			<th>分类</th>
			<th>点击率</th>
			<th>作者</th>
		</tr>
		<c:forEach items="${BIList }" var="bgI" varStatus="i">
			<tr>
				<td>${i.count }</td>
				<td><a
					href="${pageContext.request.contextPath }/BlogInfo/DetailWithBlogInfo.action?blogInfoId=${bgI.blogInfoId}">${bgI.blogTitle }</a></td>
				<td>${bgI.blogType.blogTypeName }</td>
				<td>${bgI.blogClickCount }</td>
				<td>${bgI.blogType.userInfo.userName }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>