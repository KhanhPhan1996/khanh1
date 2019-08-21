package Lab5;

import java.util.Scanner;

public class Employee {
	public String name;
	public int age;
	public String job;
	public int salary;
	public Employee() {
	}
	public Employee(String name, int age, String job, int salary) {
		this.name = name;
		this.age = age;
		this.job = job;
		this.salary = salary;
	}
	
	public void inPut() {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		System.out.print(" Enter employee's name : ");
		name = sc.nextLine();
		System.out.print(" Enter employee's age : ");
		age = sc.nextInt();
		System.out.print(" Enter employee's job : ");
		job = sc2.nextLine();
		System.out.print(" Enter employee's salary : ");
		salary = sc2.nextInt();
	}
	
	public void outPut() {
		System.out.println(" Employee's name : " 	+ name);
		System.out.println(" Employee's age : " 	+ age);
		System.out.println(" Employee's job : " 	+ job);
		System.out.println(" Emplpyee's salary : " 	+ salary);
		
	}
	

}
