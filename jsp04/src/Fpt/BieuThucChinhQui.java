package Fpt;

import java.util.Scanner;

public class BieuThucChinhQui {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print(" Nhap email : ");
//		String email = sc.nextLine();
//		System.out.print(" Nhap sdt : ");
//		String sdt = sc.nextLine();
		System.out.print(" Nhap bien so xe : ");
		String bsx = sc.nextLine();
		
//		String reEmail = "\\w+@\\w+\\.\\w+";
//		if(email.matches(reEmail)) {
//			System.out.println(" Email nhap vao hop le");
//		}else {
//			System.out.println(" Email nhap vao khong hop le");
//		}
//		
//		String reSdt = "0\\d{0,9}";
//		if(sdt.matches(reSdt)){
//			System.out.println(" Sdt nhap vao hop le");
//		}else {
//			System.out.println(" Sdt nhap vao khong hop le");
//		}
		
		String reBsx = "[0-9]{2}  ";
		if(bsx.matches(reBsx)){
			System.out.println(" Bsx nhap vao hop le");
		}else {
			System.out.println(" Bsx nhap vao khong hop le");
		}
		
	}
}
