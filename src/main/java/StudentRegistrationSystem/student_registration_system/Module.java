package StudentRegistrationSystem.student_registration_system;

import java.util.ArrayList;

public class Module {
	private String name;
	private String id;
	private ArrayList<Student> students = new ArrayList<Student>();
	
	public Module(String name, String id, Student... students){
		this.setName(name);
		this.setId(id);
		setStudents(students);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		for (Student student: students) {
		 this.students.add(student);
		}
	}	
}
