package tongle;
// tinh tong cac so le tu 1-100
public class TongLe {

	public static void main(String[] args ) {
		int tong = 0;
		for (int i=0; i<= 100; i++) {
			if(i%2 == 1) {
				tong += i;
			}
		}
		System.out.println("Tong cac so le tu 1-100 la : " + tong);
	}
}
