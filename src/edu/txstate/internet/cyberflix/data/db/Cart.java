package edu.txstate.internet.cyberflix.data.db;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import edu.txstate.internet.cyberflix.data.film.Film;
import edu.txstate.internet.cyberflix.CyberFlixLoginServlet;
import edu.txstate.internet.cyberflix.data.db.*;

public class Cart extends CartManager implements Serializable{
	
	//private String user;
	private HttpSession sessionID;
	private int userID;
	private ArrayList<Film> filmsInCart = new ArrayList<Film>();
	//private static Cart instance = null;
	//private String userEmail;
	
	
	public Cart(int userID, HttpSession sessionID) 
	{
		this.userID = userID;
		this.sessionID = sessionID;
	}
	
	public void addToCart(Film film)
	{
		filmsInCart.add(film);
	}
	
//	public String getUser()
//	{
//		return user;
//	}
	
	public int getUserID()
	{
		return userID;
	}
	
	public int getTotalItems()
	{
		return filmsInCart.size();
	}
	
	public void getCheckout()
	{
		for(int i=0; i < filmsInCart.size();i++) {
			System.out.println(filmsInCart);
			System.out.println();
		}
	}
	
	public ArrayList<Film> getFilmsInCart()
	{
		return this.filmsInCart;
	}
	
	public HttpSession getSessionID()
	{
		return sessionID;
	}
	
	
	public Film getFilmByIndex(int i)
	{
		Film film = filmsInCart.get(i);
		return film;
	}
}
