package oopsday3.line;

public class Main {

	public static void main(String[] args) {
		DrawIface d=new Functions();
		Point P1=new Point(10,30);
		Point P2 = new Point(30,50);
		
		d.draw(P1, P2);
		
		
		

	}

}
