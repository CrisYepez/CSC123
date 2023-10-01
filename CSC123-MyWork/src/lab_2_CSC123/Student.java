package lab_2_CSC123;

public class Student {

	private String Name;
	private String School;
	private String Major;
	private int Age;
	private double GPA;
	
	public void Student( String name, String school, String major, int age, double gpa) {
		this.Name = name;
		this.School = School;
		this.Major = Major;
		this.Age = Age;
		this.GPA = GPA;
		
		
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSchool() {
		return School;
	}

	public void setSchool(String school) {
		School = school;
	}

	public String getMajor() {
		return Major;
	}

	public void setMajor(String major) {
		Major = major;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}
}
