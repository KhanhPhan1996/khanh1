package Fpt;

import java.util.ArrayList;
import java.util.Scanner;

public class MainStudent {
	public static void main(String[] args) {
		ArrayList<Student2> arrStudent = new ArrayList<Student2>();
		Student2 student = null ;
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);


		boolean flag = true;
		int n = 0;
		do {
			System.out.println("----------------MENU----------------");

			System.out.println("1. Nhap danh sach sinh vien");
			System.out.println("2. Xuat danh sach sinh vien da nhap");
			System.out.println("3. Xuat danh sach sinh vien theo khoang diem");
			System.out.println("4. Tim sinh vien theo ho ten");
			System.out.println("5. Tim va sua sinh vien theo ho ten");
			System.out.println("6. Tim va xoa sinh vien theo ho ten");
			System.out.println("7. Ket thuc");
			System.out.println("---------------------------------");
			
			System.out.print(" Nhap lua chon cua ban : ");
			int m = sc.nextInt();
			
			switch (m) {
			case 1:
				System.out.println("1. Nhap danh sach sinh vien");
				System.out.print(" Nhap so sinh vien : ");
				n = sc.nextInt();
				for(int i = 0;i<n;i++) {
					System.out.println(" Nhap thong tin sinh vien thu " + (i+1) + " : ");
					student = new Student2();
					student.nhapThongTin();
					arrStudent.add(student);
				}
				break;
			case 2:
				System.out.println("2. Xuat danh sach sinh vien da nhap");
				for(int i = 0;i < n;i++) {
					System.out.println(" Thong tin sinh vien thu " + (i+1) + " : ");
					arrStudent.get(i).inThongTin();
					System.out.println();

				}
				break;
			case 3:
				System.out.println("3. Xuat danh sach sinh vien theo khoang diem");
				System.out.println(" Danh sach sinh vien khoang diem [0 ; 5) : ");
				for (int i = 0; i < n; i++) {
					if(arrStudent.get(i).getDiemTB() >= 0 && arrStudent.get(i).getDiemTB() < 5) {
						arrStudent.get(i).inThongTin();
					}
				}
				System.out.println(" Danh sach sinh vien khoang diem [5 -> 10] : ");
				for (int i = 0; i < n; i++) {
					if(arrStudent.get(i).getDiemTB() >= 5 && arrStudent.get(i).getDiemTB() <= 10) {
						arrStudent.get(i).inThongTin();
					}
				}
				break;
			case 4:
				System.out.println("4. Tim sinh vien theo ho ten");
				System.out.print(" Nhap ho ten sinh vien can tim : ");
				String ht = sc1.nextLine();
				for(int i = 0;i < n;i++) {
					if(ht.equals(arrStudent.get(i).getHoTen()) ) {
						arrStudent.get(i).inThongTin();
					}
					}
				break;
			case 5:
				System.out.println("5. Tim va sua sinh vien theo ho ten");
				System.out.print(" Nhap ten sinh vien can sua : ");
				String tenCanSua = sc3.nextLine();
				for (int i = 0; i < n; i++) {
					if(tenCanSua.equals(arrStudent.get(i).getHoTen())) {
						arrStudent.get(i).inThongTin();
						System.out.print(" Sua ten thanh : ");
						String tenSua = sc3.nextLine();
						arrStudent.get(i).setHoTen(tenSua);
						System.out.print(" Sua diem thanh : ");
						double diemSua = sc3.nextDouble();
						arrStudent.get(i).setDiemTB(diemSua);
						arrStudent.add(student);
						
					}
				}
				System.out.println(" Danh sach sinh vien sau khi sua : ");
				for (int i = 0; i < n; i++) {
					arrStudent.get(i).inThongTin();
				}
				
				break;
			case 6:
				System.out.println("6. Tim va xoa sinh vien theo ho ten");
				System.out.print(" Nhap ten sinh vien can xoa : ");
				String ten = sc2.nextLine();
				for (int i = 0; i < n; i++) {
					if(ten.equals(arrStudent.get(i).getHoTen())) {
						arrStudent.get(i).inThongTin();
						arrStudent.remove(i);
					}
				}
				System.out.println(" Danh sach sinh vien con lai : ");
				for (int i = 0; i < n-1; i++) {
					arrStudent.get(i).inThongTin();
				}
				break;
			case 7:
			default:
				System.out.println("7. Ket thuc");
				flag = false;
				
			}
		} while (flag == true);
	}

	
}
