package Tp7.Ex2;

public class Push implements Notification {
	private String appId;
	
	public Push(String appId) {
		this.appId = appId;
	}
	
	public void send(String receipient, String message) {
		System.out.printf("[Push] From: %s To: %s - %s\n", this.appId, receipient, message);
	}

	public int getPriority() {
		return 0;
	}

	public String getType() {
		return "Push";
	}
}
