package TrungTamJaVa;

public class Mouse extends Animal{
	public int weight;
	
	public Mouse() {
		this(100);
	}

	public Mouse(int weight) {
		this.weight = weight;
	}
	
	public Mouse(String name, int weight) {
		super(name);
		this.weight = weight;
	}

	


	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String getAnimalName() {
		return "Mouse";
	}
	
	 

}
