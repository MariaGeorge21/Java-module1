package userdefinedobjects;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FrequencyHashMapTest {



	
		public static void main(String[] args)
		{

			
			String str = "what is this that is what";
			
			Map<String, Integer> hashMap = new HashMap<>();

			// Splitting the words of string
			// and storing them in the array.
			String[] words = str.split(" ");

			for (String word : words) {

				
				Integer integer = hashMap.get(word);

				if (integer != null)
				{
					hashMap.put(word, integer + 1);
					
				}
				else {
					hashMap.put(word, 1);
					
				}
			}
			System.out.println(words.length);
			
			System.out.println(hashMap);
		}
	}


