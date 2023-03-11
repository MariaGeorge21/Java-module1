package oopsDay2.atm;

public class BankTransactions {

	public static void main(String[] args) {
	  BankingIface bom =new BankofAmerica(); //interface reference ie creating an object for interface
	  double balance = bom.deposit(250);
	  System.out.println("balance after deposit=" +balance);
	  balance = bom.withdraw(175.25);
	  System.out.println("balance after deposit=" +balance);

	}

}
