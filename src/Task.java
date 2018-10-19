public class Task {

	private int taskId;
	private String taskName;
	private String taskContent;
	private int taskPriority;
	private boolean isComplete = false;
	
	public Task(int taskId, String taskName, String taskContent, int taskPriority, boolean isComplete) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.taskContent = taskContent;
		this.taskPriority = taskPriority;
		this.isComplete = isComplete;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskContent() {
		return taskContent;
	}

	public void setTaskContent(String taskContent) {
		this.taskContent = taskContent;
	}

	public int getTaskPriority() {
		return taskPriority;
	}

	public void setTaskPriority(int taskPriority) {
		this.taskPriority = taskPriority;
	}

	public boolean isComplete() {
		return isComplete;
	}

	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}

}
