package day07.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class Task {

	private int id;
	private String name;
	private LocalDate deadline;

	public Task(String name, int id, String date) {
		this.name = name;
		this.id = id;
		this.deadline = LocalDate.parse(date);
	}

	@Override
	public String toString() {
		return "Task [id: " + id + ", name: " + name + ", deadline: " + deadline + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Task task = (Task) obj;
		return id == task.id && Objects.equals(name, task.name) && Objects.equals(deadline, task.deadline);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, deadline);
	}

	public static void main(String[] args) {
		ArrayList<Task> arr = new ArrayList<>();
		Task t1 = new Task("Practice", 1, "2023-07-22");
		Task t2 = new Task("Practice", 1, "2023-07-22");
		Task t3 = new Task("Workout", 2, "2015-06-05");
		arr.add(t1);
		arr.add(t2);
		arr.add(t3);

		HashSet<Task> runTask = new HashSet<>(arr);

		for (Task i : runTask) {
			System.out.println(i);
		}
	}
}