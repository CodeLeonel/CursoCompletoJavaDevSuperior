package section10.exercises;

import java.util.Scanner;

import util.Entry;

public class Section10Exercise2 {

	
	// Program: sum_vector
	public static void main(String[] args) {

		Scanner scan = Entry.startScanner();
		
		System.out.print("How many numbers are you going to type?: ");
		int number = scan.nextInt();
		
		double[] numbers = new double[number];
		double sum = 0.0;
		
		for(int i = 0; i < numbers.length; i++) {
			
			System.out.print("Type a number:");
			numbers[i] = scan.nextDouble();
		}
		
		System.out.println();
		
		System.out.print("VALUES = ");
		for(int i = 0; i < numbers.length; i++) {
			System.out.printf("%.2f ",numbers[i]);
			sum += numbers[i];
		}
		
		System.out.println();
		System.out.printf("SUM = %.2f%n",sum);
		System.out.printf("AVERAGE = %.2f%n",sum/numbers.length);
		
		Entry.closeScanner();
		
	}

}
