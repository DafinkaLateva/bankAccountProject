package bankAccount;

import java.util.ArrayList;

public class Customer {
	public String customerName;
	public String egn;
	public ArrayList<VIPAccount> bankAccount;

	public Customer(String customerName, String egn, ArrayList<VIPAccount> banksAccount) {
		this.customerName = customerName;
		this.egn = egn;
		this.bankAccount = banksAccount = null;
	}

	public Customer(String customerName2, String egn2, VIPAccount ivansAccount) {
		// TODO Auto-generated constructor stub
	}

	public void newBankAccount(ArrayList<Account> bankAccount) {
		Account newAccount = new Account();
		bankAccount.add(newAccount);
	}

	public void removeAccount(int numberAccount) throws AccountException {
		if (bankAccount.contains(numberAccount)) {
			bankAccount.remove(numberAccount);
		} else
			throw new AccountException("there is no account with this number");
	}
}