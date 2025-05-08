package actor;

public class Actor {
	private String name;
	private String birthDate;
	private int semester;
	
	public Actor(String name, String birthDate) {
		this.name = name;
		this.birthDate = birthDate;
		
		System.out.printf("Actor " + this.getName() + " Created\n");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}
	
	public void showName() {
		System.out.println(this.name);
	}
	
}
