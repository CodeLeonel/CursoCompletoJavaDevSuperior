package section10.exercises;

import java.util.Scanner;

import util.Entry;

// Program: Highest Value
public class Section10Exercise5 {

	public static void main(String[] args) {

		Scanner scan = Entry.startScanner();
		
		System.out.print("How many numbers are you going to type?: ");
		int number = scan.nextInt();
		double[] numbers = new double[number];
		double highestValue = 0.0; 
		int indexHighestValue = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Type a number: ");
			numbers[i] = scan.nextDouble();
			if(numbers[i] > highestValue) {
				highestValue = numbers[i];
				indexHighestValue = i;
			}
		}
		
		System.out.println();
		System.out.printf("HIGHEST VALUE: %.1f%n", highestValue);
		System.out.printf("POSITION OF THE BIGGEST VALUE: %d%n", indexHighestValue);
		
		Entry.closeScanner();
		
	}

}
