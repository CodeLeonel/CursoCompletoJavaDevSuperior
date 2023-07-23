package section14.lessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import section14.lessions.entities.Circle;
import section14.lessions.entities.Color;
import section14.lessions.entities.Rectangle;
import section14.lessions.entities.Shape;
import util.Entry;

public class Lession164 {

	public static void main(String[] args) {

		Scanner scan = Entry.startScanner();
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int numberShapes = scan.nextInt();
		
		for(int i = 1; i <= numberShapes; i++) {
			
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char typeShape = scan.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			scan.nextLine();
			Color color = Color.valueOf(scan.nextLine());
			if(typeShape == 'r') {

				System.out.print("Width: ");
				double width = scan.nextDouble();
				System.out.print("Height: ");
				double height = scan.nextDouble();				
			
				list.add(new Rectangle(color,width,height));
				
			} else if(typeShape == 'c') {
			
				System.out.print("Radius: ");
				double radius = scan.nextDouble();
				
				list.add(new Circle(color,radius));
				
			}
				
		}
		
		System.out.println();
		System.out.println("SHAPE FORMS:");
		
		for(Shape shape : list) {
			System.out.printf("%.2f%n", shape.area());
		}

		System.out.println();
		System.out.println("SHAPES:");
		
		for(Shape shape : list) {
			System.out.println(shape);
		}
		
		Entry.closeScanner();
		
	}

}
