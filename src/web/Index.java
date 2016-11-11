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
	private ArrayList<Product> voorraad = new ArrayList<>();
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Hier voor kan dus de logica van de site komen
		voorraad.add(new DefaultProduct())
		// Hier tussen komen alle request.setAttributes
		
		// Deze site roept de jsp aan die de html genereert
		request.getRequestDispatcher("/WEB-INF/frontpage.jsp").forward(request, response);
	}


}
