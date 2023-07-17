package section8.entities;

public class Student {

	public String name;
	
	public double note1;
	public double note2;
	public double note3;
	
	public double finalGrade() {
		return note1 + note2 + note3;
	}
	
	public double missing() {
		return 60.00 - finalGrade();
	}
	
	public String status() {
		
		if(finalGrade() >= 60.00) {
			return "PASS";
		}
		
		return "FAILED \nMISSING " 
		+ String.format("%.2f", missing())
		+ " POINTS";
		
	}
	
	
}
