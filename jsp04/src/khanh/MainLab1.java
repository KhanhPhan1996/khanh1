package khanh;

public class MainLab1 {

	public static void main(String[] args) {
		Employee employeeOne 	= new Employee("Nguyen Van A", 1, 3000, 23, false, new Job(1, "HR"));
		Employee employeeTwo 	= new Employee("Nguyen Van B", 2, 4000, 24, false, new Job(2, "BA"));
		Employee employeeThree 	= new Employee("Nguyen Van C", 3, 5000, 27, true, new Job(3, "Tester"));
		Employee employeeFour 	= new Employee("Nguyen Van D", 4, 6000, 27, true, new Job(4, "Developer"));
		Employee employeeFive 	= new Employee("Nguyen Van E", 5, 7000, 29, true, new Job(5, "CEO"));


		System.out.println("ID\t" + "Name\t\t" + "Salary\t" + "Job\t");
		System.out.println(employeeOne.id 	+ "\t" + employeeOne.name 	+ "\t" + employeeOne.salary 	+ "\t" + employeeOne.job.name);
		System.out.println(employeeTwo.id 	+ "\t" + employeeTwo.name 	+ "\t" + employeeTwo.salary 	+ "\t" + employeeTwo.job.name);
		System.out.println(employeeThree.id + "\t" + employeeThree.name + "\t" + employeeThree.salary 	+ "\t" + employeeThree.job.name);
		System.out.println(employeeFour.id 	+ "\t" + employeeFour.name 	+ "\t" + employeeFour.salary 	+ "\t" + employeeFour.job.name);
		System.out.println(employeeFive.id 	+ "\t" + employeeFive.name 	+ "\t" + employeeFive.salary 	+ "\t" + employeeFive.job.name);

		Employee[] myList = new Employee[5];
		myList[0] = employeeOne;
		myList[1] = employeeTwo;
		myList[2] = employeeThree;
		myList[3] = employeeFour;
		myList[4] = employeeFive;
		System.out.println("Truy xuat phan tu mang : ");
		System.out.println(myList[3].id + "\t" + myList[3].name + "\t" + myList[3].salary + "\t" + myList[3].job.name);
		System.out.println(myList[4].id + "\t" + myList[4].name + "\t" + myList[4].salary + "\t" + myList[4].job.name);


	}
}
