package section10.exercises.challenges;

import java.util.Scanner;

import util.Entry;

public class Section10Challenge3 {

	public static void main(String[] args) {

		Scanner scan = Entry.startScanner();
		
		int m, n;
		int left, up, right, down;
		
		m = scan.nextInt();
		n = scan.nextInt();
		
		
		int[][] mat = new int[m][n];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				
				mat[i][j] = scan.nextInt();
				
			}
		}
		
		int x = scan.nextInt();
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				
				if(mat[i][j] == x) {
					System.out.printf("Position %d,%d:%n",i,j);
					
					left = j - 1;
					up = i - 1;
					right = j + 1;
					down = i + 1;
					
					if(inMat(m,n,left)) {
						System.out.println("Left: " + mat[i][left]);
					}
					
					if(inMat(m,n,up)) {
						System.out.println("Up: " + mat[up][j]);
					}
					
					if(inMat(m,n,right)) {
						System.out.println("Right: " + mat[i][right]);
					}

					if(inMat(m,n,down)) {
						System.out.println("Down: " + mat[down][j]);
					}
					
				}
				
			}
		}
		
		Entry.closeScanner();
		
	}
	
	public static boolean inMat(int m, int n, int value) {
		
		if(value >= 0 && m >= value) {
			if(n >= value) {
				return true;
			}
		}
		
		return false;
		
	}

}
