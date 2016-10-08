package StudentRegistrationSystem.student_registration_system;

import java.util.ArrayList;

public class Module {
	private String name;
	private String id;
	private ArrayList<Student> students = new ArrayList<Student>();
	private Course course;
	
	public Module(String name, String id, ArrayList<Student> students){
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

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
		for(Student student: students) {
			student.setModule(this);
			if(student.getCourse() == null) {
				student.setCourse(this.course);
			}
		}
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}	
	
	public String toString() {
		return getName() + " (" + getId() + ")";
	}
}
