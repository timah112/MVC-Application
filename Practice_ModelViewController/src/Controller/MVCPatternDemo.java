package Controller;

import Model.Student;
import View.ExtraViewInfo;
import View.StudentView;

public class MVCPatternDemo {
	public static void main(String[] args) {

		// fetch student record based on his roll no from the database
		Student model = retriveStudentFromDatabase();
		Student model2 = retriveExtraInfo();
		Student model3 = deleteStudent();
		//MVCPatternDemo Demo = new MVCPatternDemo();

		// Create a view : to write student details on console
		StudentView view = new StudentView();
		ExtraViewInfo info = new ExtraViewInfo();

		StudentController controller = new StudentController(model, view);
		StudentController controller2 = new StudentController(model2,info);
		StudentController controller3 = new StudentController(model3,info);
		
		controller.updateView();
		controller2.viewExtraInfo();
		
		
		// update model data
		controller.setStudentName("John");


		controller.updateView();
	}

	private static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Atif");
		student.setRollNo("1011");
		student.setAge(24);
		return student;
	}
	
	private static Student retriveExtraInfo(){
		Student student2 = new Student();
		student2.setSchoolName("Suffolk");
		return student2;
	}
	
	private static Student anotherRetrieval(){
		Student student = new Student();
		student.getName();
		
		return null;
		
	}
	
	private static Student deleteStudent(){
		Student student = new Student();
		student = null;
		return student;
	}
}
