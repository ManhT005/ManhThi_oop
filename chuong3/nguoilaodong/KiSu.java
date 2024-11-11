package nguoilaodong;
import java.util.Scanner;
public class KiSu extends NguoiLaoDong {

	protected double luongThang;
	protected double luongCoBan;
	protected float heSoLuong;
	protected int soNgayCong;
	protected double thuong;

	public KiSu() {
		super();
		heSoLuong = 0;
		soNgayCong = 0;
		luongCoBan = 0;
		thuong = 0;
		luongThang = 0;
	}

	public KiSu(String hoTen, String diaChi, String loaiLaoDong, double luongThang, double luongCoBan, float heSoLuong,
			int soNgayCong, double thuong) {
		super(hoTen, diaChi, loaiLaoDong);
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
		this.thuong = thuong;
		this.luongThang = luongThang;
		this.soNgayCong = soNgayCong;
	}

	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap luong co ban :");
		this.luongCoBan = sc.nextDouble();
		System.out.println("Nhap he so luong ");
		this.heSoLuong = sc.nextFloat();
		System.out.println("Nhap so ngay cong :");
		this.soNgayCong = sc.nextInt();
		
	}

	public void tinhLuong() {
		if (this.soNgayCong < 15 && this.soNgayCong >= 0) {
			this.thuong = 0;
		} else if (this.soNgayCong < 25) {
			this.thuong = 700000;
		} else
			this.thuong = 1000000;
		this.luongThang = this.luongCoBan * this.heSoLuong + this.thuong;
	}

	public void inThongTin() {
		super.inThongTin();
		System.out.printf("%.3f",this.luongThang ) ;
	}
}
