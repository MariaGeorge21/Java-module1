package firsttest;

public class Calculator {
	
	public int power(int b,int e)
	{int product=1;
	if(b==0|| e==0)
	{
		return 0;
	}
	   for(int i=1;i<=e;i++)
	   {
		   product=product*b;
	   }
	   return product;
	}
	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub(int c,int d)
	{
		return c-d;
	}
	public int factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	public int fib(int n)
	{
		int a=0;
		int b=1;
		int s=0;
		
		for(int i=3;i<=n;i++)
		{
			s=a+b;
			a=b;
			b=s;
		}
		return s;
	}
	
	}
	


