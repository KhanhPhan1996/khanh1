package TinhTruuTuong;

public class HinhChuNhat extends Hinh{
	public float chieuDai;
	public float chieuRong;
	@Override
	public float dienTich() {
		return chieuDai*chieuRong;
	}
	@Override
	public float chuVi() {
		return (chieuDai+chieuRong)*2;
	}
	
}
