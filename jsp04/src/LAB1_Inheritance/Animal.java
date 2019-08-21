package LAB1_Inheritance;

public class Animal {
	public String name;
	public int age;
	public Animal(String name, int age ) {
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println(" Animal can move");
	}

}
