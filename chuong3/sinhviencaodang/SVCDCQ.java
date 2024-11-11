package sinhviencaodang;

import java.util.Scanner;

public class SVCDCQ extends Nguoi{

	protected double TDKT; // tong diem kiem tra
	protected int SMKT; // so  mon kiem tra
	protected double DTKTHP; //diem thi ket thuc hoc phan
	
	public SVCDCQ() {
		super();
		TDKT = 0;
		SMKT = 0;
		this.DTKTHP = 0;
	}
	
	// nhap thong tin
	public void nhapThongTin() {
		System.out.println("\nNhap thong tin sinh vien cao dang chinh quy : ");
		super.nhapThongTin();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap tong diem kiem tra : ");
		this.TDKT = sc.nextDouble();
		System.out.println("Nhap diem thi ket thuc hoc phan : ");
		this.DTKTHP = sc.nextDouble();
		System.out.println("Nhap so mon kiem tra");
		this.SMKT = sc.nextInt();
		
	}
	
	// tinh diem 
	public double tinhDiem() {
		double diem = 0;
		Scanner sc = new Scanner(System.in);
		try{
			diem = (TDKT / SMKT + DTKTHP) /3;
		}
		catch(ArithmeticException e) {
			System.out.println("Vui nhap nhap so mon kiem tra > 0");
			while(SMKT <=0 ) {
				System.out.println("SMKT = ");
				this.SMKT = sc.nextInt();
			}
			diem = (TDKT / SMKT + DTKTHP) /3;
		}
		return diem;
	}
	
	public void inThongTin() {
		super.inThongTin();
	}
}