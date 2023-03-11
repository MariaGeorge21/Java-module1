package functionalInterface;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Functionalinterfce {
	public static void main(String[] args) {

		List<String> strings = Arrays.asList("Kerala", "Karnataka", "Tamil Nadu", "Andhra Pradesh", "Madhya Pradesh");

		Function<String, Integer> f = (str) -> {
			return str.length();
		};
		Function<String,String> f1=(str)->{
			return str.toUpperCase();
		};
		
		Function<String,String> f2=(str)->{
			return str.toLowerCase();
		};
		Function<String,String> f3=(str)->{
			return str.toLowerCase();
		};
		Function<String,String> f4=(str)->{
			StringBuilder sb=new StringBuilder(str);
	
			sb.reverse();
			String result=sb.toString();
			return result;
			
			
			
			
		};
		
		
		
		printlength(strings,f);
		printuppercase(strings,f1);
		printlowercase(strings,f2);
		printReverse(strings,f4);
		

	}

	public static void printlength(List<String> strings, Function<String,Integer>fRef)
	{
			for (String str : strings) {
				System.out.println(fRef.apply(str));
			}
		
	}
	public static void printuppercase(List<String> strings, Function<String,String>f1Ref)
	{
			for (String str : strings) {
				System.out.println(f1Ref.apply(str));
			}
		
	}
	public static void printlowercase(List<String> strings, Function<String,String>f2Ref)
	{
			for (String str : strings) {
				System.out.println(f2Ref.apply(str));
			}
		
	}
	public static void printReverse(List<String> strings, Function<String,String>f4Ref)
	{
			for (String str : strings) {
				System.out.println(f4Ref.apply(str));
			}
		
	}
	
}



