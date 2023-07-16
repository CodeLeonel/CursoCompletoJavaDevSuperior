package util;

public class Imprime {

	private static String linha = "=".repeat(75);
	
	private static String exercicioLinha = formaExercicioLinha();
	
	private static String formaExercicioLinha() {
		
		String linha = "-".repeat(75);
		
		String exercicioLinha = linha.substring(0, 30) +
				" EXERCÍCIO 0%d " + linha.substring(44) + "%n";
		
		return exercicioLinha;
		
	}
	
	public static void linha() {
		System.out.println();
		System.out.println(linha);
		System.out.println();
	}
	
	public static void exercicio(int numero) {
		System.out.println();
		System.out.println(linha);
		System.out.printf(exercicioLinha,numero);
		System.out.println(linha);
		System.out.println();
	}
	
	
	
	
}
