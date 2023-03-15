package firsttest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCalculator {
	Calculator calc;
	
	@Before
	public void setup() throws Exception
	{
		calc=new Calculator();
	}
	
	@Test
	public void testfactorial()
	{
		int n=5;
		int expectedValue=120;
		int actualValue=calc.factorial(n);
		assertEquals(expectedValue,actualValue);
		
	}
	@Test
	public void testPowerZero()
	{
		int inputBase=0;
		int exp=0;
		int expectedValue=0;
		int actualValue=calc.power(0, 0);
		assertEquals(expectedValue,actualValue);
	}

	@Test
	public void testPower() {
		int inputBase=2;
		int exp =3;
		int expectedValue=8;
		int actualValue=calc.power(inputBase, exp);
		assertEquals(expectedValue,actualValue);
		
		//fail("Not yet implemented");
	}
	public void testAdd()
	{
		int firstnumber=10;
		int secondnumber=20;
		int expectedValue=30;
		int actualValue=calc.add(firstnumber, secondnumber);
		assertEquals(expectedValue,actualValue);
	}
	public void testsub()
	{
		int num1=200;
		int num2=30;
		int expectedValue=170;
		int actualValue=calc.sub(num1, num2);
		assertEquals(expectedValue,actualValue);
		
		
		
	}
	public void testfib()
	{
		int n=5;
		int expectedValue=3;
		int actualValue=calc.fib(n);
		assertEquals(expectedValue,actualValue);
				
	}
	

}
