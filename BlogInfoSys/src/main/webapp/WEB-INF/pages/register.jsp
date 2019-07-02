<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>注册信息</h1>
	<form action="addUserInfo.action" method="post" enctype="multipart/form-data"> 
	       用户名：
		     <input name="userName" /><br>
	       密&nbsp;&nbsp;码：
		    <input name="userPwd" /><br> 年龄：<input name="userAge" /><br> 
                   性别：
			<input name="userSex" type="radio" value="男" />男<br> 
			<input name="userSex" type="radio" value="女" />女<br>
	          头像： 
			<input name="header" type="file" /><br> 
			<input type="submit" value="添加" />
			&nbsp;&nbsp;&nbsp;&nbsp;
		 	<input type="reset" value="重置">
	</form>
</body>
</html>