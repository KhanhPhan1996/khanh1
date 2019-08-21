package Lab5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee employee = null;
		Employee[] employeeArray = null;
		int s = 0;
		boolean flag = false;
		do {
			System.out.println("-----------MENU-----------");
			System.out.println("1. Create employee ");
			System.out.println("2. Show the existing employee ");
			System.out.println("3. exit");
			System.out.println("-------------------------");
			
			System.out.print(" Enter your number : ");
			int n = sc.nextInt();
			
			switch (n) {
			case 1:
				System.out.println("1. Create employee ");
				System.out.print(" Please enter employee's number: ");
				s = sc.nextInt();
				employeeArray = new Employee[s];

				for(int i = 0;i < s;i++) {
					System.out.println(" Employee's number : " + (i+1));
					employee = new Employee();
					employee.inPut();
					employeeArray[i] = employee;
				}
				break;
			case 2:
				System.out.println("2. Show the existing employee ");
				for (int i = 0; i < s; i++) {
					System.out.println(" Info Employee's number " + (i+1) + " is: ");
					employeeArray[i].outPut();
				}
				break;
			case 3:
			default:
				System.out.println("3. exit");
				flag = true;
				break;
			}
		} while (flag == false);
	}
}
