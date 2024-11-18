package exception_stringtoolong;

import java.util.Scanner;

public class TestString_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chuoi ky tu de kiem tra do dai (nhap 'DONE' de ket thuc chuong trinh) ");
		while (true) {
			try {
				System.out.println("Nhap chuoi : ");
				String string = sc.nextLine();
				
				//khi nhap done thi dung chuong trinh
				if(string.equalsIgnoreCase("DONE")) {
					System.out.println("Ket thuc chuong trinh!!!");
					break;
				}
				
				// kiem tra do dai neu vuot qua 20 thi dua ra ngoai le
				if(string.length() > 20) {
					throw new StringTooLongException("Chuoi vua nhap do dai vuot qua 20 : "+ string);
				}
				
				System.out.println("Chuoi ban nhap hop le : "+ string +"\n");
			} catch (StringTooLongException e) {
				System.out.println("Loi" + e.getMessage());
				System.out.println("Hay nhap chuoi do dai nho hon 20! \n");
			}
		}
	}
}
