package sinhvien_truong;

public class Test {

	public static void main(String[] args) {
		Truong sch = new Truong("DH", "HN", "hieu truong");
		SinhVien sv = new SinhVien();
		// setter getter
		sv.setName("a");
		System.out.println("Ten benh nhan: " + sv.getName());
		sv.setTuoi(25);
		System.out.println("Tuoi benh nhan: " + sv.getTuoi());
		sv.setGender('F');
		System.out.println("Gioi tinh benh nhan: " + sv.getGender());
		sv.setLop("abc");
		System.out.println("Tien su benh nhan: " + sv.getLop());
		sv.setNganh("def");
		System.out.println("Chan doan benh nhan: " + sv.getNganh());
		sv.setTruong(sch);
		System.out.println(sv.getTruong().toString());

		// toString
		System.out.println(sv.toString());
	}
}
