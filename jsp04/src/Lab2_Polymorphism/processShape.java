package Lab2_Polymorphism;

public class processShape {
	public static void main(String[] args) {
//		Retangle retangle = new Retangle();
//		retangle.length = 12;
//		retangle.width = 2;
//		System.out.println(retangle.getArea());
//		
//		Triangle triangle = new Triangle();
//		triangle.base = 20;
//		triangle.height = 9;
//		System.out.println(triangle.getArea());
		
		Shape shape = new Shape();
		shape = new Triangle("Yellow",23,2);
	
		
		
		System.out.println("Color : " + shape.toString());
		System.out.println("Area : " + shape.getArea());
		
		shape = new Retangle("Red",4, 5);
		System.out.println("Color : " + shape.toString());
		System.out.println("Area : " + shape.getArea());
		
		shape = new Triangle("Red",7, 5);
		System.out.println("Color : " + shape.toString());
		System.out.println("Area : " + shape.getArea());
		
		
		
		
		
		
		
		
		
		
	}

}
