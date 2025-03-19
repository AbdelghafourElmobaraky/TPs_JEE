package web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/bonjour")
public class PremiereServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.print("<!DOCTYPE html>");
		out.print("<html><body>");
		out.print("<head>");
		out.print("<title>Example</title>");
		out.print("</head>");
		out.print("<body");
		out.print("<p> C'est ma premiere servlet !</p>");
		out.print("</body>");
		out.print("</html>");
	}

}
