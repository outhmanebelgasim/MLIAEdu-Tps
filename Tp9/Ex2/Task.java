package Tp9.Ex2;

public class Task {
	private final int id;
	private static int compteur = 0;
	private String description;
	private int priority;
	private Status status;
	
	public Task(String description, int priority) {
		this.id = compteur++;
		this.description = description;
		this.priority = priority;
		this.status = Status.PENDING;
	}
	
	public Status getStatus() {
		return this.status;
	}
	public int getId() {
		return this.id;
	}
	public int getPriority() {
		return this.priority;
	}
	public String getDescription() {
		return this.description;
	}
	

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", description=" + description + ", priority=" + priority + ", status=" + status
				+ "]";
	}
}
