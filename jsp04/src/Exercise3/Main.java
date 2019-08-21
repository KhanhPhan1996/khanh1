package Exercise3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Employee employee1 = new Employee("Nguyen Van A", 1, 3000, 23, false, new Job(1, "HR"));
		Employee employee2 = new Employee("Nguyen Van B", 2, 4000, 24, true, new Job(2, "BA"));
		Employee employee3 = new Employee("Nguyen Van C", 3, 5000, 34, true, new Job(3, "Tester"));
		Employee employee4 = new Employee("Nguyen Van D", 4, 6000, 27, true, new Job(4, "Developer"));
		Employee employee5 = new Employee("Nguyen Van E", 5, 7000, 21, false, new Job(5, "CEO"));
		
//		System.out.println(employee1.id + " " + employee1.name + " " + employee1.salary + " " + employee1.job.name);
//		System.out.println(employee2.id + " " + employee2.name + " " + employee2.salary + " " + employee2.job.name);
//		System.out.println(employee3.id + " " + employee3.name + " " + employee3.salary + " " + employee3.job.name);
//		System.out.println(employee4.id + " " + employee4.name + " " + employee4.salary + " " + employee4.job.name);
//		System.out.println(employee5.id + " " + employee5.name + " " + employee5.salary + " " + employee5.job.name);
		
		Employee[] employeeArray = new Employee[5];
		employeeArray[0] = employee1;
		employeeArray[1] = employee2;
		employeeArray[2] = employee3;
		employeeArray[3] = employee4;
		employeeArray[4] = employee5;
		
//		System.out.println(employeeArray[1].id + " " + employeeArray[1].name + " " + employeeArray[1].salary + " " + employeeArray[1].job.name);
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.print(" Please input a number : ");
		int a = scanner1.nextInt();
		Scanner scanner2 = new Scanner(System.in);
		System.out.print(" Please input a name : ");
		String name = scanner2.nextLine();
		System.out.println(" You already type input : " + a);
		System.out.println(" You already type name : " + name);

	}
	

}
