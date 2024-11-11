package kq_logic;

/*
 * cho biet ket qua cac bieu thuc logic
 */
public class KQ_Logic {

	public static void main(String[] args) {
		// phan a
		System.out.println("Phan a : ");
		boolean a = (2 < 3) || (4 > 3); // true or true = true
		System.out.println("a = " + a);

		// phan b
		System.out.println("Phan b : ");
		boolean b = (2 < 3) && (4 > 3); // true and true = true
		System.out.println("b = " + b);

		// phan c
		System.out.println("Phan c : ");
		boolean c = (2 < 3) && (4 < 3); // true and false = false
		System.out.println("c = " + c);

		// phan d
		System.out.println("Phan d : ");
		boolean d = !(2 > 4); // !false = true
		System.out.println("d = " + d);

		// phan e
		System.out.println("Phan d : ");
		boolean e = 2 == 3; // 2 khong bang 3 ==> false
		System.out.println("e = " + e);

		// phan f
		System.out.println("Phan f : ");
		boolean f = 4 != 3; // 4 khac 3 ==> true
		System.out.println("f = " + f);
	}
}
