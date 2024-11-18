package listcircle;

public class Circle {

	protected float radius; // ban kinh
	
	//constructor
	Circle(){
		radius = 0;
	}
	Circle(float radius){
		this.radius = radius;
	}
	
	//tinh dien tich
	public float getArea() {
		return this.radius * this.radius * 3.14f;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", area= "+getArea() +"]";
	}
	
	
}
