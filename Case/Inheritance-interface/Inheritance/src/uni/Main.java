package uni;

import actor.Student;
import actor.Lecturer;

import academic.Class;
import academic.Course;

public class Main {

	public static void main(String[] args) {
		//Student(nim, name, dob)
		Student stu1 = new Student("2809312213", "David", "16-7-1999");
		Student stu2 = new Student("2809333797", "Donne", "7-7-1999");
		//Lecturer(lecturerCode, name, dob)
		Lecturer lec1 = new Lecturer("D7732", "Shamuell", "9-9-1999");
		
		//Class(classCode, semester, year)
		Class cl1 = new Class("11LE", 2, "2024/2025"); 
		//Course(courseCode, courseName, credit)
		Course co1 = new Course("COMP990323", "Object Oriented Programming", 2);
		
		cl1.addCourse(co1);
		
		//addStudent(Student)
		cl1.addStudent(stu1);
		cl1.addStudent(stu2);
		//addLecturer(Lecturer)
		cl1.addLecturer(lec1);
		
		//attend(IAttendant)
		cl1.attend(stu1);
		cl1.attend(stu2);
		//takeAttendance(IAttendee)
		cl1.takeAttendance(lec1);
		
		cl1.showTodayAttendance();
		
		//showCredits(semester)
		stu1.showCredits(2);
		
		//showCourse(semester)
		lec1.showCourse(2);
	}

}
