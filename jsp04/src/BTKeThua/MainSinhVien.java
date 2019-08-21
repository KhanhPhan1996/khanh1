package BTKeThua;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainSinhVien {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		SinhVienIT sinhVienIT;
		ArrayList<SinhVienIT> sinhVienList = new ArrayList<SinhVienIT>() ;
		boolean flag = false;
		do {
			System.out.println("----------MENU----------");
			System.out.println("1. Nhap danh sach sinh vien");
			System.out.println("2. Xuat danh sach sinh vien");
			System.out.println("3. Xuat danh sach sinh vien gioi");
			System.out.println("4. Sap xep sinh vien theo diem");
			System.out.println("5. Thoat");
			
			System.out.print(" Moi ban nhap so : ");
			int s = sc.nextInt();
			
			switch (s) {
			case 1:
				System.out.println("1. Nhap danh sach sinh vien");
				Scanner sc2 = new Scanner(System.in);
				while (true) {
					System.out.println(" Nhap thong tin sinh vien ");
					sinhVienIT = new SinhVienIT();
					sinhVienIT.nhap();
					sinhVienList.add( sinhVienIT);
					
					System.out.print(" Ban muon nhap them (y/n) : ");
					if(sc2.nextLine().equals("n")) {
						break;
					}
				}
				
				break;
			case 2:
				System.out.println("2. Xuat danh sach sinh vien");
				for (int i = 0; i < sinhVienList.size(); i++) {
					System.out.println(" Thong tin sinh vien thu " + (i + 1) + " la : ");
					sinhVienList.get(i).xuat();
				}

				
				break;
			case 3:
				System.out.println("3. Xuat danh sach sinh vien gioi");
				for (int i = 0; i < sinhVienList.size(); i++) {
					if (sinhVienList.get(i).gethocLuc().equals("Gioi")) {
					System.out.println(" Sinh vien gioi thu " + (i + 1) + " la : ");
					System.out.println("Ten : " + sinhVienList.get(i).getHoTen());
					}
				}

				
				break;
			case 4:
				System.out.println("4.Sap xep sinh vien theo diem");
					Collections.sort(sinhVienList, new Comparator<SinhVienIT>() {
						@Override
						public int compare(SinhVienIT o1, SinhVienIT o2) {
							// TODO Auto-generated method stub
							return o1.getDiem() < o2.getDiem() ? 1 : -1;
						}
						
					});
					for (int i = 0; i < sinhVienList.size(); i++) {
						System.out.println(" Thong tin sinh vien thu " + (i + 1) + " la : ");
						sinhVienList.get(i).xuat();
						}
					
				break;
			case 5:
				System.out.println("5. Thoat");
				flag = true;
				break;
			}
		} while (flag == false);
	}

}
