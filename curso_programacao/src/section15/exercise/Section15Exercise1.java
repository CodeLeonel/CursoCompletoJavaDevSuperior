package section15.exercise;

import java.util.Scanner;

import section15.exercise.model.entities.Account;
import section15.exercise.model.exceptions.DomainException;
import util.Entry;

public class Section15Exercise1 {

	public static void main(String[] args) {

		Scanner scan = Entry.startScanner();

		System.out.println("Enter account data");

		try {
			System.out.print("Number: ");
			int number = scan.nextInt();
			System.out.print("Holder: ");
			scan.nextLine();
			String holder = scan.nextLine();
			System.out.print("Initial balance: ");
			double balance = scan.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = scan.nextDouble();

			Account account = new Account(number, holder, balance, withdrawLimit);

			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double amount = scan.nextDouble();
			account.withdraw(amount);
			System.out.print("New balance: " + account.getBalance());

		} catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Unexpected error: " + e.toString());
		}

		Entry.closeScanner();

	}

}
