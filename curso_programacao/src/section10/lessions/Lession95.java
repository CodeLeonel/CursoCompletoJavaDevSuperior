package section10.lessions;

public class Lession95 {

	public static void main(String[] args) {

		int x = 20;
		Object obj = x;
		int j;
		
		// Boxing
		System.out.println(obj);
		
		j = (int) obj;
		
		// Unboxing
		System.out.println(j);
		
		// Wrapper classes
		Integer integer = j;
		
		System.out.println(integer * 20);
		
		/* Em Entidades de sistemas de informação, 
		 * é melhor usar Wrapper do que 
		 * tipos primitivos
		 * */
		
	}

}
