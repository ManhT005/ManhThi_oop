package democlass_person;

public class Test {

	public static void main(String[] args) {
		Person exPerson = new Person(); // khoi tao doi tuong exPerson thuoc lop Person

		// test setter , getter
		exPerson.setName("A");
		System.out.println("Ten cua doi tuong : " + exPerson.getName());
		exPerson.setDob("1/1/2000");
		System.out.println("Ngay sinh cua doi tuong : " + exPerson.getDob());
		exPerson.setPob("HN");
		System.out.println("Noi sinh cua doi tuong : " + exPerson.getPob());
		exPerson.setGender('M');
		System.out.println("Gioi tinh cua doi tuong : " + exPerson.getGender());
		exPerson.setEmail("Abc@gmail.com");
		System.out.println("Ten cua doi tuong : " + exPerson.getEmail());
		exPerson.setPhone("012345");
		System.out.println("Ten cua doi tuong : " + exPerson.getPhone());

		// test toString
		System.out.println("Thong tin : " + exPerson.toString());

	}
}
