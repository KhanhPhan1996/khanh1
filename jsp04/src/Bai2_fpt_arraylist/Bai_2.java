package Bai2_fpt_arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Bai_2 {
	static String hoTen;
	static ArrayList<String> listHoTen = new ArrayList<String>();


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> listHoTen = new ArrayList<String>();
		boolean flag = false;
		do {
			System.out.println("-----------MENU-----------");
			System.out.println("1. Nhap danh sach ho va ten ");
			System.out.println("2. Xuat danh sach ");
			System.out.println("3. Xuat danh sach ngau nhien ");
			System.out.println("4. Sap xep giam dan va xuat danh sach ");
			System.out.println("5. Tim va xoa ho ten ");
			System.out.println("6. Ket thuc ");
			System.out.println("-------------------------");
			
			System.out.print(" Nhap lua chon cua ban : ");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.println("1. Nhap danh sach ho va ten ");
				hoTen();
				break;
			case 2:
				System.out.println("2. Xuat danh sach ");
				danhSach();
				break;
			case 3:
				System.out.println("3. Xuat danh sach ngau nhien ");
				danhSachNgauNhien();
				break;
			case 4:
				System.out.println("4. Sap xep giam dan va xuat danh sach ");
				sapXepDanhSach();
				break;
			case 5:
				System.out.println("5. Tim va xoa ho ten ");
				xoaHoTen();
				break;
			case 6:
				System.out.println("6. Ket thuc ");
				flag = true;
				break;
			}
		} while (flag == false);
		
	}
	public static void hoTen() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print(" Nhap ho ten : ");
			hoTen = sc.nextLine();
			listHoTen.add(hoTen);
			
			System.out.print(" Nhap them (Y/N) : ");
			if(sc.nextLine().equals("N")) {
				break;
			}
		}
	}
	public static void danhSach() {
		for (int i = 0; i < listHoTen.size(); i++) {
			System.out.print(" Ho ten nguoi thu " + (i+1) + " la: " + listHoTen.get(i));
			System.out.println();
		}
		
	}
	public static void danhSachNgauNhien() {
		Collections.shuffle(listHoTen);
		danhSach();
		
	}
	public static void sapXepDanhSach() {
		Collections.sort(listHoTen);
		Collections.reverse(listHoTen);
		danhSach();
	}
	public static void xoaHoTen() {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Nhap ten can xoa : ");
		String hoTen1 = sc.nextLine();
		for (int i = 0; i < listHoTen.size(); i++) {
			if( hoTen1.equals(listHoTen.get(i))) {
				listHoTen.remove(i);
				break;
			}
		}	
			System.out.println(" Danh sach sau khi xoa : ");
			danhSach();
		}
		
		
	}

