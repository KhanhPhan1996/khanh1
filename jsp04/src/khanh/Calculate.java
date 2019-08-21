package khanh;

import java.util.Scanner;

public class Calculate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print(" Nhap a : ");
//		int a = sc.nextInt();
//		System.out.print(" Nhap b : ");
//		int b = sc.nextInt();
//		System.out.println("a + b = " + (a+b));
//		System.out.println("a - b = " + (a-b));
//		System.out.println("a * b = " + a*b);
//		System.out.println("a / b = " + ((float)a/(float)b));
//		System.out.println("a % b = " + a%b);
//		System.out.println("a++	= " + a++);
//		System.out.println("a-- = " + a--);
//		System.out.println("Compare a and b : " + ((a>b) ? "a>b":"a<=b"));
		
		System.out.print(" Nhap n : ");
		int n = sc.nextInt();
		int i = 0;
		int s = 0;
		while (i <= n) {
			if (i%2 == 0) {
				s += i;
			}
			i++;
		}
		System.out.println("Tong cac so chan tu 0 den " + n + " la : " + s);
		
		do {
			if (i%2 == 0) {
				s += i;
			}
			i++;
			
		} while (i <= n);
		System.out.println("Tong cac so chan tu 0 den " + n + " la : " + s);
		
		s = 0;
		for (i = 0; i <= n; i++) {
			if (i%2 == 0) {
				s += i;
			}
		}
		System.out.println("Tong cac so chan tu 0 den " + n + " la : " + s);

	}

}
