package model;

public abstract class Product {
	// vier parameter constructor
	Product(String naam, int prijsPerEenheid, String imageUrl, int eenheid) {};
	
	// drie parameter constructor
	Product(String naam, int prijsPerEenheid, String imageUrl){};
	
	// korte naam van het product
	abstract String getNaam();
	
	// de prijs van voor een bestelling van de gegeven hoeveelheid 
	abstract int getPrijs(int hoeveelheid);
	
	// de eenheid waarin het product wordt verkocht
	abstract int getEenheid();
	
	// de prijs per eenheid voor dit product
	abstract int getPrijsPerEenheid();
	
	// de URL voor een afbeelding om het product te tonen
	abstract String getImageURL();
	
	public String toString(){
		return getNaam() + getEenheid() + getPrijs();
	}
	
	public double getPrijs(){
		return getEenheid() * getPrijsPerEenheid();
	}
}
