import static org.junit.Assert.*;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Test;

public class ToDoListTest {

	@Test
	public void AddTaskTest() {
		ToDoList todolist = new ToDoList();
		Task newTask = new Task(1, "Test", "Testing", 1, false);
		todolist.addItem(newTask);
		assertEquals(1, todolist.getItems().size());
		}

	@Test
	public void ExportListTest() {
		ToDoList todolist = new ToDoList();
		Task newTask = new Task(1, "Test", "Testing", 1, false);
		todolist.addItem(newTask);
		todolist.exportToFile();
		File f = new File("C:\\temp\\todolist.txt");
		assertTrue(f.exists());
		}
	
}
