<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${sessin_user!=null}">
		<a href="${pageContext.request.contextPath }/blogType/gotoAdd.action" style="position: fixed;right: 20px;top:20px; background-color: #eee"  >写博客</a>
	</c:if> 
	<div>
		<h3>博文内容</h3>
		<p>标题：${bgInfo. blogTitle}</p>
		<p>点击率：${bgInfo. blogClickCount}</p>
		<p>
			日期：
			<fmt:formatDate value="${bgInfo. blogDate}" pattern="yyyy-MM-dd" />
		</p>
		<p>分类：${bgInfo.blogType.blogTypeName }</p>
		<p>
			文章内容：<br>${bgInfo.blogText }</p>
	</div>
	<hr>
	<div>
		<h3>文章作者信息</h3>
		<p>
			作者的头像:<img
				src="${pageContext.request.contextPath }${bgInfo.blogType.userInfo.userImg }"
				width="70" />
		</p>
		<P>姓名:${bgInfo.blogType.userInfo.userName }</P>
		<P>年龄:${bgInfo.blogType.userInfo.userAge }</P>
		<P>性别:${bgInfo.blogType.userInfo.userSex }</P>
		<P>
			出生日期:
			<fmt:formatDate value="${bgInfo.blogType.userInfo.userDate }"
				pattern="yyyy-MM-dd" />
		</P>
	</div>
	<hr>
	<div>
		<h3>文章作者所拥有的分类列表</h3>
		<c:forEach items="${bgType }" var="mp">
			<p><a href="#">${mp.blogTypeName }</a><label>(${mp.blogTypeCount})</label></p>
		</c:forEach>
	</div>
	
</body>
</html>