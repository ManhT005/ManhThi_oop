package mangso;

import java.util.Scanner;

public class MangSoNguyen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so phan tu cua mang: ");
		int n = sc.nextInt();

		// tao mang so nguyen a
		int[] a = new int[n];
		// nhap phan tu cua mang
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}

		// hien thi mang a
		System.out.println("Mang vua nhap : ");
		for (int i : a) {
			System.out.print(i + " ");
		}

	}
}
