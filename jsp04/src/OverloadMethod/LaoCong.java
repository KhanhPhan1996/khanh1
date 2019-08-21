package OverloadMethod;

public class LaoCong extends NhanVien{
	public double soGioLamViec;
	@Override
	public double getThunhap() {
		return soGioLamViec+23000;
	}
}
