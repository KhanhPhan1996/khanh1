package Fpt;

import java.util.Scanner;

public class Demo4_string {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println(" Nhap chuoi so : ");
	String nd = sc.nextLine();
	String[] s = nd.split(",");
	for (String string : s) {
		int x = Integer.parseInt(string);
		if(x % 2 ==0 ) {
			
			System.out.println(" So chan la " + x);
	}


	}
}
}
