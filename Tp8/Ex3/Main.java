package Tp8.Ex3;

public class Main {
	public static void main(String[] args) {
		User user = new User("outhmane", 12);
		try {
			user.validateUser();
			System.out.println(user);
		}catch(InvalidUserException e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
}
