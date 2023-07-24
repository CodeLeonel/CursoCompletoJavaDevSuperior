package section15.lessions;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import section15.lessions.model.entities.Reservation;
import section15.lessions.model.exceptions.DomainException;
import util.DateUtils;
import util.Entry;

public class Lession174 {

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
			
			Date now = new Date();
			if (checkIn.before(now) || checkOut.before(now)) {
			
				System.out.println("Error in reservation: Reservation dates for update must be future dates");
			
			} else if (!checkOut.after(checkIn)) {
			
				System.out.println("Error in reservation: Check-out date must be after check-in date");

			} else {
				
			//	reservation.updateDates(checkIn, checkOut);
			//	System.out.println("Reservation: " + reservation);
			}
			
			
		}
		
		Entry.closeScanner();
		
	}

}
