package bai3_interface_FPT;

import java.util.Scanner;

public class Student extends Person{
	
	private int mark;
	private String grade;
	
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public String getGrade() {
		if(mark >= 8 ) grade = "Distinction";
		else if (mark >= 7) grade = "Credit";
		else if (mark >= 5) grade = "Pass";
		else if (mark >= 0) grade = "Fail";
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	

	public Student() {
		super();
	}
	
	
	public Student(String id, String name, int age, int mark, String grade) {
		super(id, name, age);
		this.mark = mark;
		this.grade = grade;
	}
	
	
	
	@Override
	public void inPut() {
		super.inPut();
		Scanner sc3 = new Scanner(System.in);
		System.out.println(" Enter mark: ");
		this.mark = sc3.nextInt();
		Scanner sc4 = new Scanner(System.in);
		this.grade = sc4.nextLine();
	}
	
	@Override
	public void disPlay() {
		super.disPlay();
		System.out.println(" Mark: " + getMark());
		System.out.println(" Grade: " + getGrade());
	}

}
