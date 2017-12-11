package edu.txstate.internet.cyberflix.data.db;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import edu.txstate.internet.cyberflix.*;
import edu.txstate.internet.cyberflix.data.film.FilmCatalog;

import javax.servlet.http.HttpSession;

public class CartManager implements Serializable{
	
	public ArrayList<Cart> carts = new ArrayList<Cart>();
	private static CartManager instance;
	
	public static CartManager getInstance () {
		if (instance == null) {
			instance = new CartManager();
		}
		return instance;
	}
	
	public boolean isEmpty()
	{
		boolean empty;
		if(this.carts.size() <= 0)
			empty = true;
		else
			empty = false;
		return empty;
	}
	
	public void addCart(Cart cart)
	{
		System.out.println("Adding Cart!" + cart);
		this.carts.add(cart);
		System.out.println("Added!");
	}
	
	public List<Cart> getCarts()
	{
		return this.carts;
	}
	
	public Cart getCart(HttpSession sessionID)
	{
		for(int i = 0; i < carts.size(); i++)
		{
			if(carts.get(i).getSessionID() == sessionID)
			{
				return carts.get(i);
			}
		}
		return null;
	}
}
