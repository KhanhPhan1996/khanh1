package Fpt;

public class ThamSoPhuongThuc {
	static void m(int x) {
		x+=5;
	}
	void m(int[] x) {
		x[0] += 5;
		System.out.println(x[0]);
		
	}
	
	public static void main(String[] args) {
		int x = 3;
		m(x);
		System.out.println();
	
	}

}



