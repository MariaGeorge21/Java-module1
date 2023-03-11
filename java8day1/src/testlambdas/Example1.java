package testlambdas; 

interface Shape{
	double area();
}
interface Math
{
	double power(int b,int e);
	
}
interface fact
{
	 int fact(int n);
}


public class Example1 {
	public static void main(String[] args) {
		
		fact f= (int n) ->{
		int factor=1;
				
					for(int i=1;i<=n;i++)
					{
						factor=factor*i;
					}
					return factor;
			
				};
				int factor =f.fact(5);
				System.out.println(factor);
		
		Runnable r1 = new Runnable()
				{
			public void run()
			{
				System.out.println("from run method");
			}
				};
		Thread t1 = new Thread(r1);		
		t1.start();
		Runnable r=()->{
			for(int i=1;i<5;i++)
			{
				System.out.println("in run method"+i);
			}
		};
		Thread t= new Thread(r);
		t.start();
		Math m = (int b,int e) ->{
			int p=1;
			for(int i=0;i<e;i++)
			{
				p*= b;
			}
			return p;
		};
		double p= m.power(2, 3);
		System.out.println(p);
		Shape s=() ->
			{
				return 0.0;
				
			};
			double result = s.area();
			System.out.println(result);
		
		}
		}
	

