package actor;

import java.util.ArrayList;

import academic.Course;

public class Student extends Actor implements IAttandance {
	private String NIM;
	private Course course;
	private ArrayList<Class> classes = new ArrayList<Class>();
	
	public Student(String NIM, String nama, String birthDate) {
		super(nama, birthDate);
		this.setNIM(NIM);
		System.out.printf("Student " + this.getName() + " Created\n\n");
	}

	public void showCredits(int semester) {
		this.setSemester(semester);
		System.out.printf(this.getName() + " credits is " + semester + " in " + course.getCoruseName() + "\n");
	}

	public String getNIM() {
		return NIM;
	}

	public void setNIM(String nIM) {
		NIM = nIM;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

}
