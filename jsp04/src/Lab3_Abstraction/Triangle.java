package Lab3_Abstraction;

public class Triangle extends Shape{
	public int base;
	public int height;
	@Override
	public double getArea() {
		return (base*height)/2;
	}
	@Override
	public String toString() {
		return super.toString();
	}
	
}
