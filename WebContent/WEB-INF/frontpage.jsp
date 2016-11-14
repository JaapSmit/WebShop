<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" href="stylesheet.css">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TomosBeunShop</title>
</head>
<body id="mainbody">
<div id="mainblock">
	<div id="title">
		<h1>TomosBeunShop</h1>
		<h3>Goedkoop en lekker snel</h3> 
	</div>
	<div id="containerMiddle">
		<div id="leftBlock">
		
			<c:if test="${winkelwagen.size > 0}">
				<h3> Winkelwagen </h3>
				<table>
					<th> Product </th>
					<th> Hoeveelheid </th>
					<th> Prijs </th>
				<c:forEach items="${winkelwagen.inhoud}" var="p">
				
						<tr>
						<td>${p.naam}</td>
						<td>${p.hoeveelheid}</td>
						<td>${p.prijs} </td>
						</tr>
				</c:forEach>
				
				<tr>
					<td>Totaal<td>
					<td>${winkelwagen.totaalPrijs}</td>
				</tr>
				</table>
			
				<form action="Kassa"> 
				<input type="submit" value="afronden">
				</form>
			</c:if>
		</div>
		<div id="rightBlock">
			<nav>
				<h3>Producten:</h3>
				<ul>
					<!--  future links  --> 
					<c:forEach items="${voorraad}" var="p">
						<li><a href="Product?id=${p.naam}"> ${p.naam}</a></li>
					</c:forEach>
									
					
				</ul>
			</nav>
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