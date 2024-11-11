package doinhietdo;

import java.util.Scanner;

public class CtoF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap nhiet do (do C) : ");
		double doC = sc.nextDouble();

		// tinh do F
		double doF = 1.8 * doC + 32; // theo cong thuc c = (f - 32)/1.8
		System.out.println("Nhiet do chuyen doi sang do F: ");
		System.out.println(doC + " .C = " + doF + " .F");
	}
}
