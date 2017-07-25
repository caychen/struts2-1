<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s"  uri="/struts-tags"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="">
		Name:<input name="" value="${emp.name }"/><br/>
		Salary:<input name="" value="${emp.salary }"/><br/>
		Sex:
		<s:if test="emp.sex.equals('m')">
			<input type="radio" name="sex" value="m" checked="checked"/>Male
			<input type="radio" name="sex" value="f" />Female
		</s:if>
		<s:else>
			<input type="radio" name="sex" value="m" />Male
			<input type="radio" name="sex" value="f" checked="checked"/>Female
		</s:else>
	</form>
	
	<hr/>
	<s:form theme="simple">
		Name:<s:textfield name="emp.name"></s:textfield><br/>
		Salary:<s:textfield name="emp.salary"></s:textfield><br/>
		Sex:<s:radio list="sexOptions" name="emp.sex" ></s:radio><br/>
		Hobby:<s:checkboxlist list="TechOptions" name="emp.tech"></s:checkboxlist><br/>
		City:<s:select list="cities" name="emp.city"></s:select>
	</s:form>
</body>
</html>