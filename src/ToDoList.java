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
}
