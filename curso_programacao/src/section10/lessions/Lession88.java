package section10.lessions;

import java.util.Scanner;

import util.Entry;

public class Lession88 {

	public static void main(String[] args) {

		Scanner scan = Entry.startScanner();
		
		int n = scan.nextInt();
		
		double[] vect = new double[n];
		
		for(int i = 0 ; i < n; i++) {
			
			vect[i] = scan.nextDouble();
		
		}
		
		
		double sum = 0.0;
		
		for(int i = 0; i < n; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		
		Entry.closeScanner();
		
	}

}
