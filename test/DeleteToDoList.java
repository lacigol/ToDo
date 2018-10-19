import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
public class DeleteToDoList {
//Assumption: TaskId is used to delete an item,thus it should be unique
	@Test
	public void deleteSingleObject() {
		//GIVEN - a list
		ToDoList toDoList = new ToDoList();
		
		//Pretend to mock todolist items here
		int taskId=1;
		String taskName="test";
		String taskContent="test";
		int taskPriority=1;
		boolean isComplete=false;
		Task task = new Task(taskId,taskName,taskContent,taskPriority,isComplete); //int taskId, String taskName, String taskContent, int taskPriority, boolean isComplete
		toDoList.addItem(task);
		
		//WHEN - User delete item
		toDoList.deleteItem(taskId);
		//THEN - Item gone from list
		ArrayList<Task> taskList=toDoList.getItems();
		for(Task taskItem:taskList)
		{
			assertNotSame(task, taskItem);
		}
	}
	@Test
	public void deleteTaskInEmptyList() {
		//GIVEN - an empty list
		ToDoList toDoList = new ToDoList();
		
		//WHEN - User try to delete an item
		int taskId=1;
		//Assume task id is unique key
		toDoList.deleteItem(taskId);
		//THEN - Nothing happens
	}
	@Test
	public void deleteTaskInList() {
		//GIVEN - an list with an item
		ToDoList toDoList = new ToDoList();
		
		//Pretend to mock todolist items here
		int taskId=1;
		String taskName="test";
		String taskContent="test";
		int taskPriority=1;
		boolean isComplete=false;
		Task task = new Task(taskId,taskName,taskContent,taskPriority,isComplete); //int taskId, String taskName, String taskContent, int taskPriority, boolean isComplete
		toDoList.addItem(task);
		
		//WHEN - User try to delete an item that does not exist
		int fakeTaskId=2;
		
		toDoList.deleteItem(fakeTaskId);
		//THEN - List remains the same
		ArrayList<Task> taskList=toDoList.getItems();
		for(Task taskItem:taskList)
		{
			assertEquals(task, taskItem);
		}
	}

}
