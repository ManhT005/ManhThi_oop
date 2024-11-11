package nguoilaodong;

public class Test {

	public static void main(String[] args) {
		// khai bao 1 cong nhan va 1 ki su
		LaoDongPhoThong employee = new LaoDongPhoThong();
		KiSu engineer = new KiSu();

		// nhap thong tin cho employee
		System.out.println("Employee: ");
		employee.nhapThongTin();
		// tinh luong cong nhan
		employee.tinhLuong();
		System.out.println("Luong cua employee: " + employee.luongThang);
		// in thong tin cong nhan
		employee.inThongTin();

		//KiSu engineer = new KiSu();
		// nhap thong tin ki su
		System.out.println("\nEngineer: ");
		
		//java : nhap bien thuc : 2,1 (v) thay vi 2.1 (x)
		engineer.nhapThongTin();
		// tinh luong ki su
		engineer.tinhLuong();
		System.out.println("Luong cua engineer: " + engineer.luongThang);
		// in thong tin engineer
		engineer.inThongTin();
	}
}
