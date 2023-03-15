package testlambdas;

public class LambdaSwitchCase {
	static double calculate(String operator,double x,double y)
	{
		return switch(operator)
				{
		case "+" ->x+y;
		case "-" ->x-y;
		case "*" ->x*y;
		case "/" ->
		{
			if(y==0)
			{
				throw new IllegalArgumentException("Can't divide");
			}
			yield x/y;
		} 
		default ->throw new IllegalArgumentException("Unknown operator");
		
				};
	}
	public static void main(String[] args) {
		System.out.println(calculate("*", 5.6, 7.9));
		System.out.println(calculate("+", 5.6, 6.5));
		System.out.println(calculate("-", 5.6, 5.5));
		
		System.out.println(calculate("/", 5.6, 0));
		
		
	}

}
