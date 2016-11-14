package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Kassa
 */
@WebServlet("/Kassa")
public class Kassa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if(session.getAttribute("error") == null) {
			// eerste keer
			request.setAttribute("firsttime", "yes");
		} else {
			// tweede keer
			request.setAttribute("firsttime", "no");
			request.setAttribute("error", session.getAttribute("error"));
		}
		request.getRequestDispatcher("/WEB-INF/kassapage.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String straatnaam = (String)request.getParameter("straatnaam");
		String nummer = (String)request.getParameter("nummer");
		String postcode = (String)request.getParameter("postcode");
		String error = "";
		if(straatnaam.isEmpty()) {
			error = "Vul een geldige straatnaam in";
		} else if(nummer.isEmpty()) {
			error = "Vul een geldig huisnummer in";
		} else if(postcode.isEmpty()) {
			error = "Vul een geldige postcode in";
		}
		HttpSession session = request.getSession();
		session.setAttribute("error", error);
		response.sendRedirect("Kassa");
	}

}
