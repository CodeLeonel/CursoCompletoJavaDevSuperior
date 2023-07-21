package section10.exercises;

import java.util.Scanner;

import util.Entry;

public class Section10Exercise9 {

	// Older
	public static void main(String[] args) {

		Scanner scan = Entry.startScanner();
		
		System.out.print("How many people are you going to type?: ");
		
		int number = scan.nextInt();
		int[] ages = new int[number];
		String[] names = new String[number];
		int highestAge = 0;
		int indexHigestAge = 0;
		
		for(int i = 0; i < ages.length; i++) {
			scan.nextLine();
			System.out.printf("Person data %d:%n",(i + 1));
			System.out.print("Name: ");
			names[i] = scan.nextLine();
			System.out.print("Age: ");
			ages[i] = scan.nextInt();
			
			if(ages[i] > highestAge) {
				highestAge = ages[i];
				indexHigestAge = i;
			}
		}
		
		System.out.printf("OLDER PERSON: %s",names[indexHigestAge]);
		
		Entry.closeScanner();
	}

}
