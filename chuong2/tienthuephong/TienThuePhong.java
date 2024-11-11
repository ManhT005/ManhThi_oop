package tienthuephong;

import java.util.Scanner;

// Nhap so ngay luu tru va don gia theo ngay
// dua ra so tien thue phong phai tra
public class TienThuePhong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soNgayThue = 0;
		System.out.println("Nhap don gia mot ngay: ");
		long donGiaNgay = sc.nextLong();
		do {
			System.out.println("Nhap so ngay luu tru (>0): ");
			soNgayThue = sc.nextInt();
		} while (soNgayThue < 1);

		double tienThue = 0;
		if (soNgayThue >= 11) {
			tienThue = soNgayThue * donGiaNgay * (1.0 - 60.0 / 100);
		} else if (soNgayThue >= 5) {
			tienThue = soNgayThue * donGiaNgay * (1.0 - 40.0 / 100);
		} else if (soNgayThue >= 2) {
			tienThue = soNgayThue * donGiaNgay * (1.0 - 20.0 / 100);
		} else
			tienThue = 1.0 * soNgayThue * donGiaNgay;
		System.out.println("So tien thue phai tra : " + tienThue);
	}
}
