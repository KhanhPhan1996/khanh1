package VinaEnter;

import java.util.Scanner;

public class Sach {
	private int ma;
	private String name;
	
	
	public Sach() {
		System.out.println("Lop cha");
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);

		System.out.println(" Nhap ma : ");
		this.ma = sc.nextInt();
		System.out.println(" Nhap ten : ");
		this.name = sc1.nextLine();
	}
	
	public String toString() {
		return "Sach{" + "ma=" + ma + ", name=" + name + '}'; 
	}
}
