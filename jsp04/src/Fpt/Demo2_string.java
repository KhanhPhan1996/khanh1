package Fpt;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo2_string {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> fullName = new ArrayList<String>();
		while (true) {
			System.out.print(" Enter name : ");
			String name = sc.nextLine();
			fullName.add(name);
			
			System.out.print(" Enter more (y/n): ");
			if(sc.nextLine().equals("n")) {
				break;
			}
			
		}
			
		for (int i = 0; i < fullName.size(); i++) {
			if(fullName.get(i).startsWith("Phan") || fullName.get(i).endsWith("Khanh")) {
				System.out.println(fullName.get(i).toUpperCase());
			}
		}
		
		for (int i = 0; i < fullName.size(); i++) {
			if(fullName.get(i).contains("Cong")) {
					System.out.println(fullName.get(i));
			}
		}
		
	
		
	}
}
	

