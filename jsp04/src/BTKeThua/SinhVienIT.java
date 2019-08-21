package BTKeThua;

import java.util.Scanner;

public class SinhVienIT extends SinhVienPoLy{
	Scanner sc = new Scanner(System.in);
	private double java;
	private double html;
	private double css;
	
	public double getJava() {
		return java;
	}
	public void setJava(double java) {
		this.java = java;
	}
	public double getHtml() {
		return html;
	}
	public void setHtml(double html) {
		this.html = html;
	}
	public double getCss() {
		return css;
	}
	public void setCss(double css) {
		this.css = css;
	}

	@Override
	public void nhap() {
		super.nhap();
		System.out.print(" Nhap diem java : ");
		this.java = sc.nextDouble();
		System.out.print(" Nhap diem html : ");
		this.html = sc.nextDouble();
		System.out.print(" Nhap diem css : ");
		this.css = sc.nextDouble();
				
	}
	
	@Override
	public double getDiem() {
		return (2*java + html + css)/4;
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println(" Diem java : " + getJava());
		System.out.println(" Diem html : " + getHtml());
		System.out.println(" Diem css : " + getCss());
		System.out.println("---------------------------");

	}
	
	

}
