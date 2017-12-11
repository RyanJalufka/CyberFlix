package edu.txstate.internet.cyberflix;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CyberFlixLogoutSerlet
 */
@WebServlet("/CyberFlixLogoutServlet")
public class CyberFlixLogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CyberFlixLogoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// gets the current session, but does not create a new one if none exist.
		HttpSession session = request.getSession(false);
		
		// destroys the session to log out user.
		if(session!=null) {
			session.invalidate();
		}
		response.sendRedirect("splashPage.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// gets the current session, but does not create a new one if none exist.
		HttpSession session = request.getSession(false);
		
		// destroys the session to log out user.
		if(session!=null) {
			session.invalidate();
			session.setAttribute("isLogged", false);
		}
		response.sendRedirect("splashPage.jsp");
		
	}

}
