package section10.lessions;

import java.util.Scanner;

import section10.entities.Product;
import util.Entry;

public class Lession89 {

	public static void main(String[] args) {

		Scanner scan = Entry.startScanner();
		
		int n = scan.nextInt();
		Product[] vect = new Product[n];
			
		for(int i = 0; i < vect.length; i++) {
			scan.nextLine();
			
			String name = scan.nextLine();
			double price = scan.nextDouble();
			
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n",avg);
		
		Entry.closeScanner();
				
	}

}
