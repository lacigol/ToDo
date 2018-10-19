import static org.junit.Assert.*;

import org.junit.Test;

public class ToDoListTest {

	@Test
	public void AddTaskTest() {
		ToDoList todolist = new ToDoList();
		Task newTask = new Task(1, "Test", "Testing", 1, false);
		todolist.addItem(newTask);
		assertEquals(1, todolist.getItems().size());
		}

}
