package section15.lessions;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import section15.lessions.model.entities.Reservation;
import section15.lessions.model.exceptions.DomainException;
import util.DateUtils;
import util.Entry;

public class Lession176 {

	public static void main(String[] args) {

		Scanner scan = Entry.startScanner();
		try {
			
			System.out.print("Room number: ");
			int number = scan.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkIn = DateUtils.dateParse(scan.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkOut = DateUtils.dateParse(scan.next());
			
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = DateUtils.dateParse(scan.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = DateUtils.dateParse(scan.next());
			
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
		} catch(ParseException e) {
			
			System.out.println("Invalid date format");
		
		} catch (DomainException e) {
			
			System.out.println("Error in reservation: " + e.getMessage());
			
		} catch (RuntimeException e) {
			
			System.out.println("Unexpected error: " + e.toString());
			
		}
		
		Entry.closeScanner();
		
	}

}
