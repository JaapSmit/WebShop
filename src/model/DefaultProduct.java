package model;

//standaardproduct
public class DefaultProduct extends Product {
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
