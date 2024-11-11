package hocluc;

import java.util.Scanner;

public class HocLuc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char diem = ' ';
		// nhap diem
		System.out.println("Nhap diem tong ket (A,B,C,D,E,F): ");
		diem = Character.toUpperCase(sc.next().charAt(0));

		// hien thi hoc luc
		switch (diem) {
		case 'A':
			System.out.println("Xuat Sac");
			break;
		case 'B':
			System.out.println("Gioi");
			break;
		case 'C':
			System.out.println("Trung Binh");
			break;
		case 'D':
			System.out.println("Trung Binh");
			break;
		case 'E':
			System.out.println("Yeu");
			break;
		case 'F':
			System.out.println("Truot");
			break;
		default:
			System.out.println("Ban da nhap sai diem");
		}

	}
}
