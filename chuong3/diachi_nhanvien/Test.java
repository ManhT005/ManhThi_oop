package diachi_nhanvien;

import demodiachi.DiaChi;

public class Test {

	public static void main(String[] args) {
		// khoi tao 1 nhanvien
		NhanVien staff = new NhanVien();
		// khoi tao dia chi
		DiaChi adress = new DiaChi("thon a", "xa b", "huyen c", "tinh d");

		// setter, getter
		staff.setName("Nguyen Van A");
		System.out.println("Ten : " + staff.getName());
		staff.setDob("1/1/2000");
		System.out.println("Ngay sinh : " + staff.getDob());
		staff.setGender('M');
		System.out.println("Gioi tinh : " + staff.getGender());
		staff.setAdress(adress);
		System.out.println(staff.getAdress());

		// test toString
		System.out.println(staff.toString());
	}
}
