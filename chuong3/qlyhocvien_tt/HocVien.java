package qlyhocvien_tt;

import java.util.Scanner;

public abstract class HocVien {

	protected String hoTen;
	protected String diaChi;
	protected String loaiChuongTrinh;
	protected int loaiUuTien = 0;
	
	public HocVien() {
		hoTen = "";
		diaChi = "";
		loaiChuongTrinh = "";
		loaiUuTien = 0;
		
	}
	
	//nhap thong tin
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho ten : ");
		hoTen = sc.nextLine();
		System.out.println("Nhap dia chi : ");
		diaChi = sc.nextLine();
		System.out.println("Nhap chuong trinh hoc :");
		loaiChuongTrinh = sc.nextLine();
		System.out.println("Nhap loai uu tien (0,1,2) : ");
		loaiUuTien = sc.nextInt();
	}
	//tinh hoc phi
	public abstract double hocPhi();
	//in thong tin
	public void inThongTin() {
		System.out.println("* Ho ten : "+ hoTen +"\n* Dia chi : "+ diaChi + "\n* Loai uu tien : "+ loaiUuTien
				+"\n* Loai chuong trinh dang ki : "+ loaiChuongTrinh +"\n* Hoc phi : " );
	}
}
