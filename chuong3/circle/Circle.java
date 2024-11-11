package circle;

public abstract class Circle implements GeometricObject {

	protected double radius = 1.0;
	
	// constructor
	public Circle(double radius) {
        this.radius = radius;
    }
	//abstract method
	public abstract double getPerimeter();
	public abstract double getArea();
}
