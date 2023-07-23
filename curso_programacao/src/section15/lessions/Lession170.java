package section15.lessions;

import java.util.InputMismatchException;
import java.util.Scanner;

import util.Entry;

public class Lession170 {

	public static void main(String[] args) {

		Scanner scan = Entry.startScanner();
		
		try {
			
			String[] vect = scan.nextLine().split(" ");
			int position = scan.nextInt();
			System.out.println(vect[position]);
					
		} catch(ArrayIndexOutOfBoundsException e) {
		
			System.out.println("Invalid position!");
		
		} catch (InputMismatchException e) {
			
			System.out.println("Invalid value!");
			
		}
		
		System.out.println("End of program");
		
		Entry.closeScanner();
		
	}

}
