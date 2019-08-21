package Lab3_Abstraction;

public class Rectangle extends Shape{
	public int length;
	public int width;
	@Override
	public double getArea() {
		return length*width;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
