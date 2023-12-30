package section20.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import section20.exercise.entities.Employee;
import util.Entry;

public class Section20Exercise01 {

	public static void main(String[] args) {

		List<Employee> employess = new ArrayList<>();
		
		Scanner sc = Entry.startScanner();
		
		System.out.print("Enter full file path: ");
		
		String strPath = sc.nextLine();
		
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(strPath))) {
			
			String line = br.readLine();
			
			while(line != null) {
				
				String[] data = line.split(",");
				employess.add(new Employee(data[0],data[1],Double.parseDouble(data[2])));
				
				line = br.readLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.print("Enter salary: ");
		
		Double salary = sc.nextDouble();
		
		Entry.closeScanner();
		
		Comparator<String> comp = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
		
		List<String> emails = employess.stream()
				.filter(e -> e.getSalary() > salary)
				.map(e -> e.getEmail())
				.sorted(comp)
				.collect(Collectors.toList());
		
		System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary));
		
		emails.forEach(System.out::println);
		
		Double sum = employess.stream()
						.filter(e -> e.getName().startsWith("M"))
						.map(e -> e.getSalary())
						.reduce(0.0, (x,y) -> x + y);
		
		System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));
	}

}
