package oopsday2example;

public class MathImp implements MathIface {
	private int n;
	
	
	public MathImp() {
		// TODO Auto-generated constructor stub
	}

	public MathImp(int n) {
		
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return "MathImp [n=" + n + "]";
	}
	public void factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	public void prime(int n)
	{
		int f=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				
				f++;
			}
			
		}
		if(f==2)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}
	public void reverse(int n)
	{
	

}
}
