package Model;

/**
 * 
 * @author tirmi
 *	This is the the data model class aka the pojo class declaring the fields names
 */
public class Student {
	private String rollNo;
	private String name;
	private int age;
	
	private String SchoolName;

	public String getSchoolName() {
		return SchoolName;
	}

	public void setSchoolName(String SchoolName) {
		this.SchoolName = SchoolName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
