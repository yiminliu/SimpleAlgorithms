package IntegerAlgorithm;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FactorialTest {

	Factorial fact;
	@Before
	public void setUp() throws Exception {
		fact = new Factorial();
	}

	@Test
	public void testFactorial() {
		assertEquals(fact.factorial(5), 120);
	}

	@Test
	public void testRecursiveFactorial() {
		assertEquals(fact.recursiveFactorial(5), 120);
	}
}
