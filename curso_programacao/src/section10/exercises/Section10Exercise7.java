package section10.exercises;

import java.util.Scanner;

import util.Entry;

public class Section10Exercise7 {

	// Program: Below Average
	public static void main(String[] args) {

		Scanner scan = Entry.startScanner();
		
		System.out.print("How many elements will the vector have?: ");
		int number = scan.nextInt();
		double[] vector = new double[number];
		double sum = 0.0;
		
		for(int i = 0; i < vector.length; i++) {
			scan.nextLine();
			System.out.print("Type a number: ");
			vector[i] = scan.nextDouble();
			sum += vector[i];
		}
		
		System.out.println();
		double vectorAverage = sum / vector.length;
		System.out.printf("VECTOR AVERAGE = %.3f%n", vectorAverage);
		System.out.println("ELEMENTS BELOW AVERAGE:");
		
		for(int i = 0; i < vector.length; i++) {
			if(vector[i] < vectorAverage) {
				System.out.printf("%.1f%n",vector[i]);				
			}
		}
		
	}

}
