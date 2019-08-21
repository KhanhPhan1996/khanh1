package OverloadMethod;

public class SubClass extends SuperClass {
	@Override
	public float tong2So(float a) {
		System.out.println(super.tong2So(a));
		return a + 14;
	}
	
	@Override
	public int tong2So(int a, int b) {
		return a + b + 12;
	}
	
	public static void main(String[] args) {
		SubClass subclass = new SubClass();
		 
//		System.out.println(subclass.tong2So(12, 3));
		System.out.println(subclass.tong2So(12));
		
		SuperClass superClass = new SuperClass();
		System.out.println(superClass.tong2So(12));
	}
}
