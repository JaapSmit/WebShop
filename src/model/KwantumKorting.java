package model;

public class KwantumKorting extends DefaultProduct {

	public KwantumKorting(String naam, int prijsPerEenheid, String imageUrl, int eenheid) {
		super(naam, prijsPerEenheid, imageUrl, eenheid);
	}
	
	public KwantumKorting(String naam, int prijsPerEenheid, String imageUrl) {
		super(naam, prijsPerEenheid, imageUrl);
	}

	@Override
	public int getPrijs(int hoeveelheid) {
		return discount(super.getPrijs(hoeveelheid), hoeveelheid);
	}
	
	private int discount(int prijs, int hoeveelheid) {
		// every 1 item gives 5% discount until 30%
		if(hoeveelheid < 6) {
			double discount = (100-(hoeveelheid * 5))/100;
			prijs *= discount;
		} else {
			prijs *= 0.70;
		}
		return prijs;
	}
	
}
