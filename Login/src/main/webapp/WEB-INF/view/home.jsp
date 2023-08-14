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
			<td rowspan=<%=user.getStudentDataResponses().size() %>><%=user.getDepartment() %></td>
			<td><a href="<%=request.getContextPath()%>/getId?id=<%=user.getStudentDataResponses().get(0).getStudentId() %>>"><%=user.getStudentDataResponses().get(0).getStudentId() %></a></td>
			<td><%=user.getStudentDataResponses().get(0).getMark() %></td>		
			<td rowspan=<%=user.getStudentDataResponses().size() %>><%=user.getPass() %></td>
		</tr>
		<% for(int i = 1; i < user.getStudentDataResponses().size(); i++) { %>
			<tr>
				<td><a href="<%=request.getContextPath()%>/getId?id=<%=user.getStudentDataResponses().get(i).getStudentId() %>>"><%=user.getStudentDataResponses().get(i).getStudentId() %></a></td>
				<td><%=user.getStudentDataResponses().get(i).getMark() %></td>		
			</tr>
		<% } %>
	<%} %>
	</tbody>
</table>

</html>