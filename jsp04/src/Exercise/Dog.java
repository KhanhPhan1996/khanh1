package Exercise;

public class Dog {
	public String name ;
	public int age ;
	public String color ;
	
	public Dog(String name,int age,String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}
	
	public void waggingTheTail (String waggingTheTail) {
		System.out.println("Wagging :" + waggingTheTail);
	}
	
    public void barking (String barking) {
		System.out.println("barking :" + barking);

	}

    public void eating (String eating ) {
		System.out.println("eating :" + eating);

	
}

}
