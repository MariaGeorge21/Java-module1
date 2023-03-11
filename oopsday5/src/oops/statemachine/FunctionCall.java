package oops.statemachine;

public class FunctionCall {
	int amount1=0;
	
	Calculation cal = new Calculation();
	int x=cal.getN();

	public FunctionCall() {
		
	}
	public int withdraw(int rs1,int n,int amount)
	{
		if(rs1==100)
		{
			if(n<=cal.getN())
			{
				amount1=rs1*n;
				cal.setN(cal.getN()-n);
				
			}
			
		
		
		if(amount1==amount)
		{
			return amount1;
		}
		
//		else
//		{
//			return amount-amount1;
//		}
		}
		return amount1;
		
		
	}

}
