package userdefinedobjects;

public class Test {
	public static void main(String args[])
	{

	int i=9249021;
	
	String str = i+"";

	StringBuilder sb = new StringBuilder(str);
	StringBuilder rev = sb.reverse();
	boolean result = str.equals(sb.toString());
	System.out.println(result);
	
	}
}
