package shape_type;

import java.util.Scanner;

public class Rectangle extends Shape {

	protected int length;
	protected int width;
	
	public Rectangle() {
		super();
		length = 0;
		width = 0;
	}
	//nhap du lieu
	public void dataInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("input length = ");
		this.length = sc.nextInt();
		System.out.println("input width = ");
		this.width = sc.nextInt();
	}
	//tinh dien tich
	public double getArea() {
		return 1.0*length*width;
	}
	public String toString() {
		return "Type : Rectangle" + "\nColor : "+ color + "\nLength : "+ length + "\nWidth : "+ width + "\nArea : " + getArea();
	}
}
