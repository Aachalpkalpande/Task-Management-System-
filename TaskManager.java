

	import java.util.ArrayList;
	//import java.util.Date;
	import java.util.List;
	import java.util.Scanner;

	public class TaskManager {
	    private List<Task> taskList = new ArrayList<>();
	    private Scanner scanner = new Scanner(System.in);

	    public void addTask() {
	        System.out.print("Enter Task ID: ");
	        int id = scanner.nextInt();
	        scanner.nextLine(); // consume newline

	        System.out.print("Enter Task Title: ");
	        String title = scanner.nextLine();

	        System.out.print("Enter Task Description: ");
	        String description = scanner.nextLine();

	        System.out.print("Enter Task Status: ");
	        String status = scanner.nextLine();

	      //  System.out.print("Enter Task Due Date (yyyy-MM-dd): ");
	       // String dueDateStr = scanner.nextLine();
	        //Date dueDate = new Date(dueDateStr); // Simplified parsing for example

	        Task task = new Task(id, title, description, status); //dueDate
	        taskList.add(task);

	        System.out.println("Task added successfully!");
	    }

	    public void viewTasks() {
	        if (taskList.isEmpty()) {
	            System.out.println("No tasks to display.");
	        } else {
	            for (Task task : taskList) {
	                System.out.println(task);
	            }
	        }
	    }

	    public void updateTask() {
	        System.out.print("Enter Task ID to update: ");
	        int id = scanner.nextInt();
	        scanner.nextLine(); // consume newline

	        Task taskToUpdate = findTaskById(id);
	        if (taskToUpdate != null) {
	            System.out.print("Enter new Title: ");
	            String newTitle = scanner.nextLine();

	            System.out.print("Enter new Description: ");
	            String newDescription = scanner.nextLine();

	            System.out.print("Enter new Status: ");
	            String newStatus = scanner.nextLine();

	          //  System.out.print("Enter new Due Date (yyyy-MM-dd): ");
	         //   String newDueDateStr = scanner.nextLine();
	          //  Date newDueDate = new Date(newDueDateStr); // Simplified parsing for example

	            taskToUpdate.setTitle(newTitle);
	            taskToUpdate.setDescription(newDescription);
	            taskToUpdate.setStatus(newStatus);
	           // taskToUpdate.setDueDate(newDueDate);

	            System.out.println("Task updated successfully!");
	        } else {
	            System.out.println("Task not found!");
	        }
	    }

	    public void deleteTask() {
	        System.out.print("Enter Task ID to delete: ");
	        int id = scanner.nextInt();

	        Task taskToDelete = findTaskById(id);
	        if (taskToDelete != null) {
	            taskList.remove(taskToDelete);
	            System.out.println("Task deleted successfully!");
	        } else {
	            System.out.println("Task not found!");
	        }
	    }

	    private Task findTaskById(int id) {
	        for (Task task : taskList) {
	            if (task.getId() == id) {
	                return task;
	            }
	        }
	        return null;
	    }
	}


