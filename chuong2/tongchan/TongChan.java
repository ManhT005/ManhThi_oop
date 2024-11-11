package tongchan;

// tinh tong chan tu 1 - 100
public class TongChan {

	public static void main(String[] args) {
		int tong = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				tong += i;
		}
		System.out.println("tong cac so chan tu 1-100 la : " + tong);
	}
}
