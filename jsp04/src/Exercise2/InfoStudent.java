package Exercise2;

public class InfoStudent {
	
	private String name;
	private int age;
	private String gender;
	

	public InfoStudent(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public void Info() {
		System.out.println("--------------Show info--------------");
		System.out.println("Name : " + this.name);
		System.out.println("Age : " + this.age);
		System.out.println("Gender : " + this.gender);
		
	}

	
	
}
