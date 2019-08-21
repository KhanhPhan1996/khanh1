package bai3_interface_FPT;

import java.util.Scanner;

public class Person implements personExample{
	protected String id;
	protected String name;
	protected int age;
	
	public Person() {
		
	}
	
	public Person(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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

	@Override
	public void inPut() {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println(" Enter Id: ");
		this.id = sc.nextLine();
		System.out.println(" Enter name: ");
		this.name = sc.nextLine();
		System.out.println(" Enter Age: ");
		this.age = sc2.nextInt();
		
	}

	@Override
	public void disPlay() {
		System.out.println("=====Info=====");
		System.out.println(" Id: " + getId());
		System.out.println(" Name: " + getName());
		System.out.println(" Age: " + getAge());


	}

}
