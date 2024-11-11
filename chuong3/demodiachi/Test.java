package demodiachi;

public class Test {

	public static void main(String[] args) {
		DiaChi adr = new DiaChi();

		// test setter, getter
		adr.setThon("Thon 1");
		System.out.println("Thon :" + adr.getThon());
		adr.setXa("Xa 2");
		System.out.println("Xa :" + adr.getXa());
		adr.setHuyen("Huyen 3");
		System.out.println("Huyen :" + adr.getHuyen());
		adr.setTinh("Tinh 4");
		System.out.println("Tinh :" + adr.getTinh());

		// test toString
		System.out.println("Doi tuong adr : " + adr.toString());
	}
}
