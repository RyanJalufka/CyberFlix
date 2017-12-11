<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page language="java" session="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>  
<%@page import="java.util.List, java.util.ArrayList, edu.txstate.internet.cyberflix.data.film.*, 
edu.txstate.internet.cyberflix.data.db.*, java.sql.*, edu.txstate.internet.cyberflix.*"%>   
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="ISO-8859-1">
<title>Login to CyberFlix</title>

<!-- W3 Schools CSS -->
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

<!-- Google Fonts CSS -->
<link href="https://fonts.googleapis.com/css?family=Poiret+One" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">

</head>
<body>
<%
if(CyberFlixLoginServlet.isLogged == false)
{
%>
<h1 >Log in to CyberFlix!</h1>
<%
}
else
{
%>
<h1>Failed to log you in. Check email and password.</h1>
<%
}
%>

<form action="http://localhost:8080/CyberFlix1/CyberFlixLoginServlet" method="post">
  Email: <input type="email" name="email"><br>
  Password: <input type ="password" name= "password" size="20"><br>
  <input class="w3-button w3-blue w3-round-large" type="submit" value="Submit">
  </form>
</body>
</html>