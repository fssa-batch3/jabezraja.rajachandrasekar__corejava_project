package day03.solved;

public class App {

	public static void main(String[] args) {

		// Account1
		// create Account
		Account acct1 = new Account("A101", "Naresh", 1000);
		System.out.println(acct1.accNo + "-" + acct1.name + "-" + acct1.balance);

		// create Account
		Account acct2 = new Account("A102", "Arun", 1000);
		System.out.println(acct2.accNo + "-" + acct2.name + "-" + acct2.balance);

		// Account2
		// create Account using Setter methods and Default constructor
		Account2 acnt1 = new Account2();
		acnt1.setAccNo("A101");
		acnt1.setName("Naresh");
		acnt1.setBalance(1000);

		System.out.println(acnt1.getAccNo() + "-" + acnt1.getName() + "-" + acnt1.getBalance());

		// Create Account with Overloaded constructor accepting parameters
		Account2 acnt2 = new Account2("A102", "Arun", 1000);

		System.out.println(acnt2.getAccNo() + "-" + acnt2.getName() + "-" + acnt2.getBalance());

	}

}
