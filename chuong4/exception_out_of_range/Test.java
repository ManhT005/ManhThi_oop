package exception_out_of_range;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap luong cho doi tuong (5tr - 20tr)");
		try {
			float luong = sc.nextFloat();
			if(luong < 5000000 || luong >20000000) {
				throw new OutOfRangeException("So nam ngoai pham vi cho phep !");
			}
			
			System.out.println("luong = "+ luong);
			System.out.println("So luong hop le!!");
		}catch (OutOfRangeException e) {
			System.out.println("Loi : " + e.getMessage());
		}
	}
}
