package giangviendaihoc;

import java.util.Scanner;

public class GVCoHuu extends GiangVien{

	protected double heSoLuong;
	protected double luongCoBan;
	protected int thamNien; // tham nien lam viec : so nam cong tac
	
	public GVCoHuu() {
		super();
		heSoLuong = 0 ;
		luongCoBan = 0;
		thamNien = 0;
	}
	
	public void nhapThongTin() {
		System.out.println("Nhap thong tin - giang vien co huu : ");
		super.nhapThongTin();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap luong co ban :");
		luongCoBan = sc.nextDouble();
		System.out.println("Nhap he so luong : ");
		heSoLuong = sc.nextDouble();
		System.out.println("Nhap so nam cong tac : ");
		thamNien = sc.nextInt();
	}
	
	public double tinhLuong() {
		double phuCap = 0;
		if(thamNien >= 5) {
			phuCap = (double) thamNien/100 * luongCoBan;
		}
		return luongCoBan * heSoLuong + phuCap;
	}
	
	public void inThongTin() {
		super.inThongTin();
		System.out.println(tinhLuong());
	}
}
