package Strings;

public  class TestStrings {
	public static void main(String[] args) {
		byte bytes[]= {66,65,67,69};
		String str=new String(bytes);
		System.out.println(str.length());
		System.out.println(str);
		str="Welcome to UST Global";
		bytes =str.getBytes();
		for(byte b:bytes)
		{
			System.out.println(b);
		}
		char chars[]= {'U','S','T',' ','G'};
		str= new String(chars);
		System.out.println(str);
		str.getChars(0,
		chars.length-1,chars,0);
		for(char c:chars)
		{
			System.out.println(c);
		}
		String string= new String("she sells sea. shells in the sea shores");
		int result=0;
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)=='s')
			{
				result=result+1;
			}
			else if(string.charAt(i)=='S')
			{
				result=result+1;
			}
			
		}
		System.out.println(result);
		String words[]=string.split("[.]");
		System.out.println(words.length);
		for(String word:words)
		{
			System.out.println(word);
		}
		string = new String("Cartoon");
		System.out.println(string.startsWith("Car"));
		System.out.println(string.endsWith("toon"));
		int apos = string.indexOf('a');
		int tpos =string.indexOf('t');
		String string2 = string.substring(apos,tpos+1);
		string2=string.substring(tpos);
		System.out.println(string2);
		 string = new String("madamdam");

		int dpos = string.lastIndexOf('d');
		string2 = string.substring(dpos,string.length());
		System.out.println(string2);
		
		String email=new String("aneeta.roy@ust.com");
		int cpos = email.lastIndexOf('c');
		String email1 = email.substring(cpos,email.length());
		System.out.println(email1);
		
		String str1 = new String("welcome");
		String str2 =new String("WELCOME");
		 boolean result1 = str1.equalsIgnoreCase(str2);
		 System.out.println(result1);
		 
		 string = "Dieheart";
		 int val = str2.compareTo(str1);
		 System.out.println(val);
		 System.out.println(string.toLowerCase());
		 System.out.println(string.toUpperCase());
		 System.out.println(string);
		//they are immutable
		 //16-11-477/6/A/3 Hyderabad 500036
		 String string5 = new String( "16-11-477/6/A/3 Hyderabad 500036");
		 int c1=0;
		 int c2=0;
		 int c3=0;
		 int c4=0;
		 for(int i=0;i<string5.length();i++)
		 {
		 if(Character.isDigit(string5.charAt(i)))
		 {
			c1=c1+1;
		 }
		 else if(Character.isAlphabetic(string5.charAt(i)))
		 {
		   c2=c2+1;
		 }
		 else if(Character.isSpaceChar(string5.charAt(i)))
		 {
			 c3=c3+1;
		 }
		 else
		 {
			 c4=c4+1;
		 }
		 }
		 System.out.println("no of digits - "+c1);
		 System.out.println("no of characters - "+c2);
		 System.out.println("no of white space - "+c3);
		 System.out.println("no of special character - "+c4);
		 
	
}
}
