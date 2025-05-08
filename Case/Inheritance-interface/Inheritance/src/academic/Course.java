package academic;

public class Course {
	private String courseCode;
	private String courseName;
	private int credit;
	
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getCoruseName() {
		return courseName;
	}
	
	public void showCourseName() {
		System.out.println(this.courseName);
	}
	
	public void setCoruseName(String coruseName) {
		this.courseName = coruseName;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}

	public Course(String courseCode, String courseName, int credit) {
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.credit = credit;
	}

}
