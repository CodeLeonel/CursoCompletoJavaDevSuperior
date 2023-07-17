package section9.exercises;

import java.util.Scanner;

import section9.entities.BankAccount;
import util.Entry;

public class Section9Exercise1 {

	public static void main(String[] args) {

		Scanner scan = Entry.startScanner();
		
		BankAccount account;
		double value = 0;
		
		System.out.print("Enter account number: ");
		int numberAccount = scan.nextInt();
		scan.nextLine();
		System.out.print("Enter account holder: ");
		String accountHolder = scan.nextLine();
		System.out.print("Is there an initial deposit (y/n)?: ");
		char option = scan.next().charAt(0);
		if(option == 'y') {
			System.out.print("Enter initial desposit value: ");
			value = scan.nextDouble();
			account = new BankAccount(numberAccount, accountHolder, value);
		} else {
			account = new BankAccount(numberAccount, accountHolder);
		}
		
		System.out.println();
		System.out.println("Accout data: ");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a desposit value: ");
		value = scan.nextDouble();
		account.deposit(value);
		
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		value = scan.nextDouble();
		account.withdrawal(value);

		System.out.println("Updated account data: ");
		System.out.println(account);
		
		Entry.closeScanner();
		
	}

}
