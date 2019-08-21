package Overloading;

public class Animal {
	private String name;
	private int age;
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void inPut() {
		System.out.println("Name :" + name);
		System.out.println("Age : " + age);
	}

}
