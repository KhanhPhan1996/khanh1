package POLYMORPHISM;

public class Main {
	public static void main(String[] args) {
//		Employee emp = new Employee();
//		
//		Person a = new Employee();
//		
//		emp.setTen("A");
//		emp.setLuong(23.4);
//		
//		a.setTen("B");
////		a.setLuong(2.3);
//		
//		emp.ThongTin();
//		a.ThongTin();
		
		Person person = new Person();
		person.ThongTin();
		person = new Employee();
		person.ThongTin();
		
		
	}
}
