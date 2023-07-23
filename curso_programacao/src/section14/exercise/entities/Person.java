package section14.exercise.entities;

public abstract class Person {

	private String name;
	
	protected Double income;
		
	public Person() {
		
	}

	public Person(String name, Double income) {
		this.name = name;
		this.income = income;
	}

	public abstract Double tax();
	
	@Override
	public String toString() {
		return name + ": $ " + String.format("%.2f", tax());
	}
	
}
