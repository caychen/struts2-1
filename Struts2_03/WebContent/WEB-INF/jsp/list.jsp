<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:debug>nameList</s:debug>
	<ul>
		<s:iterator value="nameList" var="name">
			<li><s:property value="name"/></li>
		</s:iterator>
	</ul>
	
	<hr />
	<s:iterator value="empList">
		<h1>
			<!-- <s:property value="name + ' ---- ' + salary" /> -->
			<s:property/> <!-- 表示栈顶元素Object，默认value为top，top值表示栈顶元素值 -->
		</h1>
	</s:iterator>
</body>
</html>