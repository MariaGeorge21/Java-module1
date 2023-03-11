package oopsDay2.atm;

public class BankofAmerica implements BankingIface {
    private Account account = new Account(10010,"John joe","salary",500);
    
	@Override
	public double withdraw(double amount) {
        account.setBalance(account.getBalance()-amount);
		return account.getBalance();
	}

	@Override
	public double deposit(double amount) {
		 account.setBalance(account.getBalance()+amount);
			return account.getBalance();
	
	}

	@Override
	public double balanceEnquiry(int actno) {
		
		return 0;
	}

}
