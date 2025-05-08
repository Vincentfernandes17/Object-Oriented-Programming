package actor;

import academic.Course;

public class Lecturer extends Actor implements IAttendee {
	private Course course;	
	private String lecturerCode;
	
	public Lecturer(String code, String Name, String birthDate) {
		super( Name, birthDate);
		this.setLecturerCode(code);
		System.out.printf("Lecturer " + this.getName() + " Created\n\n");
	}

	public void addSemester(int semester) {
		this.setSemester(semester);
		System.out.printf(this.getName() + " semester is " + semester + "\n");
	}
	
	public void addCourse(Course course) {
		this.course = course;
	}

	public void showCourse(int credit) {
		System.out.printf(this.getName() + " is teaching " );
		course.showCourseName();
		System.out.println();
	}

	public String getLecturerCode() {
		return lecturerCode;
	}

	public void setLecturerCode(String lecturerCode) {
		this.lecturerCode = lecturerCode;
	}
}
