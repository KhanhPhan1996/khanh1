package Overloading;

public class Test {
	public static void main(String[] args) {
		Dog dog = new Dog("kiki", 2);
		Tiger tiger = new Tiger("Jack", 2);
		Elephent elephent = new Elephent("Lu", 1);
		Parrot parrot = new Parrot("Cac", 3);
		
		dog.inPut();
		tiger.inPut();
		elephent.inPut();
		parrot.inPut();
	}

}
