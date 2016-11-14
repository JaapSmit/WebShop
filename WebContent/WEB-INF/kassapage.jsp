<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="stylesheet.css">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body id="mainbody">
	<div id="mainblock">
	<h1> Adresgegevens en afrekenen </h1>
	<form action="" method="post">
		<c:if test="${firsttime eq 'yes'}">
			Straatnaam <input type="text" id="straatnaam" name="straatnaam"> Nummer <input id="nummer" type="number" name="nummer"> <br>
			Postcode <input type="text" name="postcode"> <br>
			<input type="submit" value="afronden">
		</c:if>
		<c:if test="${firsttime eq 'no'}">
			<c:if test="${error eq ''}">
				Succesvol afgerond, dank u wel.
			</c:if>
			<c:if test="${error ne ''}">
				${error} <br>
				Straatnaam <input id="straatnaam" type="text" name="straatnaam"> Nummer <input id="nummer" type="number" name="nummer"> <br>
				Postcode <input type="text" name="postcode"> <br>
				<input type="submit" value="afronden">	
			</c:if>
		</c:if>
		
	</form>
	</div>
</body>
</html>