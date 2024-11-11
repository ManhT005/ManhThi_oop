package giamgia;

import java.util.Scanner;

// nhap gia goc va phan tram giam gia va dua ra gia ban cuoi cung
public class GiamGia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap gia ban : ");
		double giaGoc = sc.nextDouble();

		System.out.println("Nhap phan tram giam gia (%): ");
		int giamGia = sc.nextInt();

		double giaBan = 1.0 * giaGoc * (1 - 1.0 * giamGia / 100);
		System.out.println("Gia ban sau khi giam gia: " + giaBan);
	}
}
