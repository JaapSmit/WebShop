package web;

import java.io.IOException;
import java.util.HashMap;
import bestel.Winkelwagen;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Product;

@WebServlet("/Product")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static HashMap<String, Product> voorraadMap = Index.voorraadMap;
	public static Winkelwagen winkelwagen = new Winkelwagen();
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = request.getQueryString();
		url = url.substring(url.indexOf("=")+1);
		
		request.setAttribute("voorraadMap", voorraadMap);
		request.setAttribute("item", url);
		
		request.getRequestDispatcher("/WEB-INF/productpage.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String product = (String)request.getParameter("product");
		int hoeveelheid = Integer.parseInt(request.getParameter("hoeveelheid"));
		winkelwagen.bestel(voorraadMap.get(product), hoeveelheid);
		System.out.println(winkelwagen);
		//response.sendRedirect("Product?id="+product);
		response.sendRedirect("index");
	}

}
