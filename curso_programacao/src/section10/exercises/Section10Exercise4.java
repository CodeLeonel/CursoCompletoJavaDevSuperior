package section10.exercises;

import java.util.Scanner;

import util.Entry;

public class Section10Exercise4 {

	public static void main(String[] args) {

		Scanner scan = Entry.startScanner();
		
		System.out.print("How many numbers are you going to type?: ");
		int number = scan.nextInt();
		int[] numbers = new int[number];
		int pairNumbers = 0;
		
		for(int i = 0; i < numbers.length; i++ ) {
			System.out.print("Type a number: ");
			numbers[i] = scan.nextInt();
		}
		
		System.out.println();
		System.out.println("PAIR NUMBERS:");
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
			if(numbers[i] % 2 == 0) {
				pairNumbers++;
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("AMOUNT OF PAIRS = " + pairNumbers);
		
		Entry.closeScanner();
		
	}

}
