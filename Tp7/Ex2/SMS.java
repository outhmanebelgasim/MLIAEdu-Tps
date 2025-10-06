package Tp7.Ex2;

public class SMS implements Notification {
	private String fromNumber;
	
	public SMS(String number) {
		this.fromNumber = number;
	}
	
	public void send(String toNumber, String message) {
		System.out.printf("[SMS] From: %s To: %s - %s\n", this.fromNumber, toNumber, message);
	}
	
	public int getPriority() {
		return 2;
	}
	
	public String getType() {
		return "SMS";
	}
}
