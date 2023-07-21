package section10.exercises;

import java.util.Scanner;

import util.Entry;

public class Section10Exercise11 {

	// Program: data people
	public static void main(String[] args) {

		Scanner scan = Entry.startScanner();
		
		System.out.print("How many people will be typed?: ");
		
		int number = scan.nextInt();
		double greatHeight = 0.0, smallHeight = Double.MAX_VALUE;
		double sumHeightF = 0.0;
		int sumM = 0, sumF = 0;
		
		
		char[] genders = new char[number];
		double[] heights = new double[number];

		for(int i = 0; i < heights.length; i++) {
			scan.nextLine();
			System.out.printf("Height of person %d: ", (i + 1));
			heights[i] = scan.nextDouble();
			System.out.printf("Gender of person %d: ", (i + 1));
			genders[i] = scan.next().charAt(0);
		}
		
		for(int i = 0; i < heights.length; i++) {
			if(heights[i] > greatHeight) {
				greatHeight = heights[i];
			}
			
			if(heights[i] < smallHeight) {
				smallHeight = heights[i];
			}
			
			if(genders[i] == 'F') {
				sumF++;
				sumHeightF += heights[i];
			} else {
				sumM++;
			}
		}
		
		System.out.printf("Smaller height = %.2f%n",smallHeight);
		System.out.printf("Greater height = %.2f%n",greatHeight);
		System.out.printf("Average height of women = %.2f%n",sumHeightF/(double)sumF);
		System.out.println("Number of men = " + sumM);
		
		Entry.closeScanner();
		
	}

}
