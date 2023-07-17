package section8.exercises;

import java.util.Scanner;

import section8.entities.Rectangle;
import util.Entry;
import util.Print;

public class Section8Exercise1 {

	public static void main(String[] args) {

		Print.line();
		
		Print.exercise(1);
		
		Scanner scan = Entry.startScanner();
		
		System.out.println("Enter rectangle and height: ");
		
		Rectangle rectangle = new Rectangle();
		
		rectangle.width = scan.nextDouble();
		rectangle.height = scan.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rectangle.area());

		System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
		
		System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());
				
		Entry.closeScanner();
		
		Print.line();
		
	}

}
