package sinhvien_truong;

public class Nguoi {

	private String name;
	private int tuoi;
	private char gender;

	// constructor
	public Nguoi() {
		this.name = " ";
		this.tuoi = 0;
		this.gender = ' ';
	}

	public Nguoi(String name, int tuoi, char gender) {
		this.name = name;
		this.tuoi = tuoi;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Nguoi [name : " + name + ", tuoi : " + tuoi + ", gender : " + gender + "]";
	}
}
