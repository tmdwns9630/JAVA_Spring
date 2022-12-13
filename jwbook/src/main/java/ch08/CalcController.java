package ch08;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcController
 */
@WebServlet("/calcControl")
public class CalcController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));
		@SuppressWarnings("unused")
		String op = request.getParameter("op");
		
		long result = 0;
		
		switch(request.getParameter("op")) {
			case "+" : result = n1+n2; break;
			case "-" : result = n1-n2; break;
			case "/" : result = n1/n2; break;
			case "*" : result = n1*n2; break;
		}
		request.setAttribute("result", result);
		getServletContext().getRequestDispatcher("/ch08/calcResult.jsp").forward(request, response);
		PrintWriter out = response.getWriter();
		out.append("<html><body><h2>계산기 서블릿 - Response</h2><hr>")
		.append("계사아아안 결과 : "+result+"</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
