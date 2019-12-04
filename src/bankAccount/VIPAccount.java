package bankAccount;

public class VIPAccount extends Account {
	@Override
	public double reduceMoney(double wantedAmount) {

		if (wantedAmount > amountAccountMoney) {
			System.out.println("This is a credit");
			double credit = amountAccountMoney - wantedAmount;
			return credit;
		}
		return wantedAmount;

	}
}
