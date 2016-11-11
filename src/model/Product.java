package model;

import java.util.*;

public abstract class Product {
	static final int GRAM = 1;
	static final int KILO = 2;
	static final int LITERS = 3;
	static final int STUK = 4;
	static final int PAK = 5;
	static private HashMap<Integer, String> eenheden;
	static{
		eenheden = new HashMap<Integer, String>();
		eenheden.put(GRAM, "Gram");
		eenheden.put(KILO, "Kilo");
		eenheden.put(LITERS, "Liters");
		eenheden.put(STUK, "Stuk");
		eenheden.put(PAK, "Pak");
	}
	
	public final String getEenheidNaam() {
		return eenheden.get(getEenheid());
	}
	
	// vier parameter constructor
	Product(String naam, int prijsPerEenheid, String imageUrl, int eenheid) {};
	
	// drie parameter constructor
	Product(String naam, int prijsPerEenheid, String imageUrl){	};
	
	// korte naam van het product
	public abstract String getNaam();
	
	// de eenheid waarin het product wordt verkocht
	abstract int getEenheid();
	
	// de prijs per eenheid voor dit product
	abstract int getPrijsPerEenheid();
	
	// de URL voor een afbeelding om het product te tonen
	abstract String getImageURL();
	
	public String toString(){
		return getNaam() + getEenheid() + getPrijsPerEenheid();
	}
	
	// de prijs van voor een bestelling van de gegeven hoeveelheid 
	public int getPrijs(int hoeveelheid) {
		return hoeveelheid * getPrijsPerEenheid();
	}
	
	abstract void addToWinkelwagen(); //TODO: Implement
		
}
