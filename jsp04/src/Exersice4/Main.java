package Exersice4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner1 = new Scanner(System.in);
		System.out.print(" Input Your Number a = ");
		int a = scanner1.nextInt();
		Scanner scanner2 = new Scanner(System.in);
		System.out.print(" Input Your Number b = ");
		int b = scanner2.nextInt();
		
		System.out.println(" a + b = " + a + b);
		System.out.println(" a - b = " + (a - b));
		System.out.println(" a % b = " + a % b);
		System.out.println(" a / b = " + a / b);
		System.out.println(" a++ = " + a++);
		System.out.println(" b-- = " + b--);
		

		
	}

}
