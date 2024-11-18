package exception_devidezero;

import java.util.Scanner;

public class DevideZeroException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so nguyen a :");
		int a = sc.nextInt();
		System.out.println("Nhap so nguyen b :");
		int b = sc.nextInt();
		try {
			int de = a/b;
			System.out.println("a/b = " + de);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("cannot devide by zero");
		}catch (Exception e) {
			System.out.println("Error " + e.getMessage());
		}
		
	}
}
