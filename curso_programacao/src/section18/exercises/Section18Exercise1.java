package section18.exercises;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import section18.exercises.model.entities.Contract;
import section18.exercises.model.entities.Installment;
import section18.exercises.model.services.ContractService;
import section18.exercises.model.services.PaypalService;
import util.DateUtils;
import util.Entry;

public class Section18Exercise1 {

	public static void main(String[] args) {

		Scanner scan = Entry.startScanner();
		
		System.out.println("Entre os dados do contrato: ");
		
		try {

			System.out.print("Numero: ");
			int number = scan.nextInt();
			scan.nextLine();
			System.out.print("Date (dd/MM/yyyy): ");
			Date date = DateUtils.dateParse(scan.nextLine());
			System.out.print("Valor do contrato: ");
			double totalValue = scan.nextDouble();
			
			Contract contract = new Contract(number, date, totalValue);
			
			ContractService contractService = new ContractService(new PaypalService());
			
			System.out.print("Entre com o numero de parcelas: ");
			int months = scan.nextInt();
			
			contractService.processContract(contract, months);
			
			System.out.println("Parcelas:");
			for(Installment installment : contract.getInstallments()) {
				System.out.println(installment);
			}
			
		} catch ( RuntimeException e) {
			System.err.println(e.toString());
		} catch (ParseException e) {
			System.err.println(e.getMessage());
		}
		
	}

}
