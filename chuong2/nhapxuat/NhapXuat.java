package nhapxuat;

import java.util.Scanner;

public class NhapXuat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// nhap xuat so nguyen
		System.out.println("Nhap mot so nguyen: ");
		int i = sc.nextInt();
		System.out.println("So nguyen vua nhap: " + i);

		// nhap xuat so thuc
		System.out.println("Nhap mot so thuc: ");
		double d = sc.nextDouble();
		System.out.println("So thuc vua nhap: " + d);

		// nhap xuat ki tu
		System.out.println("Nhap mot ki tu: ");
		char c = sc.next().charAt(0);
		System.out.println("Ki tu vua nhap: " + c);

		// nhap xuat chuoi ki tu
		System.out.println("Nhap mot chuoi ki tu: ");
		String s = sc.next();
		System.out.println("Chuoi ki tu vua nhap: " + s);

	}
}
