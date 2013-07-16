package jp.co.nts.test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

import java.util.Arrays;
import java.util.Collection;

import jp.co.nts.Fibonacci;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestFibonacci {
	private long input;
	private long output;

	@Before
	public void setUp() throws Exception {
	}

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { 0, 0 }, { 1, 1 }, { 2, 1 },
				{ 3, 2 }, { 4, 3 }, { 5, 5 }, { 6, 8 }, { 7, 13 },  { 8, 21}, 
				{ 10, 55 },
				{ 20, 6765 }, // 21891
				{ 30, 832040 }, // before:2692537, after:21
				{ 50, 12586269025L} // before:many many, after:41
		});
	}

	public TestFibonacci(long input, long output) {
		this.input = input;
		this.output = output;
	}

	/*
	 * // 1st
	 * 
	 * @Test public void testFibonacciBetween0_10() {
	 * fail("Not yet implemented"); }
	 */
/*
	// 2nd
	@Test
	public void testFibonacciBetween0_10() {
		int n = -1;

		switch (input) {
		case 0:n = 0;break;
		case 1:n = 1;break;
		case 2:n = 1;break;
		case 3:n = 2;break;
		case 4:n = 3;break;
		case 5:n = 5;break;
		case 6:n = 8;break;
		case 7:n = 13;break;
		case 10:n = 55;break;
		case 20:n = 6765;break;
		}
		
		assertThat(n, is(output));
	}
*/	
	// 3rd
	@Test
	public void testFibonacciBetween0_10() {
		Fibonacci fibonacci = new Fibonacci();
		
		assertThat( fibonacci.compute(input), is(output));
		assertThat( fibonacci.computeUsingCache(input), is(output));
	}
	
}
