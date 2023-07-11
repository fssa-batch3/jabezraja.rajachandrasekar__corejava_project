package day02.miscellaneous;

public class App {

	public static void main(String[] args) {

		Acadamy acadamy = new Acadamy();

		acadamy.setName("freshworks");
		acadamy.setId(1);
		acadamy.setCode("FSS");

		Student std = new Student();

		std.setName("King JR");
		std.setId(8);
		std.setEmail("jabezking7@gmail.com");

		System.out.println(Student.count);

		Student std1 = new Student();

		std1.setName("PKS");
		std1.setId(1);
		std1.setEmail("pks@gmail.com");

		System.out.println(Student.count);
	}

}
