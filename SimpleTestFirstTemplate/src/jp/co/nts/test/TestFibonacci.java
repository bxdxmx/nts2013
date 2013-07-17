package jp.co.nts.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

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
				/*
				{ 20, 6765 }, // before:21891
				{ 30, 832040 }, // before:2692537, after:21
				{ 50, 12586269025L} // before:many many, after:41
				*/
		});
	}

	public TestFibonacci(long input, long output) {
		this.input = input;
		this.output = output;
	}
	
	@Test
	public void testFibonacci() {
		Fibonacci obj = new Fibonacci();
		assertEquals(input, obj.getFibonacci(output));
	}
}
