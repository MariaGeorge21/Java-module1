package oopsday4.polymorphism;

public class TestShapes {

	public static void main(String[] args) {
		double d=10;
		Shape s = new Rectangle(10.25,65.75);
		double result = s.area();
		System.out.println(result);
		
		s=new Circle(35.87);
		result = s.area();
		System.out.println(result);
		
		s=new Square(55);
		result=s.area();
		System.out.println(result);
		
		Object obj = new String("Hello");
		obj = new Integer("10");
		obj = new java.util.Scanner(System.in);
		obj = new Rectangle();
		
	}

}
