package section18.exercises.model.services;

import java.util.Calendar;
import java.util.Date;

import section18.exercises.model.entities.Contract;
import section18.exercises.model.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}



	public void processContract(Contract contract, int months) {
		
		Calendar cal = Calendar.getInstance();
		double installmentsAmount = contract.getTotalValue() / (double) months;
		
		for(int i = 1; i <= months; i++) {
			
			double installmentAmount = installmentsAmount;
			cal.setTime(contract.getDate());
			cal.add(Calendar.MONTH, i);
			Date dueTime = cal.getTime();
			installmentAmount = onlinePaymentService.interest(installmentAmount, i);
			installmentAmount = onlinePaymentService.paymentFee(installmentAmount);
			
			contract.getInstallments().add(new Installment(dueTime, installmentAmount));
			
		}
		
	}
	
}
