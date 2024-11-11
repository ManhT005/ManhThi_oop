package sinhvien_truong;

public class SinhVien extends Nguoi{

	private String lop;
	private String nganh;
	private Truong truong;
	//constructor
	public SinhVien() {
		super();
		this.lop = "";
		this.nganh = "";
		this.truong = new Truong();
	}
	public SinhVien(String name, int tuoi, char gender,String lop, String nganh, Truong truong) {
		super(name, tuoi, gender);
		this.lop = lop;
		this.nganh = nganh;
		this.truong = truong;
	}
	// getter setter
	public String getName() {
		return super.getName();
	}

	public void setName(String name) {
		super.setName(name);
	}

	public int getTuoi() {
		return super.getTuoi();
	}

	public void setTuoi(int tuoi) {
		super.setTuoi(tuoi);;
	}

	public char getGender() {
		return super.getGender();
	}

	public void setGender(char gender) {
		super.setGender(gender);;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public String getNganh() {
		return nganh;
	}
	public void setNganh(String nganh) {
		this.nganh = nganh;
	}
	public Truong getTruong() {
		return truong;
	}
	public void setTruong(Truong truong) {
		this.truong = truong;
	}
	@Override
	public String toString() {
		return "SinhVien ["+ super.toString()+" lop=" + lop + ", nganh=" + nganh + ", truong=" + truong + "]";
	}
	
	
	
}
