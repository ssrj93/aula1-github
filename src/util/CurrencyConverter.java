package util;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double dollar(double price, double quantity) {
	
		return price * quantity * ( 1.0 + IOF);
		
	}	
		
}
