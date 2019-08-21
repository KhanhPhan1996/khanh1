package POLYMORPHISM;

public class Employee extends Person {
	private double luong;

	public double getLuong() {
		return luong;
	}

	public void setLuong(double luong) {
		this.luong = luong;
	}
	
	@Override
	public void ThongTin() {
		System.out.println("Class con");
	}

}
