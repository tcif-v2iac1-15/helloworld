package nl.hu.iac.berend;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String args[]) {

		SimpleInterest si = new SimpleInterest();
		double result = si.calculateSimpleInterest(10000, 5, 7);
		System.out.println("De interest is: " + result);

	}

	public static double calculateSimpleInterest(double amount, double years, double rate_of_interst) {
		double simple_interest;
		simple_interest = amount * years * rate_of_interst;
		return simple_interest;
	}
}
