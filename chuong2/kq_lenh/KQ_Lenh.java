package kq_lenh;

/*
 * cho biet ket qua cac bien khi thuc hien cac lenh toan hoc
 */

public class KQ_Lenh {

	public static void main(String[] args) {
		// lenh a
		System.out.println("Phan a: ");
		int i = 5;
		int j = 6;
		int x;
		x = i++ + j++; // i = 6, j = 7, x = 11

		System.out.println("i = " + i + "\nj = " + j + "\nx = " + x);

		// lenh b
		System.out.println("Phan b: ");
		i = 10;
		j = 11;
		x = --i + j--; // i= 9 , j = 10, x= 20
		System.out.println("i = " + i + "\nj = " + j + "\nx = " + x);

		// lenh c
		System.out.println("Phan c: ");
		i = 5;
		j = 2;
		x = i % j; // x = 1
		float y = i / j; // y = 2 (phep chia nguyen chi lay phan nguyen)
		System.out.println("i = " + i + "\nj = " + j + "\nx = " + x + "\ny = " + y);

		// lenh d
		System.out.println("Phan d : ");
		i = 5;
		j = 2;
		float x1 = (float) i / j; // x = 2.5 ep kieu float cho i ==> kq : float
		System.out.println("i = " + i + "\nj = " + j + "\nx = " + x1);

		// Lenh e
		System.out.println("Phan e : ");
		i = 5;
		j = 2;
		x1 = i / (float) j; // x = 2.5 ep kieu float cho j ==> kq : float
		System.out.println("i = " + i + "\nj = " + j + "\nx = " + x1);

		// Lenh f
		System.out.println("Phan f : ");
		i = 5;
		j = 2;
		x1 = (float) i / (float) j; // x = 2.5 ep kieu float cho i,j ==> kq : float
		System.out.println("i = " + i + "\nj = " + j + "\nx = " + x1);
	}
}
