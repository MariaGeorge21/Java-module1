package paramtest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
@RunWith(Parameterized.class)
public class TestPrimeNumber {
private final Integer inputnumber;
private final Boolean expectedResult;
private Primenumber primeNumber;


	@Before
	public void initiaize()
	{
		 primeNumber = new Primenumber();
	}
	public TestPrimeNumber(Integer inputNumber,Boolean expectedResult)
	{
		this.inputnumber = inputNumber;
		this.expectedResult = expectedResult;
	}
	@Parameterized.Parameters
	public static Collection primeNumbers()
	{
		return Arrays.asList(new Object[][] {
			{2,true},
			{6,false},
			{19,true},
			{22,false},
			{23,true},
			{24,false},
			{10,false}}
		);
		}
	@Test
	public void testValidator()
	{
		System.out.println("Parameterized number is"+inputnumber);
		assertEquals(expectedResult,primeNumber.validate(inputnumber));
	}
	}
	/*
	 * @Test public void test() { fail("Not yet implemented"); }
	 */


