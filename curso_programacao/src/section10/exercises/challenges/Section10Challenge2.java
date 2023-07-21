package section10.exercises.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import section10.exercises.challenges.entities.Employee;
import util.Entry;

public class Section10Challenge2 {

	public static void main(String[] args) {

		Scanner scan = Entry.startScanner();
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int numberEmployees = scan.nextInt();
		
		for(int i = 0; i < numberEmployees; i++) {
			System.out.println();
			scan.nextLine();
			System.out.println("Employee #" + (i + 1));
			System.out.print("Id: ");
			Integer id = scan.nextInt();
			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.print("Salary: ");
			Double salary = scan.nextDouble();
			
			list.add(new Employee(id, name, salary));
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		Integer id = scan.nextInt();
		
		Employee employee = list.stream().filter(e -> e.getId().equals(id)).findFirst().orElse(null);
		
		if(employee != null) {
		
			System.out.print("Enter the percentage: ");
			Double percentage = scan.nextDouble();
			employee.increaseSalary(percentage);
			
		} else {
			System.out.println("This id does not exist");
		}
		
		System.out.println();
		System.out.println("List of employees:");
		
		for(Employee emp : list) {
			System.out.println(emp);
		}
		
		Entry.closeScanner();
		
	}

}
