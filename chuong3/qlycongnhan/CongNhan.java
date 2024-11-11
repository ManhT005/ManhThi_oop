package qlycongnhan;

import java.util.Scanner;

public abstract class CongNhan {

	protected String hoTen;
	protected String diaChi;
	protected String loaiCongNhan;
	protected String ngaySinh;
	protected double luongThang = 0;
	
	public CongNhan() {
		hoTen = "";
		diaChi = "";
		this.loaiCongNhan = "";
		this.luongThang = 0;
		this.ngaySinh = "";
		
	}
	
	//nhap thong tin
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho ten : ");
		hoTen = sc.nextLine();
		System.out.println("Nhap dia chi : ");
		diaChi = sc.nextLine();
		System.out.println("Nhap ngay sinh : ");
		this.ngaySinh = sc.nextLine();
		System.out.println("Nhap loai cong nhan :");
		this.loaiCongNhan = sc.nextLine();
		
	}
	//tinh hoc phi
	public abstract double tinhLuong();
	//in thong tin
	public void inThongTin() {
		System.out.println("\nThong tin cong nhan :"+ "\n* Ho ten : "+ hoTen +"\n* Dia chi : "+ diaChi + "\n* Ngay sinh : " +this.ngaySinh+ "\n* Loai cong nhan : "+ this.loaiCongNhan
				+"\n* Luong thang : " + tinhLuong());
	}
}
