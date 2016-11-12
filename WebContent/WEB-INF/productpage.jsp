<%@ page import= "model.*" %>
<%@ page import= "java.util.*" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<% HashMap<String, Product> voorraadMap = (HashMap)request.getAttribute("voorraadMap"); %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<% String item = (String)request.getAttribute("item"); 
Product p = voorraadMap.get(item);
%>
<title> <%=p.getNaam()%> </title>
</head>
<body>
	<h1><%=p.getNaam()%></h1><br>
	<img src="<%=p.getImageURL() %>"><br>
	Prijs: <%=p.getPrijsPerEenheid() %>

</body>
</html>