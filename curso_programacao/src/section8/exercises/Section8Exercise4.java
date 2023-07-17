package section8.exercises;

import java.util.Scanner;

import section8.exercises.util.CurrencyConverter;
import util.Entry;
import util.Print;

public class Section8Exercise4 {

	public static void main(String[] args) {

		Print.line();
		
		Print.exercise(4);
		
		Scanner scan = Entry.startScanner();

		System.out.print("What is the dollar price? ");
		double dollarCurrency = scan.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double dollars = scan.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f%n",
				CurrencyConverter.dollarToReal(dollarCurrency, dollars));
		
		
		Print.line();
	}

}
