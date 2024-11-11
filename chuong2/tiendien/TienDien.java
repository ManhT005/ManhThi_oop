package tiendien;
import java.util.Scanner;

// nhap vao so dien tieu thu va dua ra so tien dien
public class TienDien {

	public static void main(String[] args ) {
		final int D1= 1481;
		final int D2= 1533;
		final int D3= 1786;
		final int D4= 2242;
		Scanner sc = new Scanner(System.in);
		int soDien = 0;
		do {
			System.out.println("Nhap so dien tieu thu thang vua qua: ");
			soDien = sc.nextInt();
		} while (soDien < 0);
		
		long tienDien = 0;
		
		if(soDien <51) {
			tienDien = D1 * soDien;
		}else if(soDien < 101) {
			tienDien  = D1*50 + D2*(soDien - 50);
		}else if(soDien < 201) {
			tienDien  = D1*50 + D2*50 + D3*(soDien - 100);
			
		}else
			tienDien  = D1*50 + D2*50 + D3*100 + D4*(soDien - 200);
		System.out.println("Tien dien : "+ tienDien);
		
	}
}
