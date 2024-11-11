package qlyhocvien_tt;

import java.util.Scanner;


public class HocVienDH extends HocVien{

	protected int soBuoiHoc ;
	protected double donGiaDH;
	
	public HocVienDH() {
		super();
		soBuoiHoc = 0;
		donGiaDH = 0;
	}
	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so buoi hoc : ");
		soBuoiHoc = sc.nextInt();
		System.out.println("Nhap don gia DH : ");
		donGiaDH = sc.nextDouble();
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
		return 1.0*soBuoiHoc*donGiaDH - uuTien;
	}
	public void inThongTin() {
		System.out.println("* Ho ten : "+ hoTen +"\n* Dia chi : "+ diaChi + "\n* Loai uu tien : "+ loaiUuTien
				+"\n* Loai chuong trinh dang ki : Do hoa" +"\n* Hoc phi : "+ hocPhi() );
	}
}
