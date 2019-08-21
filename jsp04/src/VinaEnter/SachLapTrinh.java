package VinaEnter;

import java.util.Scanner;

public class SachLapTrinh extends Sach {
	private int soTrang;
	@Override
	public void nhap() {
		super.nhap();
		Scanner s = new Scanner(System.in);
		System.out.println(" Nhap so trang : ");
		this.soTrang = s.nextInt();
	}
	
	@Override
	public String toString() {
        return super.toString() + "- so trang : "+soTrang;
	}
}
