package Fpt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
//		String ho_Ten;
//		int tuoi;
//		Scanner sc1 = new Scanner(System.in);
//		System.out.print("Please ! Enter your name : ");
//		ho_Ten = sc1.nextLine();
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Please ! Enter your age : ");
//		tuoi = sc.nextInt();
//		sc.close();
//		
//		System.out.printf("%s is %d years old",ho_Ten,tuoi);
		
//		int max = 12;
//		int min = 5;
//		int range = (max - min) + 1;
//		int a = (int) (Math.random()*range + min);
//		System.out.println(a);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print(" a = ");
//		int a = sc.nextInt();
//		System.out.print(" b = ");
//		int b = sc.nextInt();
//		
//		int c = (int) Math.pow(a, b);
//		System.out.printf(" a luy thua b = %d",c);
//		
//		System.out.println();
//		
//		int d = Math.min(a, b);
//		System.out.printf(" min[%d;%d] = %d",a,b,d);
	
//		float a = Float.parseFloat("3.2");
//		int b = Integer.parseInt("4");
//		float c = a + b;
//		System.out.println(c);
		
		
//		try {
//			System.out.print(" Please ! enter number :");
//			int a = sc.nextInt();
//			System.out.println(" Bingo");
//		} catch (Exception e) {
//			System.out.print(" Please ! enter number again : ");
//		}
		
//		double a = 0 ;
//		try {
//		System.out.print(" Please ! enter number :");
//		a = sc.nextInt();
//		if (a >=0 ) {
//			double b = Math.sqrt(a);
//			System.out.println(" result :" + b);
//		}
//		} catch (Exception e) {
//			System.out.print(" Please ! enter number again : ");
//		}
		
//		System.out.print(" Please ! enter number :");
//		double a = sc.nextInt();
//		sc.close();
//		double c = 0;
//		double b = a * c;
//		
//		if (a < 9) {
//			c = 1;
//			System.out.println(" không đóng thuế");
//		}
//		else if (a >= 9 && a < 15) {
//			c = 0.1;
//			System.out.printf(" đóng thuế %f triệu",b);
//		}
//		else if (a >= 15 && a < 30) {
//			c = 0.15;
//			System.out.printf(" đóng thuế %f triệu",b);
//		}
//		else {
//			c = 0.2;
//			System.out.printf(" đóng thuế %f triệu",b);
//		}
		
//		int i = 1;
//		while (i<10) {
//			System.out.printf("7 x %d = %d",i,7*i);
//			System.out.println();
//			i++;
//		}
		
		
//		int i = 27;
//		int s = 0;
//		float tb = 0;
//		int dem = 0;
//		while ( i <= 250) {
//			if (i % 3 == 0) {
//				s += i;
//			}
//			i++;
//			dem += 1;
//		}
//		System.out.println(" Total : " + s);
//		tb = (float) s / dem;
//		System.out.println(" Average : " + tb);
		
//		int a ;
//		do {
//			System.out.print(" Enter point : ");
//			a = (int) sc.nextDouble();
//		} while (a >= 0 && a<=10 );
		
//		for (int i = 0; i <= 10; i++) {
//			for (int j = 0; j <= 10; j++) {
//				System.out.printf("%d x %d = %d	 ",i,j,i*j);
//			}
//			System.out.println();
//		}
		
//		System.out.print(" Enter number a : ");
//		int a = sc.nextInt();
//		System.out.print(" Enter number b : ");
//		int b = sc.nextInt();
//		System.out.println(" Phuong trinh bat nhat co dang : " + a + ".x" + b + "= 0");
//		if (a == 0 && b!= 0) {
//			System.out.println(" phuong trinh vo nghiem");
//		}else if (a == 0 && b == 0) {
//			System.out.println(" phuong trinh vo so nghiem");
//		}else {
//			System.out.println(" nghiem cua phuong trinh la " + (float) ((- (float)b)/(float)a));
//		}
		
//		System.out.print(" nhap so dien ");
//		int a = sc.nextInt();
//		if (a < 50) {
//			System.out.print(" tien dien : " + a*1000 + " dong ");
//		}else {
//			System.out.print(" tien dien : " + (a*1000 + (a-50)*1200) + " dong ");
//		}
		
		
//		boolean flag = true;
//		do {
//			System.out.println("----------MENU----------");
//			System.out.println("1. Giai pt bat 1");
//			System.out.println("2. Giai pt bat 2");
//			System.out.println("3. Giai pt bat 3");
//			System.out.println("4. Thoat chuong trinh");
//
//			System.out.print(" Nhap so : ");
//			int s = sc.nextInt();
//			switch (s) {
//			case 1:
//				System.out.print(" Enter number a : ");
//				int a = sc.nextInt();
//				System.out.print(" Enter number b : ");
//				int b = sc.nextInt();
//				System.out.println(" Phuong trinh bat nhat co dang : " + a + ".x + " + b + "= 0");
//				if (a == 0 && b!= 0) {
//					System.out.println(" phuong trinh vo nghiem");
//				}else if (a == 0 && b == 0) {
//					System.out.println(" phuong trinh vo so nghiem");
//				}else {
//					System.out.println(" nghiem cua phuong trinh la " + (float) ((- (float)b)/(float)a));
//				}
//				break;
//			case 2:
//				System.out.println(" Giai pt bat 2");
//				break;
//			case 3:
//				System.out.print(" nhap so dien ");
//				int sd = sc.nextInt();
//				if (sd < 50) {
//					System.out.print(" tien dien : " + sd*1000 + " dong ");
//				}else {
//					System.out.println(" tien dien : " + (sd*1000 + (sd-50)*1200) + " dong ");
//				}
//				break;
//			default:
//				flag = false;
//				System.out.println(" thoat khoi chuong trinh");
//				
//			}
//		}while (flag == true );
//		sc.close();
//
//		}
	
