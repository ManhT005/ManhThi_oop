package xeploaisv;

import java.util.Scanner;

// nhap diem thi cua sinh vien sau do xep loai
public class XepLoaiSV {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int diemThi = 0;
		do {
			System.out.println("Nhap diem thi cua sinh vien (thang diem 100): ");
			diemThi = sc.nextInt();
		} while (diemThi < 0 || diemThi > 100);

		if (diemThi < 50) {
			System.out.println("Xep loai : F");
		} else if (diemThi < 70) {
			System.out.println("Xep loai : D");
		} else if (diemThi < 80) {
			System.out.println("Xep loai : C");

		} else if (diemThi < 90) {
			System.out.println("Xep loai : B");
		} else if (diemThi < 100) {
			System.out.println("Xep loai : A");
		}

	}
}
