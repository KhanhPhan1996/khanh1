package Fpt;

import java.util.Scanner;

public class Demo3_string {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" noi dung");
		String contents = sc.nextLine();
		System.out.println(" tim kiem");
		String find = sc.nextLine();
		System.out.println(" thay the");
		String replace = sc.nextLine();
		
		
		
		String refult = contents.replaceAll(find, replace);
		System.out.println(refult);
		
		
		
	}
}
