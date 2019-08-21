package OverloadMethod;

public class SuperClass {
	public int tong2So(int a, int b) {
		return a + b;
		
	}
	
	public long tong2So(int a,long b) {
		return a + b ;
	}
	
	public float tong2So(float a, float b) {
		return a + b;
	}
	
	public float tong2So(float a) {
		return a + 10;
	}
	
	public static void main(String[] args) {
		SuperClass superClass = new SuperClass();
		System.out.println(superClass.tong2So(12));
	}
}


