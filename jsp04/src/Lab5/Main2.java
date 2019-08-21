package Lab5;

import java.util.Scanner;

public class Main2 {
	public static int s = 0;
	public static Employee2 employee2 = null;
	public static Employee2[] listEmployee = new Employee2[0] ;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		do {
			System.out.println("----------MENU----------");
			System.out.println("1. Create employee");
			System.out.println("2. Show the existing employee");
			System.out.println("3. Search employee by name");
			System.out.println("4. Update employee");
			System.out.println("5. Exit");
			
			System.out.print("Enter your choice : ");
			n = sc.nextInt();
			
			switch (n) {
			case 1:
				System.out.println("1. Create employee");
				createEmployee();
				break;
			case 2:
				System.out.println("2. Show the existing employee");
				showEmployee();
				break;
			case 3:
				System.out.println("3. Search employee by name");
				searchEmployeeByName();
				break;
			case 4:
				System.out.println("4. Update employee");
				updateEmployee();
				break;
			case 5:
				System.out.println("5. Exit");
				break;	
			}
			if (n != 5) {
				System.out.print(" You want return menu (enter 0 = yes, enter other 0 = no) ? : ");
				int u = sc.nextInt();
				if (u == 0) {
					n = u;	
				} 
				else {
					n = 5;
					System.out.println(" Exit");
				}
			}
		} while ( n != 5);
	}
	
	public static void createEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter number employee : ");
		int s = sc.nextInt();
		listEmployee = new Employee2[s];
		for (int i = 0; i < s; i++) {
			System.out.println(" Enter employee info " + (i+1) + " is : ");
			employee2 = new Employee2();
			employee2.inPut();
			listEmployee[i] = employee2;

		}
	}
	
	public static void showEmployee() {
		if(listEmployee.length == 0) {
			System.out.println(" No one! Please create employee");
			createEmployee();
		}
		else {
		for (int i = 0; i < listEmployee.length; i++) {
			System.out.println("---------- Employee info " + (i+1) + " ----------");
			listEmployee[i].outPut();
			}
		}
	}
	
	public static void searchEmployeeByName() {
		Scanner sc3 = new Scanner(System.in);
		System.out.print("Enter search name : ");
		String searchName = sc3.nextLine();
		
		for(int i = 0;i < listEmployee.length;i++) {
			if(listEmployee[i].getName().equals(searchName)) {
				System.out.println("---------- Employee info " + (i+1) + " ----------");
				listEmployee[i].outPut();				
				}
//			else {
//				System.out.println("No one!");
//				break;
//			}
			}
		}
	
	public static void updateEmployee() {
		Scanner sc4 = new Scanner(System.in);
		Scanner sc5 = new Scanner(System.in);

		System.out.print("Enter search name you want update: ");
		String update = sc4.nextLine();
		System.out.print("Enter new salary: ");
		double newSlary = sc5.nextDouble();
		
		for(int i = 0;i < listEmployee.length;i++) {
			if(listEmployee[i].getName().equals(update)) {
				listEmployee[i].setSalary(newSlary);
				System.out.println("---------- Employee info " + (i+1) + " ----------");
				listEmployee[i].outPut();				
				}
//			else {
//				System.out.println("No one!");
//				break;
//			}
			}
	}
	
}


