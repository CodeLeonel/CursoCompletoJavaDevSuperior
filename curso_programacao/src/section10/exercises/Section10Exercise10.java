package section10.exercises;

import java.util.Scanner;

import util.Entry;

public class Section10Exercise10 {

	// Program: Approved
	public static void main(String[] args) {

		Scanner scan = Entry.startScanner();
		
		System.out.printf("How many students will be typed?: ");
		int number = scan.nextInt();
		String[] names = new String[number];
		double[] averageGrade = new double[number];
		double grade1, grade2;

		for(int i = 0; i < names.length; i++) {
			scan.nextLine();
			System.out.printf("Enter name, first and second grade of student %d:%n",(i + 1));
			names[i] = scan.nextLine();
			grade1 = scan.nextDouble();
			grade2 = scan.nextDouble();
			averageGrade[i] = (grade1 + grade2) / 2.0;
		}
		
		System.out.println("Approved students:");
		
		for(int i = 0; i < names.length; i++) {
			if(averageGrade[i] >= 6.0) {
				System.out.println(names[i]);
			}
		}
		
		Entry.closeScanner();
		
	}

}
