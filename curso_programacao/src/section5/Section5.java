package section5;

import java.util.Scanner;

import util.Entry;
import util.Print;

public class Section5 {

	private static void exercicio01(Scanner scan) {

		Print.line();

		Print.exercise(1);

		int a = scan.nextInt();

		if (a >= 0) {
			System.out.println("NÃO NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}

		Print.line();

	}

	private static void exercicio02(Scanner scan) {

		Print.line();

		Print.exercise(2);

		int a = scan.nextInt();

		if (a % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}

		Print.line();

	}

	private static void exercicio03(Scanner scan) {

		Print.line();

		Print.exercise(3);

		int a, b, min, max;

		a = scan.nextInt();
		b = scan.nextInt();

		if (a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}

		if (max % min == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}

		Print.line();

	}

	private static void exercicio04(Scanner scan) {

		Print.line();

		Print.exercise(4);

		int duracao;

		int horaInicial = scan.nextInt();
		int horaFinal = scan.nextInt();

		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}

		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

		Print.line();

	}

	private static void exercicio05(Scanner scan) {

		Print.line();

		Print.exercise(5);

		int codigo;
		int quantidade;
		double preco = 0.0;

		codigo = scan.nextInt();
		quantidade = scan.nextInt();

		if (codigo == 1) {
			preco = 4.00 * quantidade;
		} else if (codigo == 2) {
			preco = 4.50 * quantidade;
		} else if (codigo == 3) {
			preco = 5.00 * quantidade;
		} else if (codigo == 4) {
			preco = 2.00 * quantidade;
		} else if (codigo == 5) {
			preco = 1.50 * quantidade;
		} else {
			System.out.println("Código inexistente");
		}

		System.out.printf("Total: R$ %.2f", preco);

		Print.line();

	}

	private static void exercicio06(Scanner scan) {

		Print.line();

		Print.exercise(6);

		double valor = scan.nextDouble();

		if (valor > 0 && valor <= 25) {
			System.out.println("Intervalo (0,25)");
		} else if (valor > 25 && valor <= 50) {
			System.out.println("Intervalo (25,50)");
		} else if (valor > 50 && valor <= 75) {
			System.out.println("Intervalo (50,75)");
		} else if (valor > 75 && valor <= 100) {
			System.out.println("Intervalo (75,100)");
		} else {
			System.out.println("Fora do intervalo");
		}

		Print.line();

	}

	private static void exercicio07(Scanner scan) {

		Print.line();

		Print.exercise(7);

		double x = scan.nextDouble();
		double y = scan.nextDouble();

		String quadrante = "";

		if (x > 0.0 && y > 0.0) {
			quadrante = "Q1";
		} else if (x < 0.0 && y > 0.0) {
			quadrante = "Q2";
		} else if (x < 0.0 && y < 0.0) {
			quadrante = "Q3";
		} else if (x > 0.0 && y < 0.0) {
			quadrante = "Q4";
		} else if (x == 0.0 && y == 0.0) {
			quadrante = "Origem";
		}

		System.out.println(quadrante);

		Print.line();

	}

	private static void exercicio08(Scanner scan) {

		Print.line();

		Print.exercise(8);

		boolean isento = false;
		double salario = scan.nextDouble();
		double faixa2 = 0.00, faixa3 = 0.00, faixa4 = 0.00;
		double imposto = 0.0;

		if (salario >= 0.00 && salario <= 2000.00) {

			isento = true;
			System.out.println("Isento");

		}

		if (salario >= 2000.01 && salario <= 3000.00) {

			faixa2 = salario - 2000.00;

			faixa2 = faixa2 * 0.08;
			System.out.println(faixa2);
		}

		if (salario >= 3000.01 && salario <= 4500.00) {

			faixa2 = salario - 2000.00;

			if (faixa2 > 1000.00) {

				faixa2 = 1000.00;

			}

			faixa2 = faixa2 * 0.08;

			faixa3 = salario - 3000.00;

			if (faixa3 > 1500.00) {
				faixa3 = 1500.00;
			}

			faixa3 = faixa3 * 0.18;

		}

		if (salario > 4500.00) {

			faixa2 = salario - 2000.00;

			if (faixa2 > 1000.00) {

				faixa2 = 1000.00;

			}

			faixa2 = faixa2 * 0.08;

			faixa3 = salario - 3000.00;

			if (faixa3 > 1500.00) {
				faixa3 = 1500.00;
			}

			faixa3 = faixa3 * 0.18;

			faixa4 = salario - 4500.00;

			faixa4 = faixa4 * 0.28;

		}

		if (!isento) {

			imposto = faixa2 + faixa3 + faixa4;
			System.out.printf("R$ %.2f", imposto);
		}

		Print.line();

	}

	public static void main(String[] args) {

		Scanner scan = Entry.startScanner();

		exercicio01(scan);
		exercicio02(scan);
		exercicio03(scan);
		exercicio04(scan);
		exercicio05(scan);
		exercicio06(scan);
		exercicio07(scan);
		exercicio08(scan);

		Entry.closeScanner();

	}

}
