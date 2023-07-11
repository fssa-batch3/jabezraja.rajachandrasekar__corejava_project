package day02.miscellaneous;

public class Student {

	String name;
	int id;
	String email;
	public static String acadamy;
	static int count = 0;

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	public int getId() {
		return id;
	}

	public void setId(int newId) {
		id = newId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String newEmail) {
		email = newEmail;
	}

	static {
		acadamy = "FSSA";
	}

	public Student() {
		Student.count = count + 1;
	}

}
