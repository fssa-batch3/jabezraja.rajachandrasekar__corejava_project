package day01.practice;

public class Cat {
	// Attributes
	private int age;
	private String color;

	// constructor
	public Cat(int age, String color) {
		this.age = age;
		this.color = color;
	}

	// Getters and setters
	public int getAge() {
		return age;
	}

	public void setAge(int newAge) {
		age = newAge;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String newColor) {
		color = newColor;
	}

	public void speak() {
		System.out.println("Meow!");
	}

	// Main method to create Cat objects
	public static void main(String[] args) {
		// Create two Cat objects
		Cat cat1 = new Cat(4, "White");
		Cat cat2 = new Cat(3, "Black");
		// Print the attributes of each Cat
		System.out.println("Cat 1:");
		System.out.println("Age: " + cat1.getAge());
		System.out.println("Color: " + cat1.getColor());
		System.out.print("Speak: ");
		cat1.speak();
		System.out.println("Cat 2:");
		System.out.println("Age: " + cat2.getAge());
		System.out.println("Color: " + cat2.getColor());
		System.out.print("Speak: ");
		cat2.speak();
	}
}