package tinh_songuyen;
import java.util.Scanner;

public class TinhSoNguyen {
	
	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);
		//nhap so nguyen
		System.out.println("Nhap so nguyen a: ");
		int a = sc.nextInt();
		System.out.println("Nhap so nguyen b: ");
		int b = sc.nextInt();
		
		// tinh tong hieu tich thuong
		int tong = a + b;
		System.out.println("a + b = "+ tong);
		int hieu = a - b;
		System.out.println("a + b = "+ hieu);
		long tich = 1l * a * b;
		System.out.println("a * b = "+ tich);
		double thuong = 1.0 * a / b;
		System.out.println("a / b = "+ thuong);
		
	}

}
