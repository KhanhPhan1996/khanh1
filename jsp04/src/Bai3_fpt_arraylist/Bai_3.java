package Bai3_fpt_arraylist;

import java.awt.Component;
import java.awt.List;
import java.awt.image.SampleModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bai_3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SanPhamBai3 sanPham = null;
		ArrayList<SanPhamBai3> list = new ArrayList<SanPhamBai3>();
		
		boolean flag = false;
		do {
			System.out.println("----------MENU----------");
			System.out.println("1. Nhap danh sach");
			System.out.println("2. Sap xep giam dan va xuat ra man hinh");
			System.out.println("3. Nhap ten va xem thong tin san pham");
			System.out.println("4. Tim va xoa san pham theo ten");
			System.out.println("5. Gia tri trung binh cac san pham");
			System.out.println("--------------------");
			
			System.out.print(" Nhap lua chon cua ban : ");
			int n = sc.nextInt();
			
			switch (n) {
			case 1:
				System.out.println("1. Nhap danh sach");
				Scanner sc2 = new Scanner(System.in);
				while (true) {
					sanPham = new SanPhamBai3();
					sanPham.nhap();
					list.add(sanPham);
					
					System.out.print(" Nhap them (y/n) : ");
					if(sc2.nextLine().equals("n")) {
						break;
					}
				}
				break;
			case 2:
				System.out.println("2. Sap xep giam dan va xuat ra man hinh");
				
				for (int i = 0; i < list.size(); i++) {
					System.out.println(" San pham thu : " + (i+1) );
					list.get(i).xuat();
//					Comparator<SanPhamBai3> c = new Comparator<SanPhamBai3>() {
//						
//
//						@Override
//						public int compare(SanPhamBai3 o1, SanPhamBai3 o2) {
//							
//							return o1.gia.compareTo(o2.gia);
//						}
//					};
//					Collections.sort(list, c);
				}
				break;
			case 3:
				Scanner sc3 = new Scanner(System.in);
				System.out.println("3. Nhap ten va xem thong tin san pham");
				System.out.print(" Nhap ten san pham : ");
				String ten1 = sc3.nextLine();
				for (int i = 0; i < list.size(); i++) {
					if(ten1.equals(list.get(i).ten)) {
						list.get(i).xuat();
					}
				}
				break;
			case 4:
				Scanner sc4 = new Scanner(System.in);
				System.out.println("4. Tim va xoa san pham theo ten");
				System.out.print(" Nhap ten san pham can tim va xoa : ");
				String ten2 = sc4.nextLine();
				for (int i = 0; i < list.size(); i++) {
					if(ten2.equals(list.get(i).ten)){
						list.get(i).xuat();
						list.remove(i);
					}
				}
				System.out.println(" Danh sach san pham con lai : ");
				for (int i = 0; i < list.size(); i++) {
					System.out.println(" San pham thu : " + (i+1) );
					list.get(i).xuat();
				}

				break;
			case 5:
				System.out.println("5. Gia tri trung binh cac san pham");
				double tong = 0;
				double trungBinh = 0;
				for (int i = 0; i < list.size(); i++) {
					tong += list.get(i).gia;
				}
				trungBinh = tong/list.size();
				System.out.println(" Gia tri trung binh cua " + list.size() + " san pham la : " + trungBinh);
				break;

			}

		} while (flag == false);
	
	
	}
}
