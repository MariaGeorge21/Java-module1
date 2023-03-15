package firsttest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFactorial {
	static Calculator calc;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After All test");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("before each test case");
	}

	@After
	public void tearDown() throws Exception
	{
		System.out.println("After each test");
	}
	@Test
	public void test() {
		//fail("Not yet implemented");
	}

}
