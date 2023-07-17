package util;

import java.util.Locale;
import java.util.Scanner;

public class Entry {

	private static Scanner scan;

	public static Scanner startScanner() {

		Locale.setDefault(Locale.US);

		scan = new Scanner(System.in);

		return scan;

	}

	public static void closeScanner() {

		scan.close();

	}

}
