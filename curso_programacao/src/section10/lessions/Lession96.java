package section10.lessions;

public class Lession96 {

	public static void main(String[] args) {

		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("-----------------");
		
		for(String person : vect) {
			System.out.println(person);
		}
	}

}
