package StudentRegistrationSystem.student_registration_system;

import org.joda.time.LocalDate;

import junit.framework.TestCase;

public class StudentTest extends TestCase {
	public void testUsernameGeneration() {
		Student s1 = new Student("Enda", 20, new LocalDate(1996,05,29), 13463878);
		assertEquals("Enda20", s1.getUsername());
	}
}
