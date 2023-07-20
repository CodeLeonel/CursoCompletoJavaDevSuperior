package section10.exercises.challenges;

import java.util.Scanner;

import section10.exercises.challenges.entities.Rent;
import util.Entry;

public class Section10Challenge1 {

	public static void main(String[] args) {

		Scanner scan = Entry.startScanner();
		Rent[] rooms = new Rent[10];
		
		System.out.printf("How many rooms will be rented?: ");
		int roomsRented = scan.nextInt();
		
		for(int i = 0; i < roomsRented; i++) {
			System.out.println();
			scan.nextLine();
			System.out.printf("Rent #%d:%n",(i + 1));
			System.out.print("Name: ");
			String name = scan.nextLine();			
			System.out.print("Email: ");
			String email = scan.nextLine();
			System.out.print("Room: ");
			int numberRoom = scan.nextInt();
			
			rooms[numberRoom] = new Rent(name, email);
			
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for(int i = 0; i < rooms.length; i++) {
			if(rooms[i] != null) {
				System.out.println(i + ": " + rooms[i] );
			}
		}
		
	}

}
