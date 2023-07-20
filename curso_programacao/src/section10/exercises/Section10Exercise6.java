package section10.exercises;

import java.util.Scanner;

import util.Entry;

public class Section10Exercise6 {

	// Program: Sum Vectors
	public static void main(String[] args) {

		Scanner scan = Entry.startScanner();
		
		System.out.print("How many values will each vector have?: ");
		int number = scan.nextInt();
		int[] vectA = new int[number];
		int[] vectB = new int[number];
		int[] vectC = new int[number];
		
		System.out.println("Enter the values of vector A:");		
		for(int i = 0; i < vectA.length; i++) {
			vectA[i] = scan.nextInt();
		}

		System.out.println("Enter the values of vector B:");		
		for(int i = 0; i < vectB.length; i++) {
			vectB[i] = scan.nextInt();
		}

		System.out.println("RESULTANT VECTOR:");
		
		for(int i = 0; i < vectB.length; i++) {
			vectC[i] = vectA[i] + vectB[i];
			System.out.println(vectC[i]);
		}
		
		Entry.closeScanner();
		
	}

}
