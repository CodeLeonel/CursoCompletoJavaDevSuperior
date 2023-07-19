package section10.exercises;

import java.util.Scanner;

import util.Entry;

public class Section10Exercise3 {
	
	// Program: heights
	public static void main(String[] args) {

		Scanner scan = Entry.startScanner();
		
		System.out.print("How many people will be typed?: ");
		int number = scan.nextInt();
		double sum = 0.0;
		
		String[] names = new String[number];
		int[] ages = new int[number];
		double[] heights = new double[number];
		int under16 = 0;
		
		for(int i = 0; i < heights.length; i++) {
			scan.nextLine();
			System.out.printf("Person data %d:%n",(i + 1));
			System.out.print("Name: ");
			names[i] = scan.nextLine();
			System.out.print("Age: ");
			ages[i] = scan.nextInt();
			
			if(ages[i] < 16) {
				under16++;
			}
			
			System.out.print("Height: ");
			heights[i] = scan.nextDouble();
			sum += heights[i];
		}
		
		System.out.println();
		System.out.printf("Average height: %.2f%n",(sum / heights.length));
		System.out.printf("People under 16 years old: %.1f%%%n",((double)under16/ages.length) * 100);
		
		for(int i = 0; i < names.length; i++) {
			
			if(ages[i] < 16) {
				System.out.println(names[i]);
			}
			
		}
		
		Entry.closeScanner();
		
	}

}
