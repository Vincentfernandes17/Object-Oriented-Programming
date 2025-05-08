package academic;

import java.util.ArrayList;

import actor.Actor;
import actor.IAttandance;
import actor.IAttendee;
import actor.Lecturer;
import actor.Student;

public class Class {
	private String classCode;
	private int semester;
	private String year;
	private Course course;
	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<Lecturer> lecturers = new ArrayList<Lecturer>();
	private ArrayList<IAttandance> attandances = new ArrayList<IAttandance>();
	private ArrayList<IAttandance> finalAttandances = new ArrayList<IAttandance>();
	private IAttendee attende;
	
	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Class(String classCode, int semester, String year) {
		this.classCode = classCode;
		this.semester = semester;
		this.year = year;
	}

	public void addStudent(Student student) {
		students.add(student);
		student.setCourse(this.course);
	}

	public void addLecturer(Lecturer lecturer) {
		lecturers.add(lecturer);
		lecturer.addCourse(course);
	}

	public void attend(IAttandance student) {
		attandances.add(student);
	}

	public void takeAttendance(IAttendee lecturer) {
		this.setAttende(lecturer);
		finalAttandances.addAll(attandances);
	}

	public void showTodayAttendance() {
		for (IAttandance iAttandance : finalAttandances) {
			String name = ((Actor) iAttandance).getName();
			System.out.printf(name + " has attend the class"+ "\n");
		}
		System.out.println();
	}

	public void addCourse(Course course) {
		this.course = course;
		for (Lecturer lecturer : lecturers) {
			lecturer.addCourse(course);
		}
	}

	public IAttendee getAttende() {
		return attende;
	}

	public void setAttende(IAttendee attende) {
		this.attende = attende;
	}

}
