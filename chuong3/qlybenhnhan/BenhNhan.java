package qlybenhnhan;

public class BenhNhan extends Nguoi  {

	private String tienSu;
	private String chanDoan;
	private BenhVien benhvien;
	public BenhNhan() {
		super();
		this.tienSu = "";
		this.chanDoan = "";
		this.benhvien = new BenhVien();
	}
	public BenhNhan(String ten, int tuoi, char gioiTinh, String tienSu, String chanDoan, BenhVien benhvien) {
		super(ten,tuoi,gioiTinh);
		this.tienSu = tienSu;
		this.chanDoan = chanDoan;
		this.benhvien = benhvien;
	}
	//getter, setter
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
		super.setTuoi(tuoi);
	}
	public char getGender() {
		return super.getGender();
	}
	public void setGender(char gender) {
		super.setGender(gender);
	}
	public String getTienSu() {
		return tienSu;
	}
	public void setTienSu(String tienSu) {
		this.tienSu = tienSu;
	}
	public String getChanDoan() {
		return chanDoan;
	}
	public void setChanDoan(String chanDoan) {
		this.chanDoan = chanDoan;
	}
	public BenhVien getBenhVien() {
		return benhvien;
	}
	public void setBenhVien(BenhVien benhvien) {
		this.benhvien = benhvien;
	}
	@Override
	public String toString() {
		return "BenhNhan ["+super.toString()+ " tienSu=" + tienSu + ", chanDoan=" + chanDoan + ", benhvien=" + benhvien + "]";
	}
	
	
	
	
	

}
