package sinhviencaodang;

import java.util.Scanner;

public abstract class Nguoi {

	protected String hoTen;
	protected String ngaySinh;
	protected String diaChi;
	protected String loaiSinhVien;
	
	public Nguoi() {
		this.hoTen = "";
		this.ngaySinh = " ";
		this.diaChi = "";
		this.loaiSinhVien = "";
		
	}
	// nhap thong tin
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho ten : ");
		hoTen = sc.nextLine();
		System.out.println("Nhap ngay sinh : ");
		ngaySinh = sc.nextLine();
		System.out.println("Nhap dia chi : ");
		this.diaChi = sc.nextLine();
		System.out.println("Loai sinh vien : ");
		this.loaiSinhVien = sc.nextLine();
		
	}
	//tinh diem - abstract
	public abstract double tinhDiem();
	
	// in thong tin
	public void inThongTin() {
		System.out.print("\nThong tin : "+ "\nHo va ten : "+hoTen+ "\nNgay sinh : "+ ngaySinh + "\nDia chi : "+ diaChi +
				"\nLoai sinh vien  : "+ loaiSinhVien +"\nDiem trung binh : " +tinhDiem());
	}
	
}
