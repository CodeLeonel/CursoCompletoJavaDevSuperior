package section14.exercise;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import section14.exercise.entities.ImportedProduct;
import section14.exercise.entities.Product;
import section14.exercise.entities.UsedProduct;
import util.DateUtils;
import util.Entry;

public class Session14Exercise1 {

	public static void main(String[] args) throws ParseException {

		Scanner scan = Entry.startScanner();
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int numberProducts = scan.nextInt();
		
		for(int i = 1; i <= numberProducts; i++) {
			
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char typeProduct = scan.next().charAt(0);
			scan.nextLine();
			System.out.print("Name: ");
			String name = scan.nextLine();
			System.out.print("Price: ");
			double price = scan.nextDouble();
			scan.nextLine();
			
			if(typeProduct == 'c') {
				
				list.add(new Product(name, price));
				
			} else if(typeProduct == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = scan.nextDouble();
				scan.nextLine();
			
				list.add(new ImportedProduct(name, price, customsFee));
				
			} else if (typeProduct == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = DateUtils.dateParse(scan.nextLine());
				
				list.add(new UsedProduct(name, price, manufactureDate));
				
			}
			
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for(Product prod: list) {
			
			System.out.println(prod.priceTag());
			
		}
		
		
		Entry.closeScanner();
		
	}

}
