package edu.txstate.internet.cyberflix;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.txstate.internet.cyberflix.data.db.Cart;
import edu.txstate.internet.cyberflix.data.db.CartManager;
import edu.txstate.internet.cyberflix.data.db.DAO;
import edu.txstate.internet.cyberflix.data.db.FilmDAO;
import edu.txstate.internet.cyberflix.data.film.Film;
import edu.txstate.internet.cyberflix.data.film.FilmCategory;
import edu.txstate.internet.cyberflix.data.film.Film.FilmRating;
import edu.txstate.internet.cyberflix.data.helper.FilmFactory;

/**
 * Servlet implementation class CyberFlixAddServlet
 */
@WebServlet("/CyberFlixAddServlet")
public class CyberFlixAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CyberFlixAddServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		}
	
	


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		FilmDAO f = new FilmDAO();	
		CartManager manager = CartManager.getInstance();
		String filmID = (String)request.getParameter("film_id");
		System.out.println("the requested film id is: " + filmID);
		
		HttpSession session = request.getSession(false);
		int id = (int) session.getAttribute("userID");
		//Cart cart = new Cart(id, session);
		Cart cart = manager.getCart(session);
		
		
		Film filmToAdd = f.findFilmByID(filmID);
		cart.addToCart(filmToAdd);
		System.out.println("# items in cart: " + cart.getTotalItems());
		int cartSize = cart.getTotalItems();
		
		session.setAttribute("Cart", cart);
		session.setAttribute("cartSize", cartSize);
		
		request.getRequestDispatcher("splashPage.jsp").forward(request, response);
		
	}
}