//		int diem = 0;
//		while(true) {
//			System.out.print(" nhap diem ");
//			diem = sc.nextInt();
//			if (diem >=0 && diem <= 10) {
//				break;
//			}
//			System.out.println(" diem phai tu 0 den 10");
//		}
		
		
//		    int i, sum = 0;
//		    Scanner scanner = new Scanner(System.in);   
//		     
//		    do {
//		        System.out.println("Nhập vào số:");
//		        i = scanner.nextInt();
//		 
//		        /*
//		         * Nếu số nhập < 0 thì sẽ kết thúc vòng lặp 
//		         * và thực hiện câu lệnh bên ngoài vòng lặp.
//		         */
//		        if (i < 0) {
//		            break;
//		        }
//		        sum += i;
//		    } while (i >= 0);    // i còn lớn hơn hoặc bằng 0 thì còn tiếp tục
//		         
//		    System.out.println("Kết quả = " + sum);
		
		
//	    int count;
//	    for (count = 1; count <= 5; count++) {
//	        System.out.println("Lần lặp " + count);
//	             
//	        /* 
//	         * kiểm tra nếu count còn nhỏ hơn 4
//	         * thì còn quay lại vòng for kiểm tra điều kiện lặp 
//	         */
//	        if (count < 4) {
//	            continue;
//	        }
//	             
//	        // Nếu count không nhỏ hơn 4 thì hiển thị "Chào bạn!"
//	        System.out.println("Chào bạn!");
//	    }
		
//		int[] a = {2,4,6,23,12,45,35};
//		double s = 0;
//		double tbc = 0;
//		for (int x : a) {
//			s += x; 
//			tbc = s/a.length;
//		}
//		System.out.println(" trung binh cong la : " + tbc);
		
//		int[] a = {2,4,6,23,12,45,35};
//		int i = Arrays.binarySearch(a, 4);
//		System.out.println(" vi tri cua 4 la " + i);
//		
//		System.out.println(" mang goc " + Arrays.toString(a));
//
//		Arrays.sort(a);
//		System.out.println(" sap xep tang dan " + Arrays.toString(a));
//		
//		Arrays.fill(a, 3);
//		System.out.println(" gan 3 cho cac phan tu " + Arrays.toString(a));
		
//		String[] a = {"khanh","hoang","khiem","thang","quy"};
//		
//		Arrays.sort(a);
//		System.out.println(" sap sep theo alphabet " + Arrays.toString(a));
//		
//		Arrays.fill(a, "Khanh");
//		System.out.println(" gan Khanh cho cac phan tu " + Arrays.toString(a));
//		
		
//		int[] a = {2,1,3,5,5,2,8,9};
//		for(int i = 0; i<a.length-1 ; i++) {
//			for( int j = i+1; j<a.length ; j++) {
//				if(a[i] < a[j]) {
//					int temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(a));
		
//		System.out.println(" enter number : ");
//		int a = sc.nextInt();
//		sc.close();
//		boolean flag = false;
//		for (int i = 2; i < a-1 ;i++) {
//			if( a%i == 0) {
//				flag = true;
//			}
//		}
//			if (flag) {
//				System.out.println(" khong la so nguyen to ");
//		}	
//			else {
//				System.out.println(" la so nguyen to ");
//			}
		
//		System.out.print(" Nhap n = " );
//		int n = sc.nextInt();
//		int[] a = new int[n];
//		int i;
//		int t = 0;
//		int tbc = 0;
//		int dem = 0;
//		for(i = 0;i < n;i++) {
//			System.out.print(" Nhap phan tu thu a[" + i + "] : ");
//			a[i] = sc.nextInt();
//		}
//		System.out.println(" Cac phan tu a[" + n + "] : " + Arrays.toString(a));
//		Arrays.sort(a);
//		System.out.println(" Sap xep tang dan a[" + n + "] : " + Arrays.toString(a));
//		
//		int min = a[0];
//		for(i = 0;i < n;i++) {
//			if (min > a[i]) {
//				min = a[i];
//			}
//		}
//		System.out.println(" Phan tu nho nhat : " + min);
//		
//		int max = a[0];
//		for(i = 0;i < n;i++) {
//			if (max < a[i]) {
//				max = a[i];
//			}
//		}
//		System.out.println(" Phan tu lon nhat : " + max);
//		
//		for(i = 0;i < n;i++) {
//			if(a[i]%3 == 0) {
//				t += a[i];
//				dem += 1;
//			}
//		}
//		tbc = t/dem;
//		System.out.println(" Tong cac phan tu chia het cho 3: " + t );
//		System.out.println(" Trung binh cong cac phan tu chia het cho 3: " + tbc );

