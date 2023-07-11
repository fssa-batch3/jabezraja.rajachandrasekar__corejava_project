package day02.practice;

public class App {

	public static void main(String[] args) {

		// User
		User user = new User();
		user.setName("King JR");
		user.setId(777);
		user.setEmail("King@gmail.com");
		user.setPassword("Asdf;lkj1");

		System.out.println(user.getName());
		System.out.println(user.getId());
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());

		// Logger
		Logger.debug("Debug your code");
		Logger.info("Information is not valid");
		Logger.error("Error");
		Logger.debug(401);
		Logger.info(100);
		Logger.error(404);

	}

}
