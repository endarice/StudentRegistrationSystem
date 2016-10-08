package StudentRegistrationSystem.student_registration_system;

import java.util.ArrayList;

import org.joda.time.LocalDate;

public class Student {
	private String name;
	private int age;
	private LocalDate dob;
	private int id;
	private String username;
	private ArrayList<Module> modules = new ArrayList<Module>();
	private Course course;
	
	public Student(String name, int age, LocalDate dob, int id) {
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.id = id;
		setUsername();
	}

	public void setModule(Module module) {
		this.modules.add(module);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public LocalDate getDob() {
		return dob;
	}
	
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername() {
		this.username = new StringBuilder().append(this.name).append(this.age).toString();
	}

	public ArrayList<Module> getModules() {
		return modules;
	}
	
	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}	
}
