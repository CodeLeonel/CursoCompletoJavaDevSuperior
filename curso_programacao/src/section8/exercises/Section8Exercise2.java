package section8.exercises;

import java.util.Scanner;

import section8.entities.Employee;
import util.Entry;
import util.Print;

public class Section8Exercise2 {

	public static void main(String[] args) {

		Print.line();
		
		Print.exercise(2);
		
		Scanner scan = Entry.startScanner();
		
		Employee employee = new Employee();

		System.out.print("Name: ");
		employee.name = scan.nextLine();

		System.out.print("Gross salary: ");
		employee.grossSalary = scan.nextDouble();
		
		System.out.print("Tax: ");
		employee.tax = scan.nextDouble();
				
		System.out.println("Employee: " + employee);
		
		System.out.print("Which percentage to increase salary? ");
		double percentage = scan.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println("Employee: " + employee);

		Entry.closeScanner();
		
		Print.line();
		
	}
	
}
