package Lab3_Abstraction;

public class Main {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.color = "yellow";
		rectangle.length = 12;
		rectangle.width = 16;
		
		System.out.println(" Color : " + rectangle.toString());
		System.out.println(" Area : " + rectangle.getArea());
		
		Triangle triangle = new Triangle();
		triangle.color = "Red";
		triangle.base = 4;
		triangle.height = 18;
		
		System.out.println(" Color : " + triangle.toString());
		System.out.println(" Area : " + triangle.getArea());
	
		
	}
}
