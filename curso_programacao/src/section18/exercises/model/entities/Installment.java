package section18.exercises.model.entities;

import java.util.Date;

import util.DateUtils;

public class Installment {

	private Date dueDate;
	
	private Double amount;
	
	public Installment() {

	}

	public Installment(Date dueDate, Double amount) {
		this.dueDate = dueDate;
		this.amount = amount;
	}
	
	@Override
	public String toString() {

		return DateUtils.dateFormat(dueDate) 
				+ " - "
				+ String.format("%.2f", amount);
	
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
}
