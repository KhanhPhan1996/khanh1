package khanh;

public class Main2 {



	public static void main(String[] args) {
		Employee employeeOne = new Employee("Nguyen Van A", 1, 3000, 23, false, new Job(1, "HR"));
		Employee employeeTwo = new Employee("Nguyen Van B", 2, 4000, 24, false, new Job(2, "BA"));
		Employee employeeThree = new Employee("Nguyen Van C", 3, 5000, 27, true, new Job(3, "Tester"));
		Employee employeeFour = new Employee("Nguyen Van D", 4, 6000, 27, true, new Job(4, "Developer"));
		Employee employeeFive = new Employee("Nguyen Van E", 5, 7000, 29, true, new Job(5, "CEO"));


		
//		System.out.println(employeeOne.id + " " + employeeOne.name + " " + employeeOne.salary + " " + employeeOne.job.name);
//		System.out.println(employeeTwo.id + " " + employeeTwo.name + " " + employeeTwo.salary + " " + employeeTwo.job.name);
//		System.out.println(employeeThree.id + " " + employeeThree.name + " " + employeeThree.salary + " " + employeeThree.job.name);
//		System.out.println(employeeFour.id + " " + employeeFour.name + " " + employeeFour.salary + " " + employeeFour.job.name);
//		System.out.println(employeeFive.id + " " + employeeFive.name + " " + employeeFive.salary + " " + employeeFive.job.name);

		Employee[] myList = new Employee[5];
		myList[0] = employeeOne;
		myList[1] = employeeTwo;
		myList[2] = employeeThree;
		myList[3] = employeeFour;
		myList[4] = employeeFive;
		
//		System.out.println(myList[3].id + " " + myList[3].name + " " + myList[3].salary + " " + myList[3].job.name);
		
		for(int i = 0;i < 5; i++) {
			System.out.println(myList[i].id + " " + myList[i].name + " " + myList[i].salary + " " + myList[i].job.name);
		}

	}
}
