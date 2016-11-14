package bestel;

import model.*;
import java.util.*;

public class Voorraad {
	static private HashMap<Product, Integer> voorraadMap = new HashMap<>();
	
	private Product product;
	private int hoeveelheid;
	
	
	
	Voorraad(Product p, int hoeveelheid) {
		this.product = p;
		this.hoeveelheid = hoeveelheid;
		voorraadMap.put(p, hoeveelheid);
	}
	
	public int getHoeveelheid() {
		return hoeveelheid;
	}
	
	public int getVoorraad() {
		return voorraadMap.get(product);
	}
	
}
