package secao6;

import java.util.Scanner;

import util.Entrada;
import util.Imprime;

public class Secao6 {

	private static void exercicio01(Scanner scan) {
		
		Imprime.linha();
		
		Imprime.exercicio(1);
		
		int senha = scan.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha Invalida");
			senha = scan.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		Imprime.linha();
		
	}
	
	private static void exercicio02(Scanner scan) {
		
		Imprime.linha();
		
		Imprime.exercicio(2);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		while(x != 0 && y != 0) {
			
			if(x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			else if(x < 0 && y > 0) {
				System.out.println("segundo");
			}
			else if(x < 0 && y < 0) {
				System.out.println("terceiro");
			} 
			else if(x > 0 && y < 0) {
				System.out.println("quarto");
			}
			
			x = scan.nextInt();
			y = scan.nextInt();
			
		}
		
		Imprime.linha();
		
	}
	
	private static void exercicio03(Scanner scan) {
		
		Imprime.linha();
		
		Imprime.exercicio(3);
		
		int opcao = scan.nextInt();
		
		int alcool = 0, gasolina = 0, diesel = 0; 
		
		while(opcao != 4) {
			
			switch(opcao) {
			
				case 1:
					alcool++;
					break;
				case 2:
					gasolina++;
					break;
				case 3:
					diesel++;
					break;
				default:
					break;
			
			}	
			
			opcao = scan.nextInt();
			
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		Imprime.linha();
		
	}
	
	private static void exercicio04(Scanner scan) {
		
		Imprime.linha();
		
		Imprime.exercicio(4);
		
		int x = scan.nextInt();
		
		if(x >= 1 && x <= 1000) {
			for(int i = 0; i <= x; i++) {
				
				if(i % 2 != 0) {
					System.out.println(i);
				}
				
			}
		}
		
		Imprime.linha();
		
	}
	
	private static void exercicio05(Scanner scan) {
		
		Imprime.linha();
		
		Imprime.exercicio(5);
		
		int n = scan.nextInt();
		
		int x = 0, in = 0, out = 0;
		
		for(int i = 0; i < n; i++) {
			
			x = scan.nextInt();
			
			if(x >= 10 && x <= 20) {
				in++;
			} else {
				out++;
			}
			
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		Imprime.linha();
	}
	
	private static void exercicio06(Scanner scan) {
		
		Imprime.linha();
		
		Imprime.exercicio(6);
		
		int n = scan.nextInt();
		
		double a = 0.0, b = 0.0, c = 0.0;
		
		for(int i = 0; i < n; i++) {
			
			a = scan.nextDouble();
			b = scan.nextDouble();
			c = scan.nextDouble();
		
			double mediaPonderada = (((a * 2.0) + (b * 3.0) + (c * 5.0)) / 10.0);
			
			System.out.printf("%.1f%n",mediaPonderada);
			
		}
		
		Imprime.linha();
		
	}
	
	private static void exercicio07(Scanner scan) {
		
		Imprime.linha();
		
		Imprime.exercicio(7);
		
		int n = scan.nextInt();
		double a = 0.0, b = 0.0;
		double resultado = 0.0;
		
		for(int i = 0; i < n; i++) {
			
			a = scan.nextDouble();
			
			b = scan.nextDouble();
			
			if(b == 0.0) {
				
				System.out.println("divisao impossivel");
			
			} else {
			
				resultado = a / b;
				System.out.printf("%.1f%n",resultado);
			}
			
			
		}
		
		Imprime.linha();
		
	}
	
	private static void exercicio08(Scanner scan) {
		
		Imprime.linha();
		
		Imprime.exercicio(8);
		
		int n = scan.nextInt();
		int resultado = 0;
		
		for(int i = 1; i < n; i++) {
			
			if(i != 1) {
				resultado *= (n-i);
			} 
			else if(n == (n-i)) {
				resultado *= 1;
			}
			else {
				resultado = n * (n-i);				
			}
			
		}
		
		if(n == 0 || n == 1) {
			resultado = 1;
		}
				
		System.out.println(resultado);
		
		Imprime.linha();
	}
	
	private static void exercicio09(Scanner scan) {
		
		Imprime.linha();
		
		Imprime.exercicio(9);
		
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			if(n % i == 0) {
				System.out.println(i);
			}
			
		}
		
		Imprime.linha();
	}
	
	private static void exercicio10(Scanner scan) {
		
		Imprime.linha();
		
		Imprime.exercicio(9);
		
		int n = scan.nextInt();
		int j = 0, k = 0;
		
		for(int i = 1; i <= n; i++) {
			
			j = (int) Math.pow(i, 2);
			k = (int) Math.pow(i, 3);
			
			System.out.printf("%d %d %d %n",i,j,k);
		}
		
		Imprime.linha();
	}
	
	public static void main(String[] args) {
	
		Scanner scan = Entrada.inicioScanner();
		
		exercicio01(scan);
		exercicio02(scan);
		exercicio03(scan);
		exercicio04(scan);
		exercicio05(scan);
		exercicio06(scan);
		exercicio07(scan);
		exercicio08(scan);
		exercicio09(scan);
		exercicio10(scan);
		
		Entrada.fimScanner();
		
	}

}
