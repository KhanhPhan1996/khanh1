package Fpt;

import java.util.Scanner;

public class Demo1_string {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Please ! Enter usename : ");
		String name = sc.nextLine();
		System.out.print(" Enter pass word : ");
		String passWord = sc.nextLine();
		sc.close();
		
		if(name.equalsIgnoreCase("Hello") && passWord.length()>6) {
			System.out.println(" Usename and pass word are OK");
		}
		else {
			System.out.println(" Usename and pass word are not OK");

		}
	}
}
