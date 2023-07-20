package section10.exercises;

import java.util.Scanner;

import util.Entry;

public class Section10Exercise8 {

	// Program: Peer Average
	public static void main(String[] args) {

		Scanner scan = Entry.startScanner();
		
		System.out.print("How many elements will the vector have?: ");
		int number = scan.nextInt();
		int[] vector = new int[number];
		double sum = 0.0;
		int pairs = 0;
		
		for(int i = 0; i < vector.length; i++) {
			scan.nextLine();
			System.out.print("Type a number: ");
			vector[i] = scan.nextInt();
			
			if(vector[i] % 2 == 0) {
				sum += vector[i];
				pairs++;
			}
		
		}
		
		double peerAverage = sum / pairs;
		
		if(pairs > 0) {
			System.out.printf("PEER AVERAGE = %.1f%n", peerAverage);			
		} else {
			System.out.println("NO EVEN NUMBER");
		}
		
		
	}

}
