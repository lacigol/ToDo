import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ToDoList {
	ArrayList<Task> toDoList = new ArrayList<Task>();
	
	public boolean addItem (Task task)
	{
		return toDoList.add(task);
	}
	
	public ArrayList<Task> getItems ()
	{
		return toDoList;
	}
	
	public boolean exportToFile ()
	{
		ArrayList<String> toDoString = new ArrayList<String>();
		for (Task task : toDoList) {
			String record = "ID: " + task.getTaskId() + " Name: " + task.getTaskName() + " Content: " + task.getTaskContent() + " Priority: " + task.getTaskPriority();
			toDoString.add(record);
		}
		Path file = Paths.get("C:\\temp\\todolist.txt");
		try {
			Files.write(file, toDoString, Charset.forName("UTF-8"));
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
