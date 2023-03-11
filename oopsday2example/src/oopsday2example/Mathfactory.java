package oopsday2example;

public class Mathfactory {

	public static void main(String[] args) {
		MathIface obj = new MathImp();
		obj.factorial(5);
        MathIface obj2 = new MathImp();
        obj2.prime(56);
	}

}
