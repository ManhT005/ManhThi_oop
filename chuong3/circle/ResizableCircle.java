package circle;

public class ResizableCircle extends Circle implements Resizable{

	public ResizableCircle(double radius) {
		super(radius);
	}
	public double getRadius() {
		return radius;
	}
	public void resize(int percent) {
		radius = radius * percent / 100;
	}
	// tinh chu vi
	public double getPerimeter() {
		return 2*3.14*radius;
	}
	//tinh dien tich
	public double getArea() {
		return radius*radius*3.14;
	}
}
