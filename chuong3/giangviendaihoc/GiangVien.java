package giangviendaihoc;

import java.util.Scanner;

public abstract class GiangVien {

	protected String hoTen;
	protected String diaChi;
	protected String loaiGiangVien;
	protected double luongThang;
	
	public GiangVien() {
		hoTen = "";
		diaChi = "";
		loaiGiangVien = "";
		luongThang = 0;
	}
	
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho ten : ");
		hoTen = sc.nextLine();
		System.out.println("Nhap dia chi : ");
		diaChi = sc.nextLine();
		System.out.println("Nhap loai giang vien : ");
		loaiGiangVien = sc.nextLine();
	}
	
	// tinh luong
	public abstract double tinhLuong();
	
	//in thong tin
	public void inThongTin() {
		System.out.print("\nThong tin :" + "\n* Ho ten  : " + hoTen + "\n* Dia chi : "+ diaChi + "\n* Loai giang vien : "
				+loaiGiangVien + "\n* Luong thang : ");
	}
	
}
