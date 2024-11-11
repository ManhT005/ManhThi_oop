package nguoilaodong;

import java.util.Scanner;

public abstract class NguoiLaoDong {

	protected String hoTen;
	protected String diaChi;
	protected String loaiLaoDong;

	public NguoiLaoDong() {
		hoTen = "";
		diaChi = "";
		loaiLaoDong = "";
	}

	public NguoiLaoDong(String hoTen, String diaChi, String loaiLaoDong) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiLaoDong = loaiLaoDong;

	}

	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho ten :");
		this.hoTen = sc.nextLine();
		System.out.println("Nhap dia chi :");
		this.diaChi = sc.nextLine();
		System.out.println("Nhap loai lao dong : ");
		this.loaiLaoDong = sc.nextLine();
		

	}

	public abstract void tinhLuong();

	public void inThongTin() {
		System.out.print("Thong tin doi tuong: " + "\nHo ten: " + hoTen + "\nDia chi: " + diaChi + "\nLoai lao dong: "
				+ loaiLaoDong + "\nLuong thang:");
	}
}
