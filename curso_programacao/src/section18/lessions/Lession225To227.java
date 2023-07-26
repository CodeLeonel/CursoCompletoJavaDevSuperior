package section18.lessions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import section18.lessions.model.entities.CarRental;
import section18.lessions.model.entities.Vehicle;
import section18.lessions.model.services.BrazilTaxService;
import section18.lessions.model.services.RentalService;
import util.Entry;

public class Lession225To227 {

	public static void main(String[] args) {

		Scanner scan = Entry.startScanner();
	
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String carModel = scan.nextLine();
		System.out.print("Retirada (dd/MM/yyyy): ");
		LocalDateTime start = LocalDateTime.parse(scan.nextLine(), fmt);
		System.out.print("Retorno (dd/MM/yyyy): ");
		LocalDateTime finish = LocalDateTime.parse(scan.nextLine(), fmt);
		System.out.print("Entre com o preço por hora: ");
		double pricePerHour  = scan.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		double pricePerDay  = scan.nextDouble();
		
		CarRental car = new CarRental(start, finish, new Vehicle(carModel));
		
		RentalService rentalService = new RentalService(pricePerHour, 
														pricePerDay, 
														new BrazilTaxService());
		
		
		rentalService.processInvoice(car);
		
		System.out.println("FATURA:");
		System.out.println("Pagamento básico: " + String.format("%.2f", car.getInvoice().getBasicPayment()));
		System.out.println("Imposto: " + String.format("%.2f",car.getInvoice().getTax()));
		System.out.println("Pagamento total: " + String.format("%.2f",car.getInvoice().getTotalPayment()));
		Entry.closeScanner();
	}

}
