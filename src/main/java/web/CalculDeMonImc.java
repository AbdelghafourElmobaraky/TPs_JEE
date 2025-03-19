package web;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/CalculDeMonImc")
public class CalculDeMonImc extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp); 
    }
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		String poidsParam = req.getParameter("poids");
		String tailleParam = req.getParameter("taille");
		Double poids = Double.parseDouble(poidsParam);
		Double taille = Double.parseDouble(tailleParam);
		IMC imc = new IMC(poids, taille);
		PrintWriter out = resp.getWriter();
		out.print("<!DOCTYPE html>");
		out.print("<html><body>");
		out.print("<head>");
		out.print("<title>IMC</title>");
		out.print("</head>");
		out.print("<body");
		out.print("<p>Poids = " + imc.getPoids() + " kg</p>");
		out.print("<p>Taille = " + imc.getTaille() + " m</p>");
			out.print("<p>Votre IMC est : = " + String.format("%.2f", imc.calcul()) + "</p>");
		out.print("</body>");
		out.print("</html>");
	}
	
}