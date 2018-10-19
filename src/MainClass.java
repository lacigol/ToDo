import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	
	static ToDoList toDoList = new ToDoList();
	ToDoList toDoList = new ToDoList();
	
	public static void main(String[] args){
		boolean exit = false;
		do {
			showMenu();
			int input = readInput();
	public static void showMenu(){
		System.out.println("Welcome to To Do List Application");
		showCurrentList();
		System.out.println("Menu: ");
		System.out.println("1. List all to do list");
		System.out.println("2. Add new item");
		System.out.println("3. Delete an item");
		System.out.println("4. Mark an item as complete");
		System.out.println("9. Quit");
	public static int readInput(){
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();	
		
		switch(input){
		case 1:
			System.out.println("1");
			break;
			
		case 2:
			System.out.println("2");
			

			scanner.nextLine();
			//int taskId;
			System.out.println("1. Enter Task Name.");
			String taskName = scanner.nextLine();
			System.out.println("2. Enter Task Content.");
			String taskContent = scanner.nextLine();
			System.out.println("3. Set Task Priority.");
			int taskPriority = scanner.nextInt();

			System.out.println("Item Save.");
			//boolean isComplete scanner.();
			Task saveing = new Task(-1, taskName, taskContent, taskPriority, false);
			
			toDoList.addItem(saveing);
			break;
			
		case 3:
			System.out.println("3");
			break;
			
		case 9:

			break;
		default:
			System.out.println("Invalid choice");
		}
		
		
		return input;
	}
	
	public static void showCurrentList(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("Fix bug no 1");
		list.add("Fix bug no 2");
		list.add("Fix bug no 3");
		
		for (String s : list){
			System.out.println(s);
		}
		
	}
}
