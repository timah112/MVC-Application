package Controller;

import Model.Student;
import View.ExtraViewInfo;
import View.StudentView;

public class StudentController {
	private Student model; // this is composition in java
	private StudentView view;
	private ExtraViewInfo info;

	public StudentController(Student model, StudentView view) {
		this.model = model;
		this.view = view;
	}

	public StudentController(Student model, ExtraViewInfo info) {
		this.model = model;
		this.info = info;
	}

	public void setStudentName(String name) {
		model.setName(name);

	}

	public String getStudentName() {
		return model.getName();
	}

	public void setStudentRollNo(String rollNo) {
		model.setRollNo(rollNo);
	}

	public String getStudentRollNo() {
		return model.getRollNo();
	}

	public void setStudentAge(int age) {
		model.setAge(age);
	}

	public int getStudentAge() {
		return model.getAge();
	}

	public void setStudentSchool(String SchoolName) {
		model.setSchoolName(SchoolName);
	}

	public String getStudentSchoolName() {
		return model.getSchoolName();
	}

	public void updateView() {
		view.printStudentDetails(model.getName(), model.getRollNo(), model.getAge());

	}

	public void viewExtraInfo() {
		// info.viewInfo("Farmingdale");
		info.viewInfo(model.getSchoolName());
	}
}
