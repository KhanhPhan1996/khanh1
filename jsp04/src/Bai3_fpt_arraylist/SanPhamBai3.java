package Bai3_fpt_arraylist;

import java.util.Scanner;

public class SanPhamBai3 {
	public String ten;
	public double gia;
	
	public SanPhamBai3() {
		super();
	}

	public SanPhamBai3(String ten, double gia) {
		super();
		this.ten = ten;
		this.gia = gia;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);	
			System.out.print(" Nhap ten san pham : ");
			ten = sc.nextLine();
			System.out.print(" Nhap gia san pham : ");
			gia = sc.nextDouble();	
	
	}
	public void xuat() {
		System.out.println(" Ten san pham : " + ten);
		System.out.println(" Gia san pham : " + gia);

	}
}
