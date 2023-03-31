package functionalInterface;
import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;

public class PredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings = Arrays.asList(
				"Kerala",
				"Karnataka",
				"Tamil Nadu",
				"Andhra Pradesh",
				"Madhya Pradesh");
		Predicate<String> p =(String str) ->
		{
			return str.length()>4;
		};
		System.out.println(p.test("Holla"));
		for(String str:strings)
		System.out.println(p.test(str));
	}

	

	public static void longString(List<String>strings,Predicate<String>p) {
		for(String str:strings) {
			System.out.println(p.test(str));
		}
		
	}
}