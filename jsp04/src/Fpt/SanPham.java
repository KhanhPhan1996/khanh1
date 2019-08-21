package Fpt;

import java.util.Scanner;

public class SanPham {
	private String name;
	private double price;
	private double sale;
	
	public SanPham() {
		
	}
	public SanPham(String name, double price, double sale) {
		this.name = name;
		this.price = price;
		this.sale = sale;
	}

	public SanPham(String name, double price) {
		this(name,price,0);
	}
	
	public void inPut() {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter name produce : ");
		this.name = sc.nextLine();
		System.out.print(" Enter price : ");
		this.price = sc.nextDouble();
		System.out.print(" Enter sale : ");
		this.sale = sc.nextDouble();
	}

	private double tax(){
		return (double) (this.price+(this.price*0.01) - this.sale);
	}
	
	public void outPut(){
		System.out.println("-----Show Info-----");
		System.out.println(" Name produce: " + this.name);
		System.out.println(" Price : " + this.price);
		System.out.println(" Sale : " + this.sale);
		System.out.println(" Total money : " + tax());
		System.out.println("-----------------");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getSale() {
		return sale;
	}

	public void setSale(double sale) {
		this.sale = sale;
	}
}
