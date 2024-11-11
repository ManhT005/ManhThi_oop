package diachi_nhanvien;

import demodiachi.DiaChi;

public class NhanVien {

	private String name;
	private String dob;
	private char gender;
	private DiaChi adress; // quan he ket tap : variable's type = other Class

	// constructor
	public NhanVien() {
		this.name = "";
		this.dob = "";
		this.gender = ' ';
		this.adress = new DiaChi();
	}

	public NhanVien(String name, String dob, char gender, DiaChi adress) {
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.adress = adress;
	}

	// setter, getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public DiaChi getAdress() {
		return adress;
	}

	public void setAdress(DiaChi adress) {
		this.adress = adress;
	}

	// toString()
	@Override
	public String toString() {
		return "NhanVien [name :" + name + ", dob=" + dob + ", gender=" + gender +", "+ adress.toString() + "]";
	}

}
