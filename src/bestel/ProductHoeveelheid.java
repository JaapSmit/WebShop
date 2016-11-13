package bestel;

import model.*;

public class ProductHoeveelheid {
	private Product p;
	private int hoeveelheid;
	
	ProductHoeveelheid(Product p, int hoeveelheid) {
		this.p = p;
		this.hoeveelheid = hoeveelheid;
	}
	
	public int getPrijs() {
		return p.getPrijs(hoeveelheid);
	}
	
	public void setHoeveelheid(int hoeveelheid) {
		if(hoeveelheid >= 0) {
			this.hoeveelheid = hoeveelheid;
		}
	}
	
	public int getHoeveelheid() {
		return hoeveelheid;
	}
	
}
