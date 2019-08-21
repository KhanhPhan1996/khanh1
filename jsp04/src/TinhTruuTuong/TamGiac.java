package TinhTruuTuong;

public class TamGiac extends Hinh {
	public float chieuCao;
	public float canhDay;
	@Override
	public float dienTich() {
		return ((chieuCao)/2)*canhDay;
	}
	@Override
	public float chuVi() {
		// TODO Auto-generated method stub
		return 0;
	}
}
