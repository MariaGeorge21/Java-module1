package oopsday5;
final class A
{
	final void m() {
		
	}
}
/*class B extends A{
	void m() {
		
	}
}*/

public class TestFinal {
	int a=b;//b is forward reference
	static int b=10;
	final double pi=3.14;//compile time constant
	
	public TestFinal()
	{
		System.out.println(3.14);
	}
	public static void main(String[] args) {
		
	}

}
