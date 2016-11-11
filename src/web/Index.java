package web;

import java.io.IOException;
import java.util.ArrayList;

import model.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Index
 */
@WebServlet("/index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static ArrayList<Product> voorraad = new ArrayList<>();
	static {
		voorraad.add(new DefaultProduct("Cilinderkop", 52, "cilinderKop.jpg"));
		voorraad.add(new DefaultProduct("Achterbrug", 43, "achterbrug.png"));
		voorraad.add(new Beperkt("Kentekenplaat", 52, "kentekenplaat.jpg"));
		voorraad.add(new KwantumKorting("Olie", 52, "olie.png", 3));
	}
	
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Hier voor kan dus de logica van de site komen
				
		request.setAttribute("voorraad", voorraad);
		// Hier tussen komen alle request.setAttributes
		
		// Deze site roept de jsp aan die de html genereert
		request.getRequestDispatcher("/WEB-INF/frontpage.jsp").forward(request, response);
	}


}
