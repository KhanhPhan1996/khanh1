package TinhKeThua;

public class SubClass extends SuperClass{
	int number = 19;
	public void hienThi() {
		System.out.println(" Day la phuong thuc hienThi cua lop con");	
	}
	
	public void subClassMethod() {
		SubClass subClass = new SubClass();
		super.hienThi();
		subClass.hienThi();
		System.out.println(" day la number cua lop cha " + super.number);
		System.out.println(" day la number cua lop con " + subClass.number);

	}
	
	public static void main(String[] args) {
		SubClass a = new SubClass();
		a.subClassMethod();
	}

}
