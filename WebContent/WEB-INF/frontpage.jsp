<%@ page import= "java.util.*" %>
<%@ page import= "model.*" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!--  <link rel="stylesheet" href="stylesheet.css"> -->
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
			orem ipsum dolor sit amet, consectetur adipiscing elit. Nullam et fermentum augue. Sed convallis felis at purus accumsan porta. Ut gravida convallis erat sed bibendum. Morbi hendrerit, velit vitae laoreet varius, tortor libero dignissim leo, eu placerat lectus orci nec nibh. Praesent viverra libero leo, nec dapibus lorem suscipit sed. Aliquam laoreet dapibus ante, a fringilla ipsum fringilla at. Praesent mattis nec nunc nec pulvinar. Cras erat mauris, aliquam vitae accumsan a, commodo eu nulla. Vivamus feugiat turpis nec libero dignissim semper. Fusce et elit non erat varius tincidunt eu nec augue. Sed eu mauris laoreet, ullamcorper nunc ut, ornare felis. Pellentesque ut turpis vel massa lobortis tempus non id est. Ut id dictum massa.

			Vestibulum risus turpis, commodo ac malesuada et, condimentum sed arcu. Suspendisse massa diam, aliquam sed ex id, iaculis facilisis ex. Fusce imperdiet nunc pretium, semper leo eu, faucibus nisi. Nulla sollicitudin sem a nulla blandit aliquet. Nunc placerat imperdiet ex. Integer viverra dui nunc, et cursus enim lacinia ut. Nunc ultricies gravida nunc, sed sagittis nulla sagittis non. Cras eu odio libero. Maecenas nunc erat, tempus ac augue sit amet, malesuada euismod lorem. Pellentesque eget quam a ante fermentum fringilla. Etiam euismod odio in nunc interdum, ut pulvinar eros malesuada.

			Praesent molestie posuere malesuada. Praesent cursus neque ac sem porta, auctor facilisis tellus placerat. In tristique, mauris in volutpat mattis, erat felis sodales sapien, vitae auctor risus nisl quis velit. Morbi elementum quis nisi vitae viverra. Phasellus ultricies erat id metus ultricies, vitae dictum nisi hendrerit. Vivamus convallis, neque sed facilisis finibus, sapien libero ullamcorper dolor, eget luctus lorem diam ultricies risus. Cras a justo convallis, sagittis elit sit amet, sodales est. Proin viverra facilisis odio, ac euismod dui scelerisque id. Nam varius, lorem non scelerisque laoreet, mi ligula euismod purus, eu facilisis ligula felis nec est. Donec dictum ante turpis, ut dignissim nisi lacinia in. Integer vehicula, turpis sed mattis elementum, eros turpis fermentum quam, eu blandit purus dolor consequat ante. Cras at urna odio.

			In feugiat mollis erat, ut gravida odio mollis ut. Maecenas ex nibh, consequat et ultricies in, sagittis ac dui. Curabitur commodo maximus erat a sodales. Maecenas risus lorem, porttitor nec justo quis, dapibus accumsan quam. Praesent mollis iaculis nisi eu fringilla. Nulla efficitur aliquet tincidunt. In imperdiet commodo lectus, a convallis augue volutpat eu. Sed bibendum lectus sed eros imperdiet, ac lobortis est suscipit. Suspendisse suscipit dictum ante eget porta. Vivamus mollis lorem pulvinar turpis luctus tempor. Phasellus tincidunt in ipsum a fringilla. Fusce dignissim in ligula ut mattis. Mauris accumsan ante arcu, non facilisis augue faucibus at.
	
			Suspendisse pulvinar est vitae neque maximus, porta auctor lectus rhoncus. Proin faucibus nulla eget urna vehicula vulputate. Nam ullamcorper tincidunt leo placerat volutpat. Nunc euismod at ligula vel laoreet. Morbi id iaculis mi. Maecenas maximus bibendum lacus vitae tincidunt. Praesent commodo, lorem et ultrices consectetur, est mi faucibus nulla, id ullamcorper mi neque nec massa. Pellentesque elementum varius nisi id iaculis. Fusce suscipit tincidunt interdum. Nunc iaculis justo at neque pulvinar laoreet. Praesent neque lectus, faucibus quis lorem ut, vestibulum fringilla odio. Mauris suscipit dapibus nunc vel sagittis. Morbi justo lorem, pharetra vel egestas eu, suscipit non arcu. Duis purus odio, elementum quis ullamcorper ac, sodales vitae ipsum.
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