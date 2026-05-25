package oopsProgramming.encapsulation;

public class StudentMain {

	public static void main(String[] args) {
		Student student1 = new Student(1, "Dhruvil");
		Student student2 = new Student(2, "Patel");

		student1.displayDetails();
		student2.displayDetails();
	}
}
