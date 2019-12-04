package bankAccount;

public class Bank {
	private String bankName;
	private String town;
	private int bankBranch;

	public Bank(String bankName, String town, int numberOfBank) {
		this.bankName = bankName;
		this.town = town;
		this.bankBranch = numberOfBank;
	}

	public String getBankName() {
		return bankName;
	}

	public String getTown() {
		return town;
	}

	public int getBankBranch() {
		return bankBranch;
	}

	public void setNumberOfBank(int bankBranch) {
		this.bankBranch = bankBranch;
	}

	public void printInfoForBank() {
		System.out.println("Bank name: " + getBankName());
		System.out.println("Town: " + getTown());
		System.out.println("Branch of bank: " + getBankBranch());
	}
}