package section8.exercises.util;

public class CurrencyConverter {

	public static double dollarToReal(double dollarCurrency, double dollars) {
		
		double reais = dollarCurrency * dollars;
		double iof = reais * 0.06;
		
		return reais + iof;
		
	}
	
}
