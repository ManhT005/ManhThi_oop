package sobachuso;

// hien thi cac so 3 chu so thoa man dieu kien
public class SoBaChuSo {

	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			int a = i / 100; // chu so hang tram
			int c = i % 10; // chu so don vi
			int b = i % 100 - c; // chu so hang chuc
			if (a * a * a + b * b * b * c * c * c < 30) {
				System.out.println(i);
			}
		}
	}
}
