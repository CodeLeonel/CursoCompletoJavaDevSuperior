package section4;

import java.util.Locale;
import java.util.Scanner;

import util.Entry;
import util.Print;

public class Section4 {


	private static void exercicio0() {
		
		Print.line();
		
		Print.exercise(0);
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.0;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n%n", product2, price2);

		System.out.printf("Record: %d years old, code %d and gender: %s%n%n", age, code, gender);
		
		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("US deimal point: %.3f%n", measure);
		
		Print.line();
		
	}
	
	private static Scanner exercicio01(Scanner scan) {
		
		Print.line();
		
		Print.exercise(1);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println("SOMA = " + (a + b));
		
		Print.line();
		
		return scan;
		
	}
	
	private static Scanner exercicio02(Scanner scan) {
		
		Print.line();
		
		Print.exercise(2);
			
		scan.nextLine();
		
		double raio = scan.nextDouble();
		
		double area = 3.14159 * Math.pow(raio, 2);
		
		System.out.printf("A=%.4f",area);
		
		Print.line();
		
		return scan;
		
	}
	
	private static Scanner exercicio03(Scanner scan) {
		
		Print.line();
		
		Print.exercise(3);
		
		int a, b, c, d;
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();

		System.out.println("DIFERENÇA = " + (a * b - c * d));
		
		Print.line();
		
		return scan;
		
	}
	
	private static Scanner exercicio04(Scanner scan) {
	
		Print.line();
		
		Print.exercise(4);
		
		int a, b;
		double c;
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextDouble();
		
		System.out.println("NUMBER = " + a);
		System.out.println("SALARY = U$ " + (b * c));
		
		Print.line();
		
		return scan;
		
	}
	
	private static void exercicio05(Scanner scan) {
		
		Print.line();
		
		Print.exercise(5);
		
		int a,d;
		double b,c,e,f;
		
		a = scan.nextInt();
		b = scan.nextDouble();
		c = scan.nextDouble();
		d = scan.nextInt();
		e = scan.nextDouble();
		f = scan.nextDouble();
		
		System.out.println(a);
		System.out.println(d);
		
		System.out.printf("VALOR A PAGAR: %.2f R$ %n", (b * c + e * f));
		
		Print.line();
		
		
	}
	
	private static void exercicio06(Scanner scan) {
	
		Print.line();
		
		Print.exercise(6);
		// Triangulo retanculo A = b*h/2
		// Circulo pi * raio^2
		// Trapezio ((a + b) / 2) * c
		// Quadrado b^2
		// Retangulo a * b
		
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		System.out.printf("TRIANGULO: %.3f%n", (a*c)/2);
		System.out.printf("CIRCULO: %.3f%n", 3.14159 * Math.pow(c, 2));
		System.out.printf("TRAPEZIO: %.3f%n", ((a + b) / 2) * c);
		System.out.printf("QUADRADO: %.3f%n", Math.pow(b, 2));
		System.out.printf("RETANGULO: %.3f%n", a * b);
		
		Print.line();
		
		
	}
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		exercicio0();

		Scanner scan = Entry.startScanner();
		
		exercicio01(scan);
		exercicio02(scan);
		exercicio03(scan);
		exercicio04(scan);
		exercicio05(scan);
		exercicio06(scan);
		
		Entry.closeScanner();
		
		
	}

}
