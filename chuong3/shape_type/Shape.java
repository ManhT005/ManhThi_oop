package shape_type;

public abstract class Shape {

	protected String color;
	public Shape() {
		this.color = "";
	}
	public abstract double getArea();
	public String toString() {
		return "Type : " + "\nColor : "+color;
	}
}
