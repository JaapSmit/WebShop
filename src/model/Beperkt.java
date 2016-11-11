package model;

public class Beperkt extends DefaultProduct {
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
