package Lab2_Polymorphism;

public class Retangle extends Shape {
	public int length;
	public int width;
	
	public Retangle(String color, int length, int width) {
		this.color = color;
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {
		return length*width;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	

}
