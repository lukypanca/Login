<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<script type="text/javascript" src="js/jquery-1.7.2.js"></script>
<script type="text/javascript" src="js/jquery.validate.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$('#formlogin').validate({
			rules:{
				userId:{
					required:true
				},
				password:{
					required:true
		}
			}
		})
	});
</script>
</head>
<body>
<form method="post" action="users" id="formlogin">
	<table cellpadding="2" cellspacing="2">
		<tr>
			<td>User ID</td>
			<td><input type="text" name="userId"></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="text" name="password"></td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td><input type="submit" value="Save"></td>
	</table>
</form>
	
</body>
</html>