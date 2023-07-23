package section14.lessions;

import section14.lessions.entities.Account;
import section14.lessions.entities.BusinessAccount;
import section14.lessions.entities.SavingsAccount;

public class Lession158 {

	public static void main(String[] args) {

		//Account acc1 = new Account(1001,"Alex",1000.0);
		//acc1.withdraw(200);
		//System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.00, 0.01);
		acc2.withdraw(200);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.00, 500.0);
		acc3.withdraw(200);
		System.out.println(acc3.getBalance());
		
	}

}
