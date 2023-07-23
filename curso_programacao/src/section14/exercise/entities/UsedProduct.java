package section14.exercise.entities;

import java.util.Date;

import util.DateUtils;

public class UsedProduct extends Product {

	private Date manufactureDate;
	
	public UsedProduct() {
		
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {

		return name 
				+ " (used) $ " 
				+ String.format("%.2f",price)  
				+  " (Manufacture date: " 
				+ DateUtils.dateFormat(manufactureDate) + ")";
	
	}
	
}
