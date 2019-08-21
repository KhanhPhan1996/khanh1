package TrungTamJaVa;

public class Main {
	public static void main(String[] args) {
		NhanVien a = new NhanVien();
		a.ten = "Khanh";
		a.diaChi = "Da Nang";
		a.luong = 12000000;
		
		a.setTen("To");
		a.setDiaChi("Da Nang");
		
		a.mucLuong();
}
}
