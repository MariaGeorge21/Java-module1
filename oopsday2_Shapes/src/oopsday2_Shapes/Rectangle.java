package oopsday2_Shapes;

public class Rectangle implements ShapeIface {
	private int length;
	private int breadth;

public Rectangle() {
	// TODO Auto-generated constructor stub
}
	@Override
public String toString() {
	return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
}
	public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public int getBreadth() {
	return breadth;
}
public void setBreadth(int breadth) {
	this.breadth = breadth;
}
	public Rectangle(int length, int breadth) {
	super();
	this.length = length;
	this.breadth = breadth;
}
	@Override
	public void area() {
		System.out.println("Area is" +length * breadth);
	

	}

}