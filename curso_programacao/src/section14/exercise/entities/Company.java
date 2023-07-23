package section14.exercise.entities;

public class Company extends Person {

	private Integer employees;
	
	public Company() {
		super();
	}
	
	public Company(String name, Double income, Integer employees) {
		super(name, income);
		this.employees = employees;
	}

	@Override
	public Double tax() {
		
		double result = 0.0;
	
		if(employees > 10) {
			result = income * 0.14;
		} else {
			result = income * 0.16;
		}
		
		return result;
	}

	
	
}
