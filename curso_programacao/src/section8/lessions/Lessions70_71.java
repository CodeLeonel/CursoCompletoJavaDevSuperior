package section8.lessions;

import java.util.Scanner;

import section8.util.Calculator;
import util.Entry;

public class Lessions70_71 {
	
	public static void main(String[] args) {
		
		Scanner scan = Entry.startScanner();
		
		System.out.println("Ener radius: ");
		double radius = scan.nextDouble();
		
		double c = Calculator.circumference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
				
		Entry.closeScanner();

	}
	
	

}
