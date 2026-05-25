package oopsProgramming.inheritance;

public class ClassStudent {

	private int courseNumber;
	private String courseName;

	public ClassStudent(int courseNumber, String courseName) {
		this.courseNumber = courseNumber;
		this.courseName = courseName;
	}

	public int getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
}
