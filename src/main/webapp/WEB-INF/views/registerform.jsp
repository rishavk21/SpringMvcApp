<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
	<Form action="processRegistration" method="post">
		User Name <input type="text" name="uname" /> <Br /> 
		City <input type="text" name="city" /> <Br /> 
		Code <input type="text" name="code" /> <Br /> 
		Password <input type="password" name="pwd" /> <Br /> 
		<Input type="Submit" value="Register Me" />
	</Form>
	
	<!-- Show all the user registered in table format -->
</body>
</html>