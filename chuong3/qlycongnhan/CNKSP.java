package qlycongnhan;

import java.util.Scanner;

public class CNKSP extends CongNhan {

	protected final int SOSP = 1000;
	protected int soSP;
	protected double donGiaSP;
	
	public CNKSP() {
		super();
		soSP =0;
		this.donGiaSP = 0;
	}
	// nhap thong tin
	public void nhapThongTin() {
		System.out.println("Nhap thong tin cong nhan khoan san pham :");
		super.nhapThongTin();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so san pham : ");
		this.soSP = sc.nextInt();
		System.out.println("Nhap don gia 1 san pham : ");
		this.donGiaSP = sc.nextDouble();
		
	}
	//tinh luong cnksp
	public double tinhLuong() {
		double thuong = 0;
		if (soSP >= SOSP +100) {
			thuong = 1000000;
		}else if (soSP >= SOSP +150) {
			thuong = 1500000;
		}
		luongThang = soSP*donGiaSP +thuong;
		return luongThang;
	}
	
	// in thong tin
	public void inThongTin() {
		super.inThongTin();
	}

	
}
