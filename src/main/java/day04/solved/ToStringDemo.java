package day04.solved;

public class ToStringDemo {

	public static void main(String[] args) {
		// create Account using Setter methods and Default constructor
		WithToString acct1 = new WithToString();
		acct1.setAccNo("A101");
		acct1.setName("Naresh");
		acct1.setBalance(1000);

		System.out.println(acct1);

		WithoutToString acct2 = new WithoutToString();
		acct2.setAccNo("A101");
		acct2.setName("Naresh");
		acct2.setBalance(1000);

		System.out.println(acct2);

	}

}
