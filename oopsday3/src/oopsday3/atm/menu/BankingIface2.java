package oopsday3.atm.menu;

import oopsday3.atm.exception.InsufficientFundsException;

public interface BankingIface2 {
	public double withdraw(double amount, int actno) throws InsufficientFundsException;
	public double deposit(double amount, int actno) throws NegativeAmountException;
	public double balanceEnquiry(int actno);
	

}
