package section15.lessions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lession172 {

	public static void main(String[] args) {

		File file = new File("C:\\temp\\in.txt");
		Scanner scan = null;

		try {

			scan = new Scanner(file);
			while (scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}

		} catch (FileNotFoundException e) {

			System.out.println("Error opening file: " + e.getMessage());

		} finally {

			if (scan != null) {
				scan.close();
			}
			System.out.println("Finally block executed");

		}

	}

}
