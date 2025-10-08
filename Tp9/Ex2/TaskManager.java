package Tp9.Ex2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
	private List<Task> tasks = new ArrayList<>(0);
	
	public void addTask(String description, int prio) {
		tasks.add(new Task(description, prio));
	}
	
	public boolean removeTask(int id) {
		return tasks.removeIf(t -> t.getId() == id);
	}
	
	public boolean updateTask(int id, Status newStatus) {
		for(Task t : tasks) {
			if(t.getId() == id) {
				t.setStatus(newStatus);
				return true;
			}
		}
		return false;
	}
	
	public List<Task> listTasks() {
		return new ArrayList<Task>(tasks);
	}
	
	public List<Task> filterByStatus(Status status){
		return tasks.stream().filter(t -> t.getStatus() == status).collect(Collectors.toList());
	}
	
	public List<Task> filterByPriority(int priority){
		return tasks.stream().filter(t -> t.getPriority() == priority).collect(Collectors.toList());
	}
	
	public void sortByPriority() {
        tasks.sort(Comparator.comparingInt(Task::getPriority));
    }
}
