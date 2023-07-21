package section10.exercises.challenges.entities;

public class Employee {

	private Integer id;
	private String name;
	private Double salary;

	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
	
	public void increaseSalary(Double percentage) {
		
		this.salary += (salary * (percentage/100.0));
		
	}

	public Integer getId() {
		return id;
	}
	
	
}
