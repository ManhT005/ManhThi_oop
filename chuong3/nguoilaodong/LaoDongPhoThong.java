package nguoilaodong;
import java.util.Scanner;

public class LaoDongPhoThong extends NguoiLaoDong {
	protected long luongThang;
	protected long donGia;
	protected int soNgayCong;
	protected long thuong;

	public LaoDongPhoThong() {
		super();
		donGia = 0;
		soNgayCong = 0;
		thuong = 0;
		luongThang = 0;
	}

	public LaoDongPhoThong(String hoTen, String diaChi, String loaiLaoDong, long luongThang, long donGia,
			int soNgayCong, long thuong) {
		super(hoTen, diaChi, loaiLaoDong);
		this.luongThang = luongThang;
		this.donGia = donGia;
		this.soNgayCong = soNgayCong;
		this.thuong = thuong;
	}

	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap don gia ngay cong :");
		this.donGia = sc.nextLong();
		System.out.println("Nhap so ngay cong: ");
		this.soNgayCong = sc.nextInt();
		
	}

	public void tinhLuong() {
		if (this.soNgayCong < 15 && this.soNgayCong >= 0) {
			this.thuong = 0;
		} else if (this.soNgayCong < 25) {
			this.thuong = 700000;
		} else
			this.thuong = 1000000;
		this.luongThang = this.donGia * this.soNgayCong + this.thuong;
	}

	public void inThongTin() {
		super.inThongTin();
		System.out.println(this.luongThang);
	}
}
