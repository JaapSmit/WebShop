<%@ page import= "java.util.*" %>
<%@ page import= "model.*" %>
<%@ page import= "bestel.*" %>


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
<% Winkelwagen winkelwagen = (Winkelwagen)request.getAttribute("winkelwagen"); %>
<div id="mainblock">
	<div id="title">
		<h1>TomosBeunShop</h1>
		<h3>Goedkoop en lekker snel</h3> 
	</div>
	<div id="containerMiddle">
		<div id="leftBlock">
			<% if(winkelwagen.size() > 0) { %>
				<h3> Winkelwagen </h3>
				<table>
					<th> Product </th>
					<th> Hoeveelheid </th>
					<th> Prijs </th>
				<% for(ProductHoeveelheid p : winkelwagen.getInhoud()) {%>
						<tr>
						<td><%= p.getNaam() %></td>
						<td><%= p.getHoeveelheid() %> </td>
						<td><%= p.getPrijs() %> </td>
						</tr>
				<% }%>
				<tr>
					<td>Totaal<td>
					<td><%= winkelwagen.getTotaalPrijs() %></td>
				</tr>
				</table>
			<% } %>
		<form action="Kassa"> 
		<input type="submit" value="afronden">
		</form>
		</div>
		<div id="rightBlock">
			<nav>
				<h3>Producten:</h3>
				<ul>
					<!--  future links  --> 
					<% ArrayList<Product> voorraad = (ArrayList)request.getAttribute("voorraad");
					for(Product p : voorraad) {
						%><li><a href="Product?id=<%=p.getNaam() %>"> <%= p.getNaam() %></a></li><%
					}
					
					%>
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