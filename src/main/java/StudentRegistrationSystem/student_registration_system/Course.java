package StudentRegistrationSystem.student_registration_system;

import java.util.ArrayList;
import org.joda.time.LocalDate;

public class Course {
	private String name;
	private ArrayList<Module> modules = new ArrayList<Module>();
	private LocalDate startDate;
	private LocalDate endDate;
	
	public Course(String name, ArrayList<Module> modules, LocalDate startDate, LocalDate endDate) {
		this.setName(name);
		this.setStartDate(startDate);
		this.setEndDate(endDate);
		this.setModules(modules);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public ArrayList<Module> getModules() {
		return modules;
	}
	
	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
		for (Module module: modules) {
			module.setCourse(this);
		}
	}
}
