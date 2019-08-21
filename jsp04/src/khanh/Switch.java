package khanh;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please ! Your number input : ");
		int a = scanner.nextInt();
		
		switch (a) {
		case 1:
			System.out.println("Create employee");
			break;
		case 2:
			System.out.println("Show the existing employee");
			break;
		case 3:
			System.out.println("Exit");
			break;
		default:
			System.out.println("Input return");
		}
	}

}
