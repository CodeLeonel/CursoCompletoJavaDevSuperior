package util;

import java.util.Locale;
import java.util.Scanner;

public class Entrada {

	private static Scanner scan;

	public static Scanner inicioScanner() {

		Locale.setDefault(Locale.US);

		scan = new Scanner(System.in);

		return scan;

	}

	public static void fimScanner() {

		scan.close();

	}

}
