package section14.lessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import section14.lessions.entities.Employee;
import section14.lessions.entities.OutsourcedEmployee;
import util.Entry;

public class Lession161 {

	public static void main(String[] args) {

		Scanner scan = Entry.startScanner();
		
		List<Employee> list = new ArrayList<>();
		System.out.print("Enter number of employees: ");
		int numberEmployees = scan.nextInt();
		
		for(int i = 1; i <= numberEmployees; i++) {
			
			scan.nextLine();
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char ch = scan.next().charAt(0);
			scan.nextLine();
			System.out.print("Name: ");
			String name = scan.nextLine();
			System.out.print("Hours: ");
			int hours = scan.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = scan.nextDouble();
			
			if(ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = scan.nextDouble();
				
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			
			} else {
			
				list.add(new Employee(name, hours, valuePerHour));
			
			}
		}
		
		
		System.out.println();
		System.out.println("PAYMENTS:");
		for(Employee emp : list) {
			System.out.println(emp);
		}
		
		Entry.closeScanner();
		
		
	}

}
