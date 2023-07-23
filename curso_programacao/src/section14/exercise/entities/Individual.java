package section14.exercise.entities;

public class Individual extends Person {

	private Double healthExpenditure;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double income, Double healthExpenditure) {
		super(name, income);
		this.healthExpenditure = healthExpenditure;
	}

	@Override
	public Double tax() {
		
		double result = 0.0;
		
		if(income < 20000.00) {
			result = (income * 0.15) - (healthExpenditure * 0.50);
		} else {
			result = (income * 0.25) - (healthExpenditure * 0.50);			
		}
		
		return result;
	}

}
