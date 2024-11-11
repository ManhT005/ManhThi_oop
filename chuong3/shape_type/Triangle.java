package shape_type;

import java.util.Scanner;

public class Triangle extends Shape{

	protected int base;
	protected int height;
	
	public Triangle() {
		super();
		base = 0;
		height = 0;
	}
	//nhap du lieu
	public void dataInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("input height = ");
		this.height = sc.nextInt();
		System.out.println("input base = ");
		this.base = sc.nextInt();
	}
	public double getArea() {
		return 0.5*base*height;
	}
	public String toString() {
		return "Type : Rectangle" + "\nColor : "+ color + "\nBase : "+ base + "\nHeight : "+ height +"\nAera : "+ getArea();
	}
}
