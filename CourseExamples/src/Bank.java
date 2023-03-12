public class Bank {

	public static void discountLoan(double x) {
		x = x * 0.95; // 237.50
	}
	
	public static double ndiscountLoan(double x) {
		x = x * 0.95; // 237.50
		return x;
	}

	public static void debitFee(Account acct) {
		acct.balance = acct.balance - 2.50; // 97.50
	}
	
	public static void salutation(String aName) {
		aName = "Dear " + aName; //Dear Jason Shapiro
	}

}
