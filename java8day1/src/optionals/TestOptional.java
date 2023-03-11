package optionals;

import java.util.Optional;

public class TestOptional {

	public static void main(String[] args) {
		String str=null;
		String str2="hello";
		//Optional<String>optional = Optional.of(str);
		//System.out.println(optional.get());
		Optional<String>optional2 = Optional.ofNullable(str2);
		System.out.println("its null");
		if(optional2.isPresent())
		{
			System.out.println("value is present"+optional2.get());
			System.out.println("is null"+optional2.orElse("str not initialized"));
		}
		else
		{
			System.out.println("value is null");
		}
	}
}


//when str is passed true condition is executed whrn str2 is passed no such element is found will be excecuted
