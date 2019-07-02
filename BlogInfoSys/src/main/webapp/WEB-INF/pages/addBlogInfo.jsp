<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="fm" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<fm:form modelAttribute="bi" method="post" action="${pageContext.request.contextPath }/BlogInfo/add.action">
	标题:
	<fm:input path="blogTitle"/><br>
	分类:
	<fm:select id="optionSelect" path="blogType.blogTypeId">
		<fm:option  value="-1">请选择</fm:option>
		<fm:options items="${blogTypes }" itemLabel="blogTypeName" itemValue="blogTypeId"/>
	</fm:select> <a href="javascript:openAddDLg()">添加分类</a> <br>
	<textarea rows="20" cols="60" name="blogText">
	</textarea><br>
	<input type="submit" value="添加">
	&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="reset" value="重置"/>
</fm:form> 
<style>
 	#addBlogtypeDlg{
 		position: absolute;left: 0;top: 0;
 		width: 100%;height: 100%;
 		background: rgba(0,0,0,0.6);
 		display: none;
 	}
 	#addBlogtypeDlg form{
 		width:200px;height:100px;
 		background:white;
 		position: absolute;left: 50%;top:50%;
 		margin-left: -100px;margin-top: -50px;
 		padding: 10px
 	}
</style>
<div id="addBlogtypeDlg">
	<form id="form">
		分类名称：<input id="blogTypeName" name="blogTypeName"/>
		<input type="button" value="添加" onclick="addAjax()"/>
		&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="button" value="关闭" onclick="closeBlogTypeDlg()"/>
	</form>
</div>
<script src="${pageContext.request.contextPath }/js/jquery-3.3.1.js"></script>
<script type="text/javascript">
	function addAjax() {
		var url="${pageContext.request.contextPath }/blogType/addBlogType.action";
		var params=$("#form").serialize();
		$.post(url,params,function(data){
			
			var html ="<option value='"+data.blogTypeId+"'>"+data.blogTypeName+"</option>"
			$("#optionSelect").append(html);
			$("#blogTypeName").val("");//清除文本框的值
			$("#optionSelect").val(data.blogTypeId);
			closeBlogTypeDlg();
			
		},"json")
	}
	
	

	

	function closeBlogTypeDlg() {
		document.getElementById("addBlogtypeDlg").style.display="none";
	}
	function openAddDLg(){
		document.getElementById("addBlogtypeDlg").style.display="block";
	}
	 
</script>
</body>
</html>