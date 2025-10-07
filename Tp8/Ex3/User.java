package Tp8.Ex3;

public class User {
	private String name;
	private int age;
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void validateUser() throws InvalidUserException{
		if(this.name == null | this.name.trim().isEmpty()) {
			throw new InvalidUserException("Invalid name !");
		}
		if(this.age < 18) {
			throw new InvalidUserException("Invalid age !");
		}
	}
	
	public String toString() {
		return "User[name=" + this.name + ", age=" + this.age + "]";
	}
}
