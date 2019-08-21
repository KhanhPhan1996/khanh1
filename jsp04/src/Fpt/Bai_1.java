package Fpt;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> a = new ArrayList<Double>();
		while (true) {
			System.out.print(" Nhap so: ");
			double x = sc.nextDouble();
			a.add(x);
			
			System.out.print(" Nhap them (Y/N) : ");
			String n = sc.nextLine();
			if(sc.nextLine().equals("N")) {
				break;
				
			}
			
		}
		System.out.println(" Cac so da nhap : ");
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
	}
}
