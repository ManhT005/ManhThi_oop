package songuyento;
import java.util.Scanner;

// Nhap vao 1 so nguyen va kiem tra co phai so nguyen to khong
public class Check_SNT {

	// ham check so nguyen to
	// static ==> co the goi truc tiep method thong qua <ClassName>
	public static boolean check(int n) {
		if (n <= 1)
			return false;

		for (int i = 2; i <= (int) Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// nhap so nguyen
		System.out.println("Nhap 1 so nguyen : ");
		int n = sc.nextInt();
		// ktra so nguyen to
		if (Check_SNT.check(n)) {
			System.out.println("So nguyen vua nhap la so nguyen to");
		} else {
			System.out.println("So nguyen vua nhap khong phai so nguyen to");
		}
	}

}
