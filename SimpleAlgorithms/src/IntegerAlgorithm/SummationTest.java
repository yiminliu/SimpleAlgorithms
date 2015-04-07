package IntegerAlgorithm;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SummationTest {

	Summation summation;
	@Before
	public void setUp() throws Exception {
		summation = new Summation();
	}

	@Test
	public void testSummation() {
		assertEquals(summation.summation(100), 5050);
	}

	@Test
	public void testSummationWithNegativeNumber() {
		assertEquals(summation.summation(-10), 5050);
	}
	
	@Test
	public void testSummation2() {
		assertEquals(summation.summation(2, 100), 5047);
	}

	@Test
	public void testLinerSum() {
		assertEquals(summation.linerSum(100), 5050);
	}
	
	//@Test
	//public void testLinerSumWithNegativeNumber() {
	//	assertEquals(summation.linerSum(-10), 5050);
	//}

}
