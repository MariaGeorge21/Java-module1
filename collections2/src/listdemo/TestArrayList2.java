package listdemo;

import java.util.ArrayList;

public class TestArrayList2 {

	public static void main(String[] args) {
		ArrayList<String>colors =new ArrayList<String>();
		colors.add("Blue");
		colors.add("Green");
		colors.add("Red");
		colors.add("Yellow");
		colors.add("orange");
		colors.add(null);
		System.out.println(colors.size());
		String str = colors.get(3);
		System.out.println(str);

	}

}
