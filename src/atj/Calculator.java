package atj;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculator
 */
@WebServlet(description = "kalkulator", urlPatterns = { "/Calculator" })
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		Double value1=Double.parseDouble(request.getParameter("value1"));
		Double value2=Double.parseDouble(request.getParameter("value2"));
		switch(request.getParameter("oper"))
		{
		case "+":
			response.getWriter().println("Wynik: "+(value1+value2));
			break;
		case "-":
			response.getWriter().println("Wynik: "+(value1-value2));
			break;
		case "*":
			response.getWriter().println("Wynik: "+(value1*value2));
			break;
		case "/":
			response.getWriter().println("Wynik: "+(value1/value2));
			break;
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
