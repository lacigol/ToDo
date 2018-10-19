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
		int taskid = 1;
		if(toDoList.size() > 0){
			Task TempTask = toDoList.get(toDoList.size() -1);
			taskid = TempTask.getTaskId() + 1;
		}
		return toDoList.add(task);
	}
	public void setTaskPriority(Task task, int taskPriority){
		Task temp = task;
		boolean itemfound = false;
		//for (int i = 0; i < toDoList.size(); i++){
		int num = toDoList.indexOf(task);
		if(num >= 0)
		{
			temp.setTaskPriority(taskPriority);
			//toDoList.remove(task);
			toDoList.set(num, temp);
		}
		for (Task s : toDoList){
			if(toDoList.equals(task))
			{
				itemfound = true;
				
			}
		}
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
