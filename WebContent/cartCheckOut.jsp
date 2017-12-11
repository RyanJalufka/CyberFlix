<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@page import="java.util.List, edu.txstate.internet.cyberflix.*, edu.txstate.internet.cyberflix.data.*"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" href="style.css">
	<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Cart Checkout</title>
</head>
<body>
	<h1><b>What's in your cart?</b></h1>
	<c:forEach items="${films }" var="film">
		<p>${film.title}</p>
	</c:forEach>
	
	</div>
</body>
</html>