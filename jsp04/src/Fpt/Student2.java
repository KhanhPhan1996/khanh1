package Fpt;

import java.util.Scanner;

public class Student2 {
	private String hoTen;
	private double diemTB;
	public Student2() {

	}
	
	
	public Student2(String hoTen, double diemTB) {
		super();
		this.hoTen = hoTen;
		this.diemTB = diemTB;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public double getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}
	
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Nhap ho ten sinh vien : ");
		hoTen = sc.nextLine();
		System.out.print(" Nhap diem trung binh sinh vien : ");
		diemTB = sc.nextInt();
	}
	
	public void inThongTin() {
		System.out.println(" Ho ten : " + hoTen);
		System.out.println(" Diem trung binh : " + diemTB);
	}
	
	

}
