package section9.lessions;

import java.util.Scanner;

import section9.entities.Product;
import util.Entry;

public class Lession75 {

	public static void main(String[] args) {

		Scanner sc = Entry.startScanner();

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();

		Product product = new Product(name,price,quantity);

		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of product to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Product data: " + product);

		System.out.println();
		System.out.print("Enter the number of product to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Product data: " + product);
				
		Entry.closeScanner();
		
	}

}
