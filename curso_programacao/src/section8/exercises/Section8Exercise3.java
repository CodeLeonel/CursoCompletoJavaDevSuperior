package section8.exercises;

import java.util.Scanner;

import section8.entities.Student;
import util.Entry;
import util.Print;

public class Section8Exercise3 {

	public static void main(String[] args) {

		Print.line();
		
		Print.exercise(3);
		
		Scanner scan = Entry.startScanner();
		
		Student student = new Student();
		
		student.name = scan.nextLine();
		
		student.note1 = scan.nextDouble();
		student.note2 = scan.nextDouble();
		student.note3 = scan.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());
		
		System.out.println(student.status());
		
		Entry.closeScanner();
		
		Print.line();
		
	}

}