//		Scanner sc1 = new Scanner(System.in);
//		System.out.print(" Nhap so sinh vien :");
//		int n = sc.nextInt();
//		String[] ten = new String[n];
//		int[] diem = new int[n];
//		
//		
//		
//		for(int i = 0;i < n;i++) {
//			System.out.print(" Nhap ten sinh vien thu " + (i+1) + " la: ");
//			ten[i] = sc1.nextLine();
//			System.out.print(" Nhap diem sinh vien thu " + (i+1) + " la: ");
//			diem[i] = sc.nextInt();
//		}
//		
//		for(int i = 0;i < n;i++) {
//			System.out.println("-----------------------");
//			System.out.println(" Ho va ten: " + ten[i]);
//			System.out.println(" Diem: " + diem[i]);
//			
//			if(diem[i] < 5) {
//				System.out.println(" Hoc luc: Yeu");
//			}
//			else if(diem[i] >= 5 && diem[i] <= 6.5) {
//				System.out.println(" Hoc luc: Trung binh");
//			}
//			else if(diem[i] >= 6.5 && diem[i] < 7.5) {
//				System.out.println(" Hoc luc: Kha");
//			}
//			else if(diem[i] >= 7.5 && diem[i] < 9) {
//				System.out.println(" Hoc luc: Gioi");
//			}
//			else {
//				System.out.println(" Hoc luc: Xuat sac");
//			}
//
//		}
//		
//		for(int i = 0; i<diem.length-1 ; i++) {
//			for( int j = i+1; j<diem.length ; j++) {
//				if(diem[i] > diem[j]) {
//					int temp = diem[i];
//					diem[i] = diem[j];
//					diem[j] = temp;
//					
//				}	
//			}
//		}
//		System.out.println(Arrays.toString(diem));
//		
//		System.out.println("Danh sach tang dan theo diem");
//		for(int i = 0;i < n;i++) {
//			System.out.println(" Ho va ten: " + ten[i]);
//			System.out.println(" Diem: " + diem[i]);
//		}
		
		
//		ArrayList<String> a = new ArrayList<String>();
//		a.add("Khanh");
//		a.add("Hoang");
//		a.add("Quy");
//		a.add("Khiem");
//		a.add("Thang");
//		a.add(1, "Kien");
//		a.set(0, "Tho");
//		System.out.println(a.toString());
//		a.remove(4);
//		a.remove("Khiem");
//		int x = a.size() - a.indexOf("Khiem");
//		System.out.println("x = " + x);
//		System.out.println(a.size());
//		System.out.println(a.indexOf("Khiem"));

//		ArrayList<Double> a = new ArrayList<Double>();
//		a.add(2.3);
//		a.add(9.8);
//		a.add(3.2);
//		a.add(2.5);
//		double t = 0;
//		for (int i = 0;i < a.size();i++) {
//			double x = a.get(i);
//			t += x;
//		}
//		System.out.println(" Total: " + t);
		
//		ArrayList a1 = new ArrayList();
//		a1.add(2);
//		a1.add(3);
//		ArrayList a2 = new ArrayList();
//		a2.add(3);
//		a2.add(4);
		
//		a1.addAll(a2);
//		System.out.println(a1.toString());
//		
//		a1.removeAll(a2);
//		System.out.println(a1.toString());

//		a1.retainAll(a2);
//		System.out.println(a1.toString());
		
		
//		System.out.println(a1.contains(a2));

		
//		ArrayList a = new ArrayList();
//		a.add(1);
//		a.add(2);
//		a.add(5);
//		a.add(4);
		
//		Collections.swap(a, 2, 0);
//		System.out.println(a.toString());
		
//		Collections.fill(a, 3);
//		System.out.println(a.toString());
		
//		Collections.shuffle(a);
//		System.out.println(a.toString());
		
//		Collections.sort(a);
//		System.out.println(a.toString());
		
//		Collections.reverse(a);
//		System.out.println(a.toString());

//		Collections.rotate(a, 1);
//		System.out.println(a.toString());
		
//		System.out.println("\t+ Ho va ten: Khanh\r\n\t+ Tuoi: 23 ");

//		String fullName = "     Phan Ngoc Cong Khanh ";
//		System.out.println(fullName);
//		String[] first = fullName.split(fullName);
//		System.out.println(first.toString());
	
		System.out.print(" So dien thoai : ");
		String sdt = sc.nextLine();
		
		String pattern = "0[0-9]{9-10}";
		
		if(sdt.matches(pattern)) {
			System.out.println(" Ban da nhap dung sdt");
		}
		else {
			System.out.println(" Ban da nhap sai sdt");
		}
	
	
	
	}
	
}
