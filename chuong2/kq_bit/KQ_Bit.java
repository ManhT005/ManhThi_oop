package kq_bit;

/*
 * cho biet ket qua phep toan bit
 */
public class KQ_Bit {

	public static void main(String[] args) {

		// a = 10
		// b = 100
		int a = 10;
		int b = 100;
		int kq;
		// phan a
		System.out.println("Phan a");
		kq = a | b;
		System.out.println("ket qua = " + kq); // a or b

		// phan b
		System.out.println("Phan b");
		kq = a & b;
		System.out.println("ket qua = " + kq); // a and b = 0

		// phan c
		System.out.println("Phan c");
		kq = a ^ b; // xor : cong module khong nho (so bit 1 la le ==>1)
		System.out.println("ket qua = " + kq); // a xor b

		// phan d
		System.out.println("Phan d");
		kq = ~a; // phu dinh a
		System.out.println("ket qua = " + kq); // 11110101b

		// phan e
		System.out.println("Phan e");
		kq = a >> 2; // dich phai a 2 bit
		System.out.println("ket qua = " + kq);

		// phan f
		System.out.println("Phan f");
		kq = b << 2; // dich trai b 2 bit
		System.out.println("ket qua = " + kq);

	}
}
