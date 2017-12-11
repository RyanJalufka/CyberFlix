package edu.txstate.internet.cyberflix;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.txstate.internet.cyberflix.data.db.Cart;
import edu.txstate.internet.cyberflix.data.db.CartManager;
import edu.txstate.internet.cyberflix.data.film.Film;

/**
 * Servlet implementation class CyberFlixCheckoutServlet
 */
@WebServlet("/CyberFlixCheckoutServlet")
public class CyberFlixCheckoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CyberFlixCheckoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CartManager manager = CartManager.getInstance();
		HttpSession session = request.getSession(false);
		Cart cart = manager.getCart(session);
		
		ArrayList<Film> films = cart.getFilmsInCart();
		System.out.println(films.get(1));
		
		request.setAttribute("cart", cart);
		request.setAttribute("films", films);
		
		request.getRequestDispatcher("cartCheckOut.jsp").forward(request, response);
		
	}

}
