package section10.exercises;

import java.util.Scanner;

import util.Entry;

public class Section10Exercise1 {

	/* Me fez anotar muito código 
	 *         em inglês 
	 * então vou seguir nessa regra 
	 * */
	
	// Program: negatives
	public static void main(String[] args) {

		Scanner scan = Entry.startScanner();
		
		System.out.print("How many numbers are you going to type?: ");
		int number = scan.nextInt();
		
		int[] numbers = new int[number];
		
		for(int i = 0; i < numbers.length; i++) {
			
			System.out.print("Type one number: ");
			numbers[i] = scan.nextInt();
			
		}
		
		System.out.println("NEGATIVE NUMBERS:");
		
		for(int i = 0; i < numbers.length; i++) {
			
			if(numbers[i] < 0) {
				System.out.println(numbers[i]);				
			}
			
		}
		
	}

}
