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
	static {
		voorraad.add(new DefaultProduct("Cilinderkop", 52, "cilinderKop.jpg"));
		voorraad.add(new DefaultProduct("Achterbrug", 43, "achterbrug.jpg"));
		voorraad.add(new Beperkt("Kentekenplaat", 17, "kentekenplaat.jpg"));
		voorraad.add(new KwantumKorting("Olie", 8, "olie.png", 3));
	}
	
	static HashMap<String, Product> voorraadMap;
	static{
		voorraadMap = new HashMap<String, Product>();
		for(Product p : voorraad) {
			voorraadMap.put(p.getNaam(), p);
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		if(session == null) {
			Winkelwagen winkelwagen = new Winkelwagen();
			session = request.getSession();
			session.setAttribute("winkelwagen", winkelwagen);
			request.setAttribute("winkelwagen", winkelwagen);
			System.out.println("New session");
			System.out.println(winkelwagen);
		} else {
			session = request.getSession();
			request.setAttribute("winkelwagen", session.getAttribute("winkelwagen"));
			System.out.println("Old session");
		}
		// Hier voor kan dus de logica van de site komen
				
		request.setAttribute("voorraad", voorraad);
		// Hier tussen komen alle request.setAttributes
		
		// Deze site roept de jsp aan die de html genereert
		request.getRequestDispatcher("/WEB-INF/frontpage.jsp").forward(request, response);
	}


}
