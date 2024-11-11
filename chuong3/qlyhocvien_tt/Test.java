package qlyhocvien_tt;

public class Test {

	public static void main(String[] args) {
		HocVienDH dh = new HocVienDH();
		HocVienLT lt = new HocVienLT();
		
		//doi tuong do hoa
		System.out.println("Hoc vien do hoa: ");
		dh.nhapThongTin();
		dh.inThongTin();
		
		//doi tuong lap trinh
		System.out.println("\nHoc vien lap trinh");
		lt.nhapThongTin();
		lt.inThongTin();
	}
}
