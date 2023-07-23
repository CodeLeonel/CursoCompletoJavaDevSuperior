package section15.lessions;

import java.util.InputMismatchException;
import java.util.Scanner;

import util.Entry;

public class Lession171 {

	public static void main(String[] args) {

		method1();

		System.out.println("End of program");
		
	}
	
	public static void method1() {

		System.out.println("***METHOD1 START***");
		
		method2();
		
		System.out.println("***METHOD1 END***");
	
	}
	
	public static void method2() {
		
		System.out.println("***METHOD2 START***");
		
		Scanner scan = Entry.startScanner();
		
		try {
			
			String[] vect = scan.nextLine().split(" ");
			int position = scan.nextInt();
			System.out.println(vect[position]);
					
		} catch(ArrayIndexOutOfBoundsException e) {
		
			System.out.println("Invalid position!");
			e.printStackTrace();
		
		} catch (InputMismatchException e) {
			
			System.out.println("Invalid value!");
			e.printStackTrace();
		}
		
		Entry.closeScanner();
		
		System.out.println("***METHOD2 END***");
	}

}
