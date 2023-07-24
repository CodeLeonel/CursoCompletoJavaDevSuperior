package section15.lessions;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import section15.lessions.model.entities.Reservation;
import section15.lessions.model.exceptions.DomainException;
import util.DateUtils;
import util.Entry;

public class Lession175 {

	public static void main(String[] args) throws ParseException, DomainException {
		
		Scanner scan = Entry.startScanner();
		
		System.out.print("Room number: ");
		int number = scan.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date checkIn = DateUtils.dateParse(scan.next());
		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date checkOut = DateUtils.dateParse(scan.next());
		
		if (!checkOut.after(checkIn)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		} else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = DateUtils.dateParse(scan.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = DateUtils.dateParse(scan.next());
				
		//	String error = reservation.updateDates(checkIn, checkOut);
		/*	
			if(error != null) {
			
				System.out.println("Error in reservation: " + error);
			
			} else {
				
				System.out.println("Reservation: " + reservation);

			}
			
			*/
		}
		
		Entry.closeScanner();

	}

}
