import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class AddItemTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		//Create sample Task
		int taskId =1;
		String taskName="test1";
		String taskContent="test1";
		int taskPriority= 1;
		boolean isComplete = false;
		
		Task sampleT = new Task(taskId, taskName, taskContent, taskPriority, isComplete);

		//Get The List and Tempory add
		ToDoList testObject = new ToDoList();
		testObject.addItem(sampleT);
		
		//Check The list
		boolean itemfound = false;
		for (Task s : testObject.getItems()){
			//System.out.println(s);
			if(s.equals(sampleT))
			{
				itemfound = true;
			}
		}
		
		//Return result
		assertTrue(itemfound);
	}

}
