package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test extends MyInteger {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	
	

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
	    assertTrue(isEven(2));
	    assertTrue(isOdd(3));
	    assertTrue(isPrime(13));
        assertFalse(isEven(3));
        assertFalse(isOdd(2));
        assertFalse(isPrime(1));
}
	@Test
	public void testIsEven() {

        int iIntegerTestValue = 2;
MyInteger instance = new iValue(iIntegerTestValue);
boolean bExpectedresult = true;
boolean bActualResult = instance.isEven();
assertEquals("testIsEven() failed",bExpectedresult,bActualResult);
	
	}
}