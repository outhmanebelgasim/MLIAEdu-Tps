package Tp7.Ex2;

public interface Notification {
	public void send(String recipient, String message);
    public int getPriority();
    public String getType();
}
