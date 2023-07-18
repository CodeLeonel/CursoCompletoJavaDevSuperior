package section9.correction;

public class Account {

	private int number;

	private String holder;

	private Double balance;

	public Account(int numberAccount, String name, Double initialDeposit) {
		this.number = numberAccount;
		this.holder = name;
		deposit(initialDeposit);
	}

	public Account(int numberAccount, String name) {
		this.number = numberAccount;
		this.holder = name;
	}

	public void deposit(double amount) {

		this.balance += amount;

	}

	public void withdraw(double amount) {

		this.balance -= (amount + 5.0);
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public String toString() {

		return "Account " + getNumber() + ", Holder: " + getHolder() + ", Balance: $ "
				+ String.format("%.2f", getBalance());

	}

}
