package com.ust.debug;

public class TestCode2 {
	int a;
	int b;
	int x;
	int a1[]= {2,5,7,8,5};
	int b1[]= {23,43,27,32,12};
	int x1[]= {18,19,20,21,22};
	int result=0;
	//ax^2+bx^2+2ab;
	int add() {
		for(int i=0;i<5;i++)
		{
			a=a1[i];
			b=b1[i];
			x=x1[i];
			result=(a*x)*(a*x)+(b*x)*(b*x)+2*a*b;
		}
		return result;
			
	}
	public static void main(String[] args) {
		
		TestCode2 t=new TestCode2();
		t.add();
		
	}

}
