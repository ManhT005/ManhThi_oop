package qlycongnhan;

import java.util.Scanner;

public class CNTCN extends CongNhan{

	protected double luongCoBan;
	protected double heSoLuong;
	protected int soNgayCong;
	
	public CNTCN() {
		super();
		this.luongCoBan =0;
		this.heSoLuong = 0;
		this.soNgayCong = 0;
	}
	// nhap thong tin
	public void nhapThongTin() {
		System.out.println("Nhap thong tin cong nhan tinh cong nhat:");
		super.nhapThongTin();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap luong co ban: ");
		this.luongCoBan = sc.nextDouble();
		System.out.println("Nhap he so luong : ");
		this.heSoLuong = sc.nextDouble();
		System.out.println("Nhap so ngay cong : ");
		this.soNgayCong = sc.nextInt();
		
	}
	//tinh luong cnksp
	public double tinhLuong() {
		double thuong = 0;
		if (this.soNgayCong >= 20)
			thuong = 1.2*this.luongCoBan;
		luongThang = this.luongCoBan*this.heSoLuong +thuong;
		return luongThang;
	}
	
	// in thong tin
	public void inThongTin() {
		super.inThongTin();
	}
}
