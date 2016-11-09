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
	Product(String naam, int prijsPerEenheid, String imageUrl, int eenheid) {
		/*this(naam, prijsPerEenheid, imageUrl);
		setEenheid(eenheid);*/
	};
	
	// drie parameter constructor
	Product(String naam, int prijsPerEenheid, String imageUrl){
	/*	setNaam(naam);
		setPrijsPerEenheid(prijsPerEenheid);
		setImageURL(imageUrl);
		setEenheid(STUK);*/
	};
	
	// korte naam van het product
	abstract String getNaam();
	//abstract void setNaam(String naam);
	
	// de prijs van voor een bestelling van de gegeven hoeveelheid 
	abstract int getPrijs(int hoeveelheid);
	
	// de eenheid waarin het product wordt verkocht
	abstract int getEenheid();
	//abstract void setEenheid(int eenheid);
	
	// de prijs per eenheid voor dit product
	abstract int getPrijsPerEenheid();
	//abstract void setPrijsPerEenheid(int prijsPerEenheid);
	
	// de URL voor een afbeelding om het product te tonen
	abstract String getImageURL();
	//abstract void setImageURL(String imageUrl);
	
	public String toString(){
		return getNaam() + getEenheid() + getPrijs();
	}
	
	// Return getPrijsPerEenheid, geen idee wat deze meer geeft dan de abstract method
	public double getPrijs(){
		return getPrijsPerEenheid();
	}
}

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
	int getPrijs(int hoeveelheid) { return prijs; }

	@Override
	int getEenheid() { return eenheid; }

	@Override
	int getPrijsPerEenheid() { return prijsPerEenheid; }

	@Override
	String getImageURL() { return imageUrl;	}
}
