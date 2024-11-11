package qlybenhnhan;

public class Test {

	public static void main(String[] args) {
		BenhVien hos = new BenhVien("Bach Mai","HN","chairman" );
		BenhNhan bn = new BenhNhan();
		
		// setter getter
		bn.setName("a");
		System.out.println("Ten benh nhan: "+ bn.getName());
		bn.setTuoi(25);
		System.out.println("Tuoi benh nhan: "+ bn.getTuoi());
		bn.setGender('F');
		System.out.println("Gioi tinh benh nhan: "+ bn.getGender());
		bn.setTienSu("abc");
		System.out.println("Tien su benh nhan: "+ bn.getTienSu());
		bn.setChanDoan("def");
		System.out.println("Chan doan benh nhan: "+ bn.getChanDoan());
		bn.setBenhVien(hos);
		System.out.println( bn.getBenhVien().toString());
		
		// tostring
		System.out.println(bn.toString());
	}

}
