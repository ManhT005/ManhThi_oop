package invalid_date_exception;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		try {
            // Nhập giá trị ngày, tháng, năm (thử nghiệm)
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap ngay :");
			int ngay = sc.nextInt();
			System.out.println("Nhap thang : ");
			int thang = sc.nextInt();
			System.out.println("Nhap nam : ");
			int nam = sc.nextInt();
            ThoiGian thoiGian = new ThoiGian(ngay, thang, nam); 
            System.out.println(thoiGian);
        } catch (InvalidDateException e) {
            // Hiển thị thông báo lỗi khi có ngoại lệ
            System.out.println("Lỗi: " + e.getMessage());
        }
	}
}
