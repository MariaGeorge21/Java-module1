package oops.statemachine;

import java.util.Scanner;

public class MachineGui {

	public static void main(String[] args) {
		FunctionCall f=new FunctionCall();
		int i=0;
	
		while(i<2)
		{
			System.out.println("Enter the amount");
			Scanner s=new Scanner(System.in);
			int amount=s.nextInt();
			System.out.println("Enter the number of hundred notes");
			int rs1=100;
			int n=s.nextInt();
			
			int result=f.withdraw(rs1, n, amount);
			System.out.println(result);
			System.out.println("Enter the number of fifty notes");
			 n=s.nextInt();
			result=f.withdraw(rs1, n, amount);
			System.out.println("Enter the number of twenty notes");
			n=s.nextInt();
			result=f.withdraw(rs1, n, amount);
			System.out.println("Enter the number of ten notes");
			 n=s.nextInt();
			result=f.withdraw(rs1, n, amount);
			
			
			
			
		}
		

	}


}
