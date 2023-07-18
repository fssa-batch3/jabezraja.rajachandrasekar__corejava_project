package day05.practice;

public class AxisATM implements ATM {
	private double withdrawalCharge = 5;

	@Override
	public boolean deposit(Account account, double amount) {
		account.setBalance(account.getBalance() + amount);
		return true;
	}

	@Override
	public boolean withdraw(Account account, double amount) throws Exception {
		if (account.getBalance() < 5000) {
			throw new Exception("Insufficient Balance");
		}

		double totalAmount = amount + withdrawalCharge;

		if (account.getBalance() >= totalAmount) {
			account.setBalance(account.getBalance() - totalAmount);
			return true;
		} else {
			throw new Exception("Insufficient Balance");
		}
	}

	@Override
	public double getBalance(Account account) {
		return account.getBalance();
	}

}