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
	
	public boolean deleteItem (int taskId)
	{
		ArrayList<Task> newToDoList = new ArrayList<Task>();

		for(Task task:toDoList)
		{
			if(task.getTaskId()!=taskId)
				newToDoList.add(task);
		}
		toDoList=newToDoList;
		return true;
	}
}
