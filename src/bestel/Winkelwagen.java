package bestel;

import model.*;
import java.util.*;

public class Winkelwagen {
	private ArrayList<ProductHoeveelheid> bestelregels = new ArrayList<>();
	
	public void bestel(Product p, int hoeveelheid) {
		bestelregels.add(new ProductHoeveelheid(p, hoeveelheid));
	}
	
	public int getTotaalPrijs() {
		int totalPrice = 0;
		for(ProductHoeveelheid p : bestelregels) {
			totalPrice += p.getPrijs();
		}
		return totalPrice;
	}
	
	public String toString() {
		String bestelList = "";
		for(ProductHoeveelheid p : bestelregels) {
			bestelList += p.getNaam();
			bestelList += ", ";
		}
		return bestelList;
	}
	
	public int size(){
		return bestelregels.size();
	}
	
	public ArrayList<ProductHoeveelheid> getInhoud() {
		return bestelregels;
	}
}
