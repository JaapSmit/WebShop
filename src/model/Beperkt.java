package model;

public class Beperkt extends DefaultProduct {
	
	public Beperkt(String naam, int prijsPerEenheid, String imageUrl, int eenheid) {
		super(naam, prijsPerEenheid, imageUrl, eenheid);
	}
	
	public Beperkt(String naam, int prijsPerEenheid, String imageUrl) {
		super(naam, prijsPerEenheid, imageUrl);
	}
	
	@Override
	public boolean isToevoegbaar() {
		if(super.isToevoegbaar()) {
			setToevoegbaar(false);
			return true;
		}
		return super.isToevoegbaar();
	}
	
	private void setToevoegbaar(boolean toevoegbaar) {
		super.toevoegbaar = toevoegbaar;
	}

}
