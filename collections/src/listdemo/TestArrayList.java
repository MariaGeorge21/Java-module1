package listdemo;
import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList flowers= new ArrayList();
		flowers.add(new Integer("1"));
		flowers.add(new java.util.Date());
		flowers.add(new java.util.Scanner(System.in));
		flowers.add("Tupils");
		flowers.add("Rose");
		flowers.add("Jamine");
		flowers.add("Lily");
		flowers.add("cosmoa");
		String str =(String)flowers.get(5);
		System.out.println(flowers);
		System.out.println(flowers.size());
		System.out.println(flowers.get(2));
		System.out.println(flowers.contains("lily"));
		System.out.println((String)flowers.get(5));
		System.out.println((String)flowers.get(2));
		
		
		Object obj=flowers.get(0);
		if(obj instanceof Integer)
		{
			Integer in=(Integer) obj;
			System.out.println(in.MIN_VALUE);
		}
		else if(obj instanceof Double)
		{
			Double d=(Double) obj;
			System.out.println(d.MIN_VALUE);
		}
		else if(obj instanceof String)
		{
			String str1=(String) obj;
			System.out.println(str1.toUpperCase());
		}
		/*for(Object obj:flowers)
		/*for(Object obj:flowers)
		{
			System.out.println(obj);
		}
		flowers.remove(2);
		System.out.println(flowers);
		Iterator iter = flowers.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		for(int i=0;i<flowers.size();i++)
		{
			System.out.println(flowers.get(i));
		}*/
		
	} 

}
