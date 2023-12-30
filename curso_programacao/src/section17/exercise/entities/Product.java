package section17.exercise.entities;

public class Product {

	private String name;
	
	private Double price;
	
	private Integer quantity;
	
	public Product(String name, Double price, Integer quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return name + "," + totalPrice();
	}

	public Double totalPrice() {
		return price * quantity;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public Integer getQuantity() {
		return quantity;
	}
	
}
