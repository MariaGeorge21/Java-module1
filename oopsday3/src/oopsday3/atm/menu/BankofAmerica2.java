
package oopsday3.atm.menu;
import oopsday3.atm.exception.*;


public class BankofAmerica2 implements BankingIface2 {
	private Account[] accounts = new Account[5];
	private int accountIndex = 0;

	public BankofAmerica2() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double withdraw(double amount, int actno) throws InsufficientFundsException {
		double tempBal = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance() < amount) {
				throw new InsufficientFundsException("Insufficient Funds Exception");
			}
			if (accounts[i].getActno() == actno) {

				tempBal = accounts[i].getBalance();
				tempBal -= amount;
				accounts[i].setBalance(tempBal);
				break;
			}
		}
		return tempBal;

	}

	@Override
	public double deposit(double amount, int actno) throws NegativeAmountException {
		double tempBal = 0;
		if(amount<0) {
			throw new NegativeAmountException("negative num");
		}

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getActno() == actno) {
				tempBal = accounts[i].getBalance();
				tempBal += amount;
				accounts[i].setBalance(tempBal);
				break;
			}
		}
		return tempBal;

	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

	public void addAccount(Account account) {
		if (this.accountIndex < accounts.length)

			accounts[this.accountIndex++] = account;
		else
			System.out.println("operation not allowed");
	}

	@Override
	public double balanceEnquiry(int actno) {
		double tempBal = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getActno() == actno) {
				tempBal = accounts[i].getBalance();
				break;
			}
		}
		return tempBal;

	}

	public void display(int actno) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getActno() == actno) {
				System.out.println(accounts[i].getActno());
				System.out.println(accounts[i].getName());
				System.out.println(accounts[i].getActType());
				System.out.println(accounts[i].getBalance());
				break;
			}
		}
	}

}
