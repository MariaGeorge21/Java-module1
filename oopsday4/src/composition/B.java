package composition;

public class B extends A {

	public B(){
		// super();
		// not allowed->System.out.println(x+y);
		super(10,20);
	}
}
