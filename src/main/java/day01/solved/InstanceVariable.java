package day01.solved;

public class InstanceVariable {

	public int instaVar; // instaVar = instanceVariable

	public static void main(String[] args) {
		InstanceVariable myObject = new InstanceVariable();

		// Access the instance variable using the object reference
		myObject.instaVar = 5;
		System.out.println(myObject.instaVar);

	}

}
