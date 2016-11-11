package model;

public class KwantumKorting extends DefaultProduct {

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
