package Exercise;

public class Main {
	public static void main(String[] args) {
		Dog dogOne = new Dog("Milu", 3, "Yellow");
		System.out.println(dogOne.name + " " + dogOne.age + " " + dogOne.color );
		dogOne.waggingTheTail(" strong");
		dogOne.barking(" too heart");
		dogOne.eating(" too much");

	}
}
