package firstEighteenEight;

public class Main {

	public static void main(String[] args) {
		
		
		Lesson lesson1 = new Lesson();
		lesson1.id=1;
		lesson1.name="1-History";
		Lesson lesson2 = new Lesson(2,"2-Math");
		
		Lesson[] lessons = {lesson1,lesson2};
		for (Lesson lesson : lessons) {
		}
		
		Task task1 =new Task(2,"1-Atatürk","Atatürk's life");
		Task task2 = new Task();
		task2.id=1;
		task2.name="2-Triangles";
		task2.description="Interior Angles ın Triangles";
		
		
		
		Task[] tasks ={task1,task2};
		for ( Task task : tasks) {
		}
		
		LessonManager lessonManager = new LessonManager();
		TaskManager taskManager = new TaskManager();
		lessonManager.adToLessonManager(lesson1);
		taskManager.adToTask(task1);
		lessonManager.adToLessonManager(lesson2);
		taskManager.adToTask(task2);
		
		
		
	}

}
