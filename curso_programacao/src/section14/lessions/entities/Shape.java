package section14.lessions.entities;

public abstract class Shape {

	private Color color;
	
	public abstract Double area();
	
	public Shape() {
		
	}
	
	public Shape(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return this.color +" "+ this.getClass().getSimpleName().toUpperCase();
	}
	
}
