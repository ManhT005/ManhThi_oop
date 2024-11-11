package qlyhocvien_tt;

import java.util.Scanner;

public class HocVienLT extends HocVien{

	protected int soBuoiHoc ;
	protected double donGiaLT;
	
	public HocVienLT() {
		super();
		soBuoiHoc = 0;
		donGiaLT = 0;
	}
	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so buoi hoc : ");
		soBuoiHoc = sc.nextInt();
		System.out.println("Nhap don gia LT : ");
		donGiaLT = sc.nextDouble();
	}
	
	//tinh tien hoc
	public double hocPhi() {
		double uuTien = 0;
		switch (loaiUuTien) {
		case 1 : 
			uuTien = 1000000;
			break;
		case 2 : 
			uuTien = 500000;
			break;
		default :
			break;
		}
		return 1.0*soBuoiHoc*donGiaLT - uuTien;
	}
	public void inThongTin() {
		System.out.println("* Ho ten : "+ hoTen +"\n* Dia chi : "+ diaChi + "\n* Loai uu tien : "+ loaiUuTien
				+"\n* Loai chuong trinh dang ki : Lap trinh" +"\n* Hoc phi : "+ hocPhi() );
	}
}
