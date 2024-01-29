<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	welcome to shordan
	<form action="addAlien" ><!-- El método post hace que no se muestren nuestras variables en el url -->
		Enter id: <input type = "text" name = "aid" ><br>
		Enter name: <input type = "text" name = "aname" ><br>
		<input type = "submit">
	</form>
</body>
</html>