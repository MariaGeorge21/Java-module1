package anotherpkg;
import Source.Parent;

public class NonSubClass {
	public NonSubClass() {
		Parent p = new Parent();
		System.out.println(p.d);
	}

}
