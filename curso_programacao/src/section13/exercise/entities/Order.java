package section13.exercise.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import section13.exercise.entities.enums.OrderStatus;

public class Order {

	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	
	private OrderStatus status;
	
	private Client client;
	
	private List<OrderItem> orderItems = new ArrayList<>();
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append(client + "\n");
		sb.append("Order items: \n");
		for(OrderItem oi: orderItems) {
			sb.append(oi + "\n");
		}
		sb.append("Total price: $" + String.format("%.2f", total()));
		
		return sb.toString();
	}

	public Double total() {
		
		double total = 0.0;
		
		for(OrderItem oi : orderItems) {
			total += oi.getPrice();
		}
		
		return total;
	}
	
	public void addItem(OrderItem item) {
		
		this.orderItems.add(item);
		
	}

	public void removeItem(OrderItem item) {
		
		this.orderItems.remove(item);
		
	}
	
}
