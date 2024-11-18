package listcircle;

import java.util.Scanner;

public class TestCircle {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Test class Circle : ");
		System.out.println("Nhap ban kinh hinh tron");
		float radius = sc.nextFloat();
		
		// khoi tao doi tuong 
		Circle circle = new Circle(radius);
		
		// test cac phuong thuc
		System.out.println("Dien tich hinh tron la : "+ circle.getArea());
		System.out.println("Thong tin : \n"+ circle.toString());
		
	    // test class CircleCollection 
		System.out.println("\nTest class CircleCollection :");
		Circle c1 = new Circle(1);
		Circle c2 = new Circle(2);
		Circle c3 = new Circle(3);
		CircleCollection a = new CircleCollection();
		// them vao danh sach 3 circle
		a.addCircle(c1);
		a.addCircle(c2);
		a.addCircle(c3);
		
		System.out.printf("Tong dien tich cac hinh tron trong danh sach : " +"%.3f",a.calcSumArea() );
		System.out.printf("Dien tich lon nhat : "+"%.3f", a.findMaxArea() );
		System.out.println("Hinh tron co dien tich nho nhat : ");
		a.getMinCircle();
		System.out.println("Hien thi danh sach hinh tron :");
		System.out.println(a.toString());
	}
	
}
