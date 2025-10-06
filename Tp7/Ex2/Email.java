package Tp7.Ex2;

public class Email implements Notification{
	private String fromEmail;
	
	public Email(String email) {
		this.fromEmail = email;
	}
	
	public void send(String toEmail, String message) {
		System.out.printf("[Email] From: %s To: %s - %s\n", this.fromEmail, toEmail, message);
	}
	
	public int getPriority() {
		return 1;
	}
	
	public String getType() {
		return "Email";
	}
}
