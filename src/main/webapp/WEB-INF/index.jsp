<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
</head>

<body>

	<h1 style="color:red"><c:out value="${error}"/></h1>
	
	<h1>¿ Cual es el Codigo ?</h1><hr>
	    
   <form method="POST" action="/codigo">
    	
    	<label>Ingrese Codigo: <input type="text" name="codigo"></label>    	
    	<button>Ingresar</button>
    	
    	
   	</form>	

</body>
</html>