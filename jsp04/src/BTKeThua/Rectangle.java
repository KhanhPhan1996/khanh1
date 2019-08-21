package BTKeThua;

public class Rectangle {
	float length;
	float width;
	
	
	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}

	public float getArea() {
		return length*width;
	}
	
	public float getPerimeter() {
		return (length + width)*2;
	}
	
	public void outPut() {
		System.out.println("----------Rectangle----------");

		System.out.println(" Length : " + length);
		System.out.println(" Width : " + width );
		System.out.println(" Area : " + getArea());
		System.out.println(" Perimeter : " + getPerimeter());
	}
	

}
