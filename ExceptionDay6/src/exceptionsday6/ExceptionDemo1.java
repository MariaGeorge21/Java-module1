package exceptionsday6;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		System.out.println("Program task begins");
	
		
		try {
			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			int b= scanner.nextInt();
			int c=a/b;
			System.out.println(c);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("cannot / by zero");
			
		}
		catch(InputMismatchException e)
		{
			System.out.println("input mismatch exception" );
		}
		System.out.println("Program completed");

	}

}
