package Exersice5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Your number : ");
		int a = scanner.nextInt();
		
		switch (a) {
		case 1:
			System.out.println("create employee");
			break;
		case 2:
			System.out.println("show the exising employee");
			break;
		case 3:
			System.out.println("exit");
			break;
		default:
			System.out.println("error");
		}
	}
}
