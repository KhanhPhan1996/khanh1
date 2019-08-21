package BTKeThua;

import java.util.Scanner;

public class SinhVienBiz extends SinhVienPoLy{
	Scanner sc = new Scanner(System.in);
	private double marketting;
	private double sale;
	
	public double getMarketting() {
		return marketting;
	}
	public void setMarketting(double marketting) {
		this.marketting = marketting;
	}
	public double getSale() {
		return sale;
	}
	public void setSale(double sale) {
		this.sale = sale;
	}

	@Override
	public void nhap() {
		super.nhap();
		System.out.println(" Nhap diem maketting : ");
		marketting = sc.nextDouble();
		System.out.println(" Nhap diem sale : ");
		sale = sc.nextDouble();
	}
	
	@Override
	public double getDiem() {
		return (2*marketting + sale)/3;
	}
	
	

}
