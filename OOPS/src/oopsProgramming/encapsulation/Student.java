package oopsProgramming.encapsulation;

public class Student {

	private int roll_number;
	private String name;
	

	public Student(int roll_number, String name) {
		this.roll_number = roll_number;
		this.name = name;
	
	}

	public int getroll_number() {
		return roll_number;
	}

	public void setroll_number(int roll_number) {
		this.roll_number = roll_number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public void displayDetails() {
		System.out.println("Student roll-Number is : "+ roll_number);
		System.out.println("Student name is : "+ name);
		
	}
}
