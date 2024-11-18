package exchange_money;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] MonArr = {
				"USD;VND;17000",
				"EUR;USD;1.2",
				"USD;IDN;15789",
		        "USD;EUR;0.83",
		        "CAD;IDN;16869"
		};// ti le chuyen doi voi 2 loai tien te cho truoc
		
		Exchange e = new Exchange();
		
		//lay ti le chuyen doi cho Exchange (them phan tu cho danh sach)
		for(int i = 0; i<MonArr.length; i++) {
			String[] path = MonArr[i].split(";");
			//chia String MonArr[i] thanh mang String, phan chia phan tu theo dau ";" ==> co 3 phan tu
			String code1 = path[0];
			String code2 = path[1];
			double rate = Double.parseDouble(path[2]);//parse : chuyen doi tu kieu String sang kieu tuong ung
			Rate r = new Rate(code1, code2, rate);
			e.dsTyLeDoiTien.add(r); //them ti ke doi tien r vao danh sach
		}
		System.out.println("Chuyen tien tu ma tien 1 ==> ma tien 2 ");
		System.out.println("Nhap ma tien te thu nhat :");
		String code1 = sc.nextLine().toUpperCase();
		System.out.println("Nhap ma tien te thu hai :");
		String code2 = sc.nextLine().toUpperCase();
		try {
			System.out.println("Nhap so luong tien chuyen doi :");
			double amount = sc.nextDouble();
			System.out.println("Luong tien sau khi doi : "+e.convert(code1, code2, amount));
		} catch (IllegalArgumentException e2) {
			System.out.println(e2.getMessage());
		}
		
	}
}
