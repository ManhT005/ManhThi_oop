package sinhviencaodang;

import java.util.Scanner;

public class SVCDN extends Nguoi{

	protected double TDKT; // tong diem kiem tra
	protected int SMKT; // so  mon kiem tra
	
	public SVCDN() {
		super();
		TDKT = 0;
		SMKT = 0;
	}
	
	// nhap thong tin
	public void nhapThongTin() {
		System.out.println("\nNhap thong tin sinh vien cao dang nghe : ");
		super.nhapThongTin();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap tong diem kiem tra : ");
		this.TDKT = sc.nextDouble();
		System.out.println("Nhap so mon kiem tra");
		this.SMKT = sc.nextInt();
		
	}
	
	// tinh diem 
	public double tinhDiem() {
		double diem = 0;
		Scanner sc = new Scanner(System.in);
		try{
			diem = TDKT / SMKT;
		}
		catch(ArithmeticException e) {
			System.out.println("Vui nhap nhap so mon kiem tra > 0");
			while(SMKT <=0 ) {
				System.out.println("SMKT = ");
				this.SMKT = sc.nextInt();
			}
			diem = TDKT / SMKT;
		}
		return diem;
	}
	
	public void inThongTin() {
		super.inThongTin();
	}
}
