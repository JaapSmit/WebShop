package web;

import java.io.IOException;
import java.util.HashMap;
import bestel.Winkelwagen;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Product;

@WebServlet("/Product")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static HashMap<String, Product> voorraadMap = Index.voorraadMap;
	//public static Winkelwagen winkelwagen = new Winkelwagen();
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Url afhandeling
		String url = request.getQueryString();
		url = url.substring(url.indexOf("=")+1);
		if(url.endsWith("Error")) {
			request.setAttribute("error", "error");
			url = url.substring(0, url.length()-5);
		} else {
			request.setAttribute("error", "none");
		}
		request.setAttribute("voorraadMap", voorraadMap);
		request.setAttribute("item", url);
		
		request.getRequestDispatcher("/WEB-INF/productpage.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String product = (String)request.getParameter("product");
		int hoeveelheid = Integer.parseInt(request.getParameter("hoeveelheid"));
		
		if(hoeveelheid <= 0) {
			response.sendRedirect("Product?id="+product+"Error");
		} else {
			//winkelwagen.bestel(voorraadMap.get(product), hoeveelheid);
			((Winkelwagen)session.getAttribute("winkelwagen")).bestel(voorraadMap.get(product), hoeveelheid);
			response.sendRedirect("index");
		}	
		
	}

}
