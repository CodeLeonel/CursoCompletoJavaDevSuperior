package section18.lessions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import section18.lessions.model.entities.CarRental;
import section18.lessions.model.entities.Vehicle;
import util.Entry;

public class Lession225 {

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
		double priceHour  = scan.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		double priceDay  = scan.nextDouble();
		
		CarRental car = new CarRental(start, finish, new Vehicle(carModel));
		
		System.out.println("FATURA:");
		System.out.println("Pagamento básico: ");
		System.out.println("Imposto: ");
		System.out.println("Pagamento básico: ");
		
	}

}
