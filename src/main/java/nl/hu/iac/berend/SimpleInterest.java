package nl.hu.iac.berend;

public class SimpleInterest {
	
	public double calculateSimpleInterest(double amount, double years, double rate_of_interest) {
		double simple_interest;
		simple_interest = amount * years * rate_of_interest;
		return simple_interest;
	}
}