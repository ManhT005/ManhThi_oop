package giangviendaihoc;

import java.util.Scanner;

public class GVThinhGiang extends GiangVien{

	protected double donGia;
	protected int soTietDay; // so tiet day 1 thang
	
	public GVThinhGiang() {
		super();
		donGia = 0;
		soTietDay = 0;
	}
	
	public void nhapThongTin() {
		System.out.println("Nhap thong tin - giang vien thinh giang : ");
		super.nhapThongTin();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap don gia :");
		donGia = sc.nextDouble();
		System.out.println("Nhap so tiet day trong thang : ");
		soTietDay = sc.nextInt();
	}
	
	public double tinhLuong() {
		return (1.0-0.15) * soTietDay * donGia;
	}
	
	public void inThongTin() {
		super.inThongTin();
		System.out.println(tinhLuong());
	}
}
