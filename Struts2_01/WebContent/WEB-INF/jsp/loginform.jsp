<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>用户登录</h1>
	<form action="login.action" method="post">
		<table>
			<tr>
				<td>用户名</td>
				<td><input name="user" /></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="password" name="pwd" /></td>
			</tr>
		</table>
		<input type="submit" value="提交" />
		<span style="color:red;">${errMsg }</span>
	</form>
</body>
</html>