<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Management</title>
</head>
<body>
<h1>Employee Data</h1>
<form:form action="employee.do" method="POST" commandName="employee">
	<table>
		<tr>
			<td>Employee ID</td>
			<td><form:input path="employee_no" /></td>
		</tr>
		<tr>
			<td>First name</td>
			<td><form:input path="first_name" /></td>
		</tr>
		<tr>
			<td>Last name</td>
			<td><form:input path="last_name" /></td>
		</tr>
		<tr>
			<td>Gender</td>
			<td><form:input path="gender" /></td>
		</tr>
		<tr>
			<td>Birth Date</td>
			<td><form:input path="birth_date" /></td>
		</tr>
		<tr>
			<td>Hire Date</td>
			<td><form:input path="hire_date" /></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" name="action" value="Add" />
				<input type="submit" name="action" value="Edit" />
				<input type="submit" name="action" value="Delete" />
				<input type="submit" name="action" value="Search" />
			</td>
		</tr>
	</table>
</form:form>
<br>
<table border="1">
	<tr>
		<th>ID</th>
		<th>First name</th>
		<th>Last name</th>
		<th>Gender</th>
		<th>Birth Date</th>
		<th>Hire Date</th>
	</tr>
	<c:forEach items="${employeeList}" var="employee">
		<tr>
			<td>${employee.employee_no}</td>
			<td>${employee.first_name}</td>
			<td>${employee.last_name}</td>
			<td>${employee.gender}</td>
			<td>${employee.birth_date}</td>
			<td>${employee.hire_date}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>