package firsttest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestCalculator.class, TestFactorial.class, TestFib.class })
public class AllTests {

}
