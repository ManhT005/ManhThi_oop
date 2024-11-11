package sinhvien_truong;

public class Truong {

	private String name;
	private String diaChi;
	private String hieuTruong;

	// constructor
	public Truong() {

		this.name = "";
		this.diaChi = "";
		this.hieuTruong = "";
	}

	public Truong(String name, String diaChi, String hieuTruong) {

		this.name = name;
		this.diaChi = diaChi;
		this.hieuTruong = hieuTruong;
	}

	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getHieuTruong() {
		return hieuTruong;
	}

	public void setHieuTruong(String hieuTruong) {
		this.hieuTruong = hieuTruong;
	}

	// toString
	@Override
	public String toString() {
		return "Truong [name=" + name + ", diaChi=" + diaChi + ", hieuTruong=" + hieuTruong + "]";
	}

}
