package nguoilamcong;

public abstract class Person {

	private String name;
	private int age;
	private char gender;

	// constructor
	public Person() {
		this.name = " ";
		this.age = 0;
		this.gender = ' ';
	}

	public Person(String name, int tuoi, char gender) {
		this.name = name;
		this.age = tuoi;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int tuoi) {
		this.age = tuoi;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Nguoi [name : " + name + ", age : " + age + ", gender : " + gender + "]";
	}


}
