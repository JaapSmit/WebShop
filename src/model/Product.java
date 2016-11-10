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
	abstract String getNaam();
	
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

// standaardproduct
class DefaultProduct extends Product {
	private String naam;
	private int prijs;
	private int eenheid;
	private int prijsPerEenheid;
	private String imageUrl;
	
	DefaultProduct(String naam, int prijsPerEenheid, String imageUrl, int eenheid) {
		super(naam, prijsPerEenheid, imageUrl, eenheid);
		this.naam = naam;
		this.prijsPerEenheid = prijsPerEenheid;
		this.imageUrl = imageUrl;
		this.eenheid = eenheid;
	}
	
	DefaultProduct(String naam, int prijsPerEenheid, String imageUrl) {
		super(naam, prijsPerEenheid, imageUrl);
		this.eenheid = STUK;
	}
	
	@Override
	String getNaam() { return naam;	}

	@Override
	int getEenheid() { return eenheid; }

	@Override
	int getPrijsPerEenheid() { return prijsPerEenheid; }

	@Override
	String getImageURL() { return imageUrl;	}
	
	@Override
	void addToWinkelwagen() {
		// maybe a further implement
	}
}

class KwantumKorting extends DefaultProduct {

	KwantumKorting(String naam, int prijsPerEenheid, String imageUrl, int eenheid) {
		super(naam, prijsPerEenheid, imageUrl, eenheid);
	}
	
	KwantumKorting(String naam, int prijsPerEenheid, String imageUrl) {
		super(naam, prijsPerEenheid, imageUrl);
	}

	@Override
	public int getPrijs(int hoeveelheid) {
		return super.getPrijs(hoeveelheid) - discount(hoeveelheid);
	}
	
	private int discount(int hoeveelheid) {
		return (int)Math.pow((double)(hoeveelheid * getPrijsPerEenheid()), 2)/300;
	}
	
}

class Beperkt extends DefaultProduct {
	private boolean alInWinkelwagen = false;
	Beperkt(String naam, int prijsPerEenheid, String imageUrl, int eenheid) {
		super(naam, prijsPerEenheid, imageUrl, eenheid);
	}
	
	Beperkt(String naam, int prijsPerEenheid, String imageUrl) {
		super(naam, prijsPerEenheid, imageUrl);
	}
	
	@Override
	void addToWinkelwagen() {
		if(alInWinkelwagen == false) {
			super.addToWinkelwagen();
			alInWinkelwagen = true;
			// Disable the add knop
		}		
	}
}
