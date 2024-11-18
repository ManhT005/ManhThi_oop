package listcircle;

import java.util.ArrayList;

public class CircleCollection {

	ArrayList<Circle> al = new ArrayList<>();
	
	//them 1 hinh tron vao danh sach
	public void addCircle(Circle c) {
		al.add(c);
	}
	//lay hinh tron tai vi tri thu pos trong ds
	public Circle getCircle(int pos) {
		return al.get(pos);
	}
	//thiet lap cho phan tu thu pos trong ds
	public void setCircle(int pos, Circle c) {
		al.set(pos, c);
	}
	
	// tra ve thong tin cac hinh tron trong ds
	public String toString() {
		return al.toString();
	}
	public double calcSumArea() {
		double sum = 0;
		for (Circle circle : al) {
			sum += circle.getArea();
		}
		return sum;
	}
	//tim dien tich nho nhat
	public double findMinArea() {
		double min = al.get(0).getArea();
		for (Circle c : al) {
			if(c.getArea() < min )
				min = c.getArea();
		}
		return min;
	}
	//tim dien tich lon nhat
	public double findMaxArea() {
		double max = al.get(0).getArea();
		for (Circle c : al) {
			if(c.getArea() > max )
				max = c.getArea();
		}
		return max;
	}
	
	//lay hinh tron nho nhat
	public void getMinCircle() {
		for (int i=0; i<al.size() ; i++) {
			if(al.get(i).getArea() == findMinArea()) {
				System.out.println("Min circle : index = "+ i + ", radius = "+al.get(i).radius);
			}
		}
	}
	
}
