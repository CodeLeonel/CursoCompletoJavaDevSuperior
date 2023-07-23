package section14.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import section14.exercise.entities.Company;
import section14.exercise.entities.Individual;
import section14.exercise.entities.Person;
import util.Entry;

public class Section14Exercise2 {

	public static void main(String[] args) {

		Scanner scan = Entry.startScanner();
		
		List<Person> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int numPayers = scan.nextInt();
		
		for(int i = 1; i <= numPayers; i++) {
			
			scan.nextLine();
			System.out.println("Tax payer #" + i +" data:");
			System.out.print("Individual or company (i/c)? ");
			char typePerson = scan.next().charAt(0);
			scan.nextLine();
			System.out.print("Name: ");
			String name = scan.nextLine();
			System.out.print("Anual income: ");
			double income = scan.nextDouble();
			if(typePerson == 'c') {
				
				System.out.print("Number of employees: ");
				int employees = scan.nextInt();
				
				list.add(new Company(name, income, employees));
			} else {
				
				System.out.print("Health expenditures: ");
				double healthExpenditures = scan.nextDouble();
				
				list.add(new Individual(name, income, healthExpenditures));				
			}
		}
		
		double sumTaxes = 0.0;
		System.out.println();
		System.out.println("TAXES PAID:");
		for(Person person : list) {
			
			System.out.println(person);
			
			sumTaxes += person.tax();
			
		}

		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f%n", sumTaxes);
	
		Entry.closeScanner();
		
	}

}
