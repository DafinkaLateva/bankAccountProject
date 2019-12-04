package bankAccount;

public class Account {
	private int numberAccount;
	private String bankOfAccount;
	protected double amountAccountMoney = 0;

	public Account() {

	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public String getBankOfAccount() {
		return bankOfAccount;
	}

	protected double returnMoney() {
		return amountAccountMoney;
	}

	private double changeAmount(double newAmount) {
		amountAccountMoney = newAmount;
		return amountAccountMoney;
	}

	protected double addMoney(double newAmountOfMoney) throws MoneyException {
		if (newAmountOfMoney < 0 || newAmountOfMoney == 0) {
			throw new MoneyException("Invalid data for money");
		}

		else {
			return amountAccountMoney = amountAccountMoney + newAmountOfMoney;
		}
	}

	protected double reduceMoney(double wantedAmount) throws MoneyException

	{
		if (wantedAmount > amountAccountMoney) {
			throw new MoneyException("there isnt enough money in your bank account ");
		} else
			amountAccountMoney = amountAccountMoney - wantedAmount;

		return amountAccountMoney;
	}
}