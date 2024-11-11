package demodiachi;

public class DiaChi {

	private String thon;
	private String xa;
	private String huyen;
	private String tinh;

	// constructor
	public DiaChi() {
		this.thon = "";
		this.xa = "";
		this.huyen = "";
		this.tinh = "";
	}

	public DiaChi(String thon, String xa, String huyen, String tinh) {
		this.thon = thon;
		this.xa = xa;
		this.huyen = huyen;
		this.tinh = tinh;
	}

	// setter , getter
	public String getThon() {
		return thon;
	}

	public void setThon(String thon) {
		this.thon = thon;
	}

	public String getXa() {
		return xa;
	}

	public void setXa(String xa) {
		this.xa = xa;
	}

	public String getHuyen() {
		return huyen;
	}

	public void setHuyen(String huyen) {
		this.huyen = huyen;
	}

	public String getTinh() {
		return tinh;
	}

	public void setTinh(String tinh) {
		this.tinh = tinh;
	}

	// toString
	@Override
	public String toString() {
		return "DiaChi [thon : " + thon + ", xa : " + xa + ", huyen : " + huyen + ", tinh : " + tinh + "]";
	}

}
