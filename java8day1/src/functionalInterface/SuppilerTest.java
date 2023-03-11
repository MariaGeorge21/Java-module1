package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SuppilerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings = Arrays.asList(
				"Kerala",
				"Karnataka",
				"Tamil Nadu",
				"Andhra Pradesh",
				"Madhya Pradesh");
	
	Supplier<String> supplier = ()->{
		return new String("Hola!");
		
	};
	System.out.println(supplier.get());
}
}
