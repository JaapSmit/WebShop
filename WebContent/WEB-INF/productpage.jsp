<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="stylesheet.css">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title> ${voorraadMap[item].naam} </title>
</head>
<body id="mainbody">
	<div id="mainblock">
	<div id="title">
		<h1>${voorraadMap[item].naam}</h1>
	</div>
	<div id="containerMiddle">
		<div id="leftBlock">
			<img src="${voorraadMap[item].imageURL}">
		</div>
		<div id="rightBlock">
			<form action="" method="post">
				<input type="hidden" name="product" value="${voorraadMap[item].naam}">
				<input type="number" name="hoeveelheid"> <br>
				<input type="submit" value="Bestel" >
			</form>
		</div>
	</div>
	<div id="footer">
		<footer>
			Elke dag is een beun dag
		</footer>
	</div>
</div>

</body>
</html>