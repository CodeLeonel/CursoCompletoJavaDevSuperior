package section19.exercises;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import util.Entry;

public class Section19Exercise01 {

	public static void main(String[] args) {
		
		Scanner sc = Entry.startScanner();
		
		Set<Integer> courseA = new HashSet<>();
		Set<Integer> courseB = new HashSet<>();
		Set<Integer> courseC = new HashSet<>();
		
		System.out.print("How many students for course A?: ");
		addStudents(sc,courseA);
		System.out.print("How many students for course B?: ");
		addStudents(sc,courseB);
		System.out.print("How many students for course C?: ");
		addStudents(sc,courseC);
		
		Set<Integer> totalStudents = new HashSet<>();
		totalStudents.addAll(courseA);
		totalStudents.addAll(courseB);
		totalStudents.addAll(courseC);
		
		System.out.println("Total students: " + totalStudents.size());
		
		Entry.closeScanner();
	}
	
	private static void addStudents(Scanner sc, Set<Integer> course) {
		int n = sc.nextInt();
		sc.nextLine();		
		for(int i = 0; i < n; i++) {
			course.add(sc.nextInt());
		}
	}

}
