package section9.entities;

public class BankAccount {

	private int accountNumber;
	
	private String accountHolder;
	
	private Double balance;

	private Double tax = 5.0;
	
	public BankAccount(int numberAccount, String name, Double balance) {
		this.accountNumber = numberAccount;
		this.accountHolder = name;
		this.balance = balance;
	}

	public BankAccount(int numberAccount, String name) {
		this.accountNumber = numberAccount;
		this.accountHolder = name;
	}

	public void deposit(double money) {
		
		this.balance += money;
	
	}
	
	public Double withdrawal(double money) {
		
		if(!(balance <= 0)) {

			this.balance -= (money + tax);
			return money;
			
		}

		return 0.0;
	}
	
	public int getNumberAccount() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public Double getBalance() {
		return balance;
	}
	
	public String toString() {
		
		return "Account "
				+ getNumberAccount()
				+ ", Holder: "
				+ getAccountHolder()
				+ ", Balance: $ "
				+ String.format("%.2f", getBalance());
		
	}
	
}
