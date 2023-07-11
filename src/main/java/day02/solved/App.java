package day02.solved;

public class App {

	public static void main(String[] args) {
		// Person
		Person person = new Person();
		person.setName("John"); // Setting the name using the setter method
		String name = person.getName(); // Accessing the name using the getter method
		System.out.println(name); // Output: John

		// person2
		Person2 persn = new Person2();
		persn.setName("John"); // Setting the name using the setter method
		String nam = persn.getName(); // Accessing the name using the getter method
		System.out.println(nam); // Output: John

		// TestBankAccount
		TestBankAccount acct1 = new TestBankAccount();
		acct1.setAccNo("A101");
		acct1.setName("Krishna");
		acct1.setBalance(1000);

		System.out.println(acct1.getAccNo());
		System.out.println(acct1.getName());
		System.out.println(acct1.getBalance());
		
		// ShapeCalculator
		ShapeCalculator calculator = new ShapeCalculator();
        double circleArea = calculator.calculateArea(3.5);                     // Output: 38.48451000647496
        double rectangleArea = calculator.calculateArea(4.2, 6.9);            // Output: 28.980000000000004
        
        System.out.println(circleArea);
        System.out.println(rectangleArea);
        
        // Calculator
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3));           // Output: 5
        System.out.println(calc.add(2.5, 3.7));       // Output: 6.2
        System.out.println(calc.add("Hello", "World"));  // Output: HelloWorld
	}

}
