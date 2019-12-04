package bankAccount;

public class TestAppBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank dskBank = new Bank("dsk", "sofia", 2);
		dskBank.printInfoForBank();
		VIPAccount IvansAccount = new VIPAccount();
		Customer customer = new Customer("Ivan", "9209273451", IvansAccount);
		try {
			IvansAccount.addMoney(0.00);
		} catch (MoneyException e) {

			e.printStackTrace();
		}
		IvansAccount.reduceMoney(5000.00);
	}

}
