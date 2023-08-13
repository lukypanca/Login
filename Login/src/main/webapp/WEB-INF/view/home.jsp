<%@page import="response.UserResponse"%>
<%@page import="model.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Home</title>
</head>
<body>
	<% List<UserResponse> users = (List<UserResponse>)request.getAttribute("users"); %>
</body>

<table border="1" style="width: 50%" height="50%">
	<thead>
	<tr>
		<th>Department</th>
		<th>Student ID</th>
		<th>Marks</th>
		<th>Pass</th>
	</tr>
	</thead>
	<tbody>
	<% for(UserResponse user : users){ %>
	<tr>
		<td><%=user.getDepartment() %></td>
		<td><a href="<%=request.getContextPath()%>/getId?id=<%=user.getStudentId() %>"><%=user.getStudentId() %></a></td>
		<td><%=user.getMark() %></td>
		<td><%=user.getPass() %></td>
	</tr>
		<%} %>
	</tbody>
</table>

</html>