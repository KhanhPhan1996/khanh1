package TinhTruuTuong;

public class Tron extends Hinh{
	public float banKinh;

	@Override
	public float dienTich() {
		return (float) (3.14*(banKinh*banKinh));
	}

	@Override
	public float chuVi() {
		return (float) (2*3.24*banKinh);
	}
}
