package functionalInterface;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class TestFunctionalInterface {

	public static void main(String[] args) {
		
		List<String> strings = Arrays.asList(
				"Kerala",
				"Karnataka",
				"Tamil Nadu",
				"Andhra Pradesh",
				"Madhya Pradesh");
		
		Function<String, Integer> f= (str)->{
			return str.length();		
			};
			for(String str: strings) {
				System.out.println(f.apply(str));
			}
		


	//	System.out.println(f.apply("Buneos dias"));

		Function<Integer, Integer> f2 = (n) -> {
			return n * n;

		};
		System.out.println(f2.apply(25));
		
		Function<String,String>f3=(str)->{
			return str.toUpperCase();
		};
		System.out.println(f3.apply("hellooo worlddd!!!!!"));
	}

}
