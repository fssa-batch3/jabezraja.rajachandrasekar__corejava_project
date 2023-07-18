package day05.practice;

public class App {

	public static void main(String[] args) {
		Department department = new Department("B-TECH", 73);
		Student student = new Student("King JR", 777, department);
		System.out.println(student);

		Department dept1 = new Department("B-TECH", 68);
		Student std1 = new Student("THOR", 854, dept1);
		System.out.println(std1);

		// Account User || BANKS

		// Axis User

		Account axisAcc = new Account("AX001", 2000);
		ATM axisATM = new AxisATM();

		System.out.println("Initial balance: " + axisAcc.getBalance());

		try {
			axisATM.withdraw(axisAcc, 2500);
			System.out.println("Transaction successful. Current balance: " + axisAcc.getBalance());
		} catch (Exception e) {
			System.out.println("Transaction failed: " + e.getMessage());
		}

		axisATM.deposit(axisAcc, 1000);
		System.out.println("Deposit successful. Current balance: " + axisAcc.getBalance());

		// Icici User

		Account iciciAcc = new Account("IC001", 10000);
		ATM iciciATM = new IciciATM();

		System.out.println("Initial balance: " + iciciAcc.getBalance());

		try {
			iciciATM.withdraw(iciciAcc, 3500);
			System.out.println("Transaction successful. Current balance: " + iciciAcc.getBalance());
		} catch (Exception e) {
			System.out.println("Transaction failed: " + e.getMessage());
		}

		iciciATM.deposit(iciciAcc, 2000);
		System.out.println("Deposit successful. Current balance: " + iciciAcc.getBalance());

	}

}
