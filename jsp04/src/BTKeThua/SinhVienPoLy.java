package BTKeThua;

import java.util.Scanner;

abstract public  class SinhVienPoLy implements SinhVien{
	Scanner sc = new Scanner(System.in);

	private String hoTen;
	private String nganh;
	
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getNganh() {
		return nganh;
	}
	public void setNganh(String nganh) {
		this.nganh = nganh;
	}

	abstract public double getDiem();
	
	public String gethocLuc() {
		String hocLuc = null;
		if(getDiem() < 5) hocLuc = "Yeu";
		else if (getDiem() >=5 && getDiem() <6.5) hocLuc = "Trung Binh";
		else if (getDiem() >=6.5 && getDiem() <7.5) hocLuc = "Kha";
		else if (getDiem() >=7.5 && getDiem() <9) hocLuc = "Gioi";
		else if (getDiem() >=9) hocLuc = "Xuat sac";
		return hocLuc;
	}
	
	public void nhap() {
		System.out.print(" Ho ten : ");
		this.hoTen = sc.nextLine();
		System.out.print(" Nganh : " );
		this.nganh = sc.nextLine();
		
	}
	
	public void xuat() {
		System.out.println(" Ho ten : " + getHoTen());
		System.out.println(" Nganh : " + getNganh());
		System.out.println(" Diem : " + getDiem());
		System.out.println(" Hoc luc : " + gethocLuc());
		
		
	}

}
