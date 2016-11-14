package bestel;

import model.*;
import java.util.*;

public class Winkelwagen {
	private ArrayList<ProductHoeveelheid> bestelregels = new ArrayList<>();
	
	public void bestel(Product p, int hoeveelheid) {
		// hier kan ik een check functie toevoegen
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
	
	public int getSize(){
		return bestelregels.size();
	}
	
	public ArrayList<ProductHoeveelheid> getInhoud() {
		return bestelregels;
	}
}
