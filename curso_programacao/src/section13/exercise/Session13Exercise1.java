package section13.exercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import section13.exercise.entities.Client;
import section13.exercise.entities.Order;
import section13.exercise.entities.OrderItem;
import section13.exercise.entities.Product;
import section13.exercise.entities.enums.OrderStatus;
import util.Entry;

public class Session13Exercise1 {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner scan = Entry.startScanner();
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String clientName = scan.nextLine();
		System.out.print("Email: ");
		String clientEmail = scan.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String clientBirthDate = scan.nextLine();
		
		Client client = new Client(clientName, clientEmail, sdf.parse(clientBirthDate));
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String orderStatus = scan.nextLine();
		
		Order order = new Order(new Date(), OrderStatus.valueOf(orderStatus), client);
		
		System.out.print("How many items to this order? ");
		int quantOrderItems = scan.nextInt();
		
		for (int i  = 1; i <= quantOrderItems; i++ ) {
			
			scan.nextLine();
			System.out.print("Product name: ");
			String nameProduct = scan.nextLine();
			System.out.print("Product price: ");
			double price = scan.nextDouble();
			System.out.print("Quantity: ");
			int quantityProd = scan.nextInt();
			
			order.addItem(new OrderItem(quantityProd, new Product(nameProduct, price)));
			
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY");
		System.out.println(order);
		
		Entry.closeScanner();
		
	}

}
