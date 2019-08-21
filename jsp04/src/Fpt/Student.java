package Fpt;

import java.util.Scanner;

public class Student {
	private String name;
	private double point;
	public Student() {
		
	}
	
	public Student(String name, double point) {
		this.name = name;
		this.point = point;
		setPoint(point);
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Nhap ten: ");
		this.name = sc.nextLine();
		
		System.out.print(" Nhap diem: ");
		this.point = sc.nextDouble();
		setPoint(point);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		if(point < 0 || point > 10) {
			System.out.println(" Nhap diem khong hop le");
		}
		else {
		this.point = point;
		}
	}

	public void output() {
		System.out.println("----------Show Info----------");
		System.out.println(" Ten: " + this.name);
		System.out.println(" Diem: " + this.point);
		xepLoai();
	}
	
	public String xepLoai() {
		if(this.point >=0 && this.point < 5) {
			System.out.println(" Hoc luc: Yeu");
		}
		else if(this.point >= 5 && this.point <= 6.5) {
			System.out.println(" Hoc luc: Trung binh");
		}
		else if(this.point >= 6.5 && this.point < 7.5) {
			System.out.println(" Hoc luc: Kha");
		}
		else if(this.point >= 7.5 && this.point < 9) {
			System.out.println(" Hoc luc: Gioi");
		}
		else if(this.point >= 9 && this.point <= 10) {
			System.out.println(" Hoc luc: Gioi");
		}
		else {
			System.out.println(" Hoc luc:: Bi loi");
		}
		return name;
	}

	

}
