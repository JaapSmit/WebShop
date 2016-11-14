package web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import model.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bestel.Winkelwagen;

/**
 * Servlet implementation class Index
 */
@WebServlet("/index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static ArrayList<Product> voorraad = new ArrayList<>();
	
	// vul de voorraad met objecten
	static {
		voorraad.add(new DefaultProduct("Cilinderkop", 52, "cilinderKop.jpg"));
		voorraad.add(new DefaultProduct("Achterbrug", 43, "achterbrug.jpg"));
		voorraad.add(new Beperkt("Kentekenplaat", 17, "kentekenplaat.jpg"));
		voorraad.add(new KwantumKorting("Olie", 8, "olie.png", 3));
	}
	
	// Een manier om de namen van de producten te linken aan de producten
	static HashMap<String, Product> voorraadMap;
	static{
		voorraadMap = new HashMap<String, Product>();
		for(Product p : voorraad) {
			voorraadMap.put(p.getNaam(), p);
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// vraag of er al een sessie bestaat, zo niet. Maak een nieuwe aan en instansieer een nieuwe winkelwagen. Anders pak de oude (hier zitten nog wat bugs in).
		HttpSession session = request.getSession(false);
		if(session == null) {
			Winkelwagen winkelwagen = new Winkelwagen();
			session = request.getSession();
			session.setAttribute("winkelwagen", winkelwagen);
			request.setAttribute("winkelwagen", winkelwagen);
		} else {
			request.setAttribute("winkelwagen", session.getAttribute("winkelwagen"));
		}
		
		// Set het atribuut voorraad
		request.setAttribute("voorraad", voorraad);

		
		// Deze site roept de jsp aan die de html genereert
		request.getRequestDispatcher("/WEB-INF/frontpage.jsp").forward(request, response);
	}


}
