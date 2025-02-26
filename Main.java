import java.util.Scanner;



	public class Main {
	    public static void main(String[] args) {
	        TaskManager taskManager = new TaskManager();
	        Scanner scanner = new Scanner(System.in);  // Create the Scanner object here
	        boolean exit = false;

	        while (!exit) {
	            System.out.println("\nTask Management System:");
	            System.out.println("1. Add Task");
	            System.out.println("2. View All Tasks");
	            System.out.println("3. Update Task");
	            System.out.println("4. Delete Task");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");

	            if (scanner.hasNextInt()) {  // Check if the input is an integer
	                int choice = scanner.nextInt();
	                scanner.nextLine();  // Consume the newline character

	                switch (choice) {
	                    case 1:
	                        taskManager.addTask();
	                        break;
	                    case 2:
	                        taskManager.viewTasks();
	                        break;
	                    case 3:
	                        taskManager.updateTask();
	                        break;
	                    case 4:
	                        taskManager.deleteTask();
	                        break;
	                    case 5:
	                        exit = true;
	                        break;
	                    default:
	                        System.out.println("Invalid choice! Please try again.");
	                }
	            } else {
	                System.out.println("Invalid input! Please enter a number.");
	                scanner.nextLine();  // Consume the invalid input
	            }
	        }

	        scanner.close();  // Close the Scanner object
	    }
	}
