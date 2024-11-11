package circle;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ban kinh hinh tron");
		double radius = sc.nextDouble();
		ResizableCircle c = new ResizableCircle(radius);
		System.out.println("Thay doi ban kinh (%) : ");
		int res = sc.nextInt();
		c.resize(res);
		System.out.println("Ban kinh moi : " + c.getRadius());
		System.out.println("Chu vi : "+ c.getPerimeter());
		System.out.println("Dien tich : "+c.getArea());
		
		
	}
}
