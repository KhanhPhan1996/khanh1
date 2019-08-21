package Lab2_Polymorphism;

public class Triangle extends Shape {
	public int base;
	public int height;
	
	public Triangle(String color, int base, int height) {
		this.color = color;
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea() {
		return (height*base)/2;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	

}
