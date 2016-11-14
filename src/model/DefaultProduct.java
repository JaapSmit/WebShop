package model;

//standaardproduct
public class DefaultProduct extends Product {
	private String naam;
	private int prijs;
	private int eenheid;
	private int prijsPerEenheid;
	private String imageUrl;
	boolean toevoegbaar;
	
	public DefaultProduct(String naam, int prijsPerEenheid, String imageUrl, int eenheid) {
		super(naam, prijsPerEenheid, imageUrl, eenheid);
		this.naam = naam;
		this.prijsPerEenheid = prijsPerEenheid;
		this.imageUrl = imageUrl;
		this.eenheid = eenheid;
		this.toevoegbaar = true;
	}
	
	public DefaultProduct(String naam, int prijsPerEenheid, String imageUrl) {
		super(naam, prijsPerEenheid, imageUrl);
		this.naam = naam;
		this.prijsPerEenheid = prijsPerEenheid;
		this.imageUrl = imageUrl;
		this.eenheid = STUK;
		this.toevoegbaar = true;
	}
	
	@Override
	public String getNaam() { return naam;	}

	@Override
	int getEenheid() { return eenheid; }

	@Override
	public int getPrijsPerEenheid() { return prijsPerEenheid; }

	@Override
	public String getImageURL() { return imageUrl;	}
	
	@Override
	public boolean isToevoegbaar() {
		return toevoegbaar;
	}
}
