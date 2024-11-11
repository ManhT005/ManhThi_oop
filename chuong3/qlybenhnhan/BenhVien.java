package qlybenhnhan;

public class BenhVien {

	private String name;
	private String diaChi;
	private String giamDoc;
	
	// constructor
	public BenhVien() {
		this.name = "";
		this.diaChi = "";
		this.giamDoc = "";
	}
	public BenhVien(String name, String diaChi, String giamDoc) {
		this.name = name;
		this.diaChi = diaChi;
		this.giamDoc = giamDoc;
	}
	
	//getter, setter
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
	public String getGiamDoc() {
		return giamDoc;
	}
	public void setGiamDoc(String giamDoc) {
		this.giamDoc = giamDoc;
	}
	//toString
	@Override
	public String toString() {
		return "BenhVien [name=" + name + ", diaChi=" + diaChi + ", giamDoc=" + giamDoc + "]";
	}
	
	
	
}
