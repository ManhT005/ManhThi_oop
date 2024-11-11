package shape_type;

import java.io.IOException;

public class Test {

	public static void main(String[] args)  {
		Rectangle rec = new Rectangle();
		Triangle tri = new Triangle();
		//test rectangle
		System.out.println("Input Rectangle : ");
		rec.dataInput();
		System.out.println(rec.toString());
		//test triangle
		System.out.println("\nInput Triangle : ");
		tri.dataInput();
		System.out.println(tri.toString());
		
		System.out.println("Kiem tra doi tuong triangle co trong class Rectanle khong: ");
		Shape triangle = new Triangle();
		if(triangle instanceof Rectangle) {
				System.out.println("Doi tuong thuoc lop RecTangle");
		}
		else {
			System.out.println("Doi tuong khong thuoc lop RecTangle");
		}
	}
		
}
