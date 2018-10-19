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
}
