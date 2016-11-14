<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="" method="post">
		<% 
		String firsttime = (String)request.getAttribute("firsttime");
		if(firsttime.equals("yes")) { %>
		<c:if test="${firsttime eq 'yes'}"></c:if>
			Straatnaam <input type="text" name="straatnaam"> Nummer <input type="number" name="nummer"> <br>
			Postcode <input type="text" name="postcode"> <br>
			<input type="submit" value="afronden">
			<%
		} else {
			String error = (String)request.getAttribute("error");
			if(error.isEmpty()) { %>
				Succesvol afgerond, dank u wel.
			<% } else { %>
			<%= error %> <br>
				Straatnaam <input type="text" name="straatnaam"> Nummer <input type="number" name="nummer"> <br>
				Postcode <input type="text" name="postcode"> <br>
				<input type="submit" value="afronden">	
			<% }
		}%>
		
	</form>
</body>
</html>