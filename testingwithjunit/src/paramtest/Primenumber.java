package paramtest;

public class Primenumber {
	public boolean validate(int n)
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
			return true;
		}
		else 
			return false;
	}
}


