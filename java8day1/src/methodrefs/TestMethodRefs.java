package methodrefs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

interface Formula{
	public void m1();
}
class Some{
	public static void m2()
	{
		System.out.println("from m2......");
	}
}
class other{
	other()
	{
		System.out.println("from other constructor");
	}
	
}

public class TestMethodRefs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formula f = Some::m2;// "::" method references in java8
		f.m1();
		f = other::new;
		other o=new other();
		List<String> list = Arrays.asList("one","two","three");
		list.stream().forEach(System.out::println);
		List<Integer>intList=Arrays.asList(12,32,1223,11);
		Optional num = intList.stream().reduce(Math::max);
		System.out.println(num.get());
		
	}

}
