package Lab5;

import java.util.Scanner;

public class Employee2 {
	Scanner sc = new Scanner(System.in);
	Scanner sc1 = new Scanner(System.in);

	private String name;
	private int age;
	private String job;
	private double salary;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void inPut() {
		System.out.print(" Enter Employee'name is : ");
		this.name = sc.nextLine();
		System.out.print(" Enter Employee'age is : ");
		this.age = sc1.nextInt();
		System.out.print(" Enter Employee'job is : ");
		this.job = sc.nextLine();
		System.out.print(" Enter Employee'salary is : ");
		this.salary = sc.nextDouble();
	}
	public void outPut() {
		System.out.println(" Employee'name is : " + name);
		System.out.println(" Employee'age is : " + age);
		System.out.println(" Employee'job is : " + job);
		System.out.println(" Employee'salary is : " + salary);
	}
	
}
