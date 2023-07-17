package util;

public class Print {

	private static String line = "=".repeat(75);
	
	private static String exerciseLine = formatExerciseLine();
	
	private static String formatExerciseLine() {
		
		String line = "-".repeat(75);
		
		String exerciseLine = line.substring(0, 30) +
				" EXERCISE 0%d " + line.substring(43) + "%n";
		
		return exerciseLine;
		
	}
	
	public static void line() {
		System.out.println();
		System.out.println(line);
		System.out.println();
	}
	
	public static void exercise(int number) {
		System.out.println();
		System.out.println(line);
		System.out.printf(exerciseLine,number);
		System.out.println(line);
		System.out.println();
	}
	
	
	
	
}
