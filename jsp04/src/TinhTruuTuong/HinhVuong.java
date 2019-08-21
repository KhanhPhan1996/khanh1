package TinhTruuTuong;

public class HinhVuong extends HinhChuNhat{
	public float canh;
	@Override
	public float dienTich() {
		return canh*canh;
	}
	@Override
	public float chuVi() {
		return canh*4;
	}

}
