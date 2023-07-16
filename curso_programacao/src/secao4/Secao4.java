package secao4;

import java.util.Locale;
import java.util.Scanner;

public class Secao4 {

	private static void imprime(String linha) {
		System.out.println();
		System.out.println(linha);
		System.out.println();
	}
	
	private static void exercicio0(String linha) {
		
		imprime(linha);
		
		System.out.println("Exercício 00: ");
		
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
		
		imprime(linha);
		
	}
	
	private static Scanner exercicio01(String linha, Scanner scan) {
		
		imprime(linha);
		
		System.out.println("Exercício 01: ");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println("SOMA = " + (a + b));
		
		imprime(linha);
		
		return scan;
		
	}
	
	private static Scanner exercicio02(String linha, Scanner scan) {
		
		imprime(linha);
		
		System.out.println("Exercício 02: ");
			
		scan.nextLine();
		
		double raio = scan.nextDouble();
		
		double area = 3.14159 * Math.pow(raio, 2);
		
		System.out.printf("A=%.4f",area);
		
		imprime(linha);
		
		return scan;
		
	}
	
	private static Scanner exercicio03(String linha, Scanner scan) {
		
		imprime(linha);
		
		System.out.println("Exercício 03: ");
		
		int a, b, c, d;
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();

		System.out.println("DIFERENÇA = " + (a * b - c * d));
		
		imprime(linha);
		
		return scan;
		
	}
	
	private static Scanner exercicio04(String linha, Scanner scan) {
	
		imprime(linha);
		
		System.out.println("Exercício 04: ");
		
		int a, b;
		double c;
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextDouble();
		
		System.out.println("NUMBER = " + a);
		System.out.println("SALARY = U$ " + (b * c));
		
		imprime(linha);
		
		return scan;
		
	}
	
	private static Scanner exercicio05(String linha, Scanner scan) {
		
		imprime(linha);
		
		System.out.println("Exercício 05: ");
		
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
		
		imprime(linha);
		
		return scan;
		
	}
	
	private static Scanner exercicio06(String linha, Scanner scan) {
	
		imprime(linha);
		
		System.out.println("Exercício 06: ");
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
		
		
		System.out.println("Exercício 06: ");
		
		imprime(linha);
		
		return scan;
		
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		String linha = "=".repeat(75);
		
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		exercicio0(linha);

		scan = exercicio01(linha,scan);
		scan = exercicio02(linha,scan);
		scan = exercicio03(linha,scan);
		scan = exercicio04(linha,scan);
		scan = exercicio05(linha,scan);
		scan = exercicio06(linha,scan);
		
		scan.close();
		
	}

}
