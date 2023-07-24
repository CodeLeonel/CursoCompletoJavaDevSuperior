package section15.exercise.model.entities;

import section15.exercise.model.exceptions.DomainException;

public class Account {

	private Integer number;
	
	private String holder;
	
	private Double balance;
	
	private Double withdrawLimit;
	
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(Double amount) {
	
		this.balance = balance + amount;
		
	}
	
	public void withdraw(Double amount) throws DomainException {
		
		if(amount > withdrawLimit) {
			throw new DomainException("The amount exceed withdraw limit");
		}
		
		if(amount > balance) {
			throw new DomainException("Not enough balance");
		}
		
		balance -= amount;
		
	}
	
	@Override
	public String toString() {
		return "Account [number=" + number + ", holder=" + holder + ", balance=" + balance + ", withdrawLimit="
				+ withdrawLimit + "]";
	}

	public Double getBalance() {
		return balance;
	}
	
	
}
