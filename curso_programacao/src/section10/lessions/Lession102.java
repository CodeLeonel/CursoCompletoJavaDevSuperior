package section10.lessions;

import java.util.Scanner;

import util.Entry;

public class Lession102 {

	public static void main(String[] args) {

		Scanner scan = Entry.startScanner();
		
		int number = scan.nextInt();
		
		int[][] mat = new int[number][number];
		
		for(int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Main diagonal: ");
		for(int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		int count = 0;
		
		for(int i =0; i < mat.length; i++) {
			for(int j =0; j < mat[i].length; j++) {
				if(mat[i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.println("Negative numbers = " + count);
		
		Entry.closeScanner();
		
	}

}
