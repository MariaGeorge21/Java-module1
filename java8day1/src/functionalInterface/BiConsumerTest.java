package functionalInterface;

import java.util.HashMap;
import java.util.function.BiConsumer;


public class BiConsumerTest {
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		map.put("ola","o");
		map.put("Hello","H");
		map.put("chao","C");
		map.forEach((k,v)->
		System.out.println(k+"For"+v));
		
		
		BiConsumer<String,String>bi=
				(k,v)->System.out.println(k+"for"+v);
				map.forEach(bi);
	
	
}
}
