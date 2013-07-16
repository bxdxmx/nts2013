package jp.co.nts.test;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import jp.co.nts.SimpleClass;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

// junit's parameterized test is sick architecture.
// nunit's parameterized test is good architecture.
// just add the attribute "[TestCase(1,2)] to tested class.

@RunWith(Parameterized.class)
public class TestSimpleClassParameterized {
	private SimpleClass obj;
	private int n;
	
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][]{{0},{1},{2},{3},{10},{100},{50},{-999}};
		return Arrays.asList(data);
	}
	
	@Before
	public void setUp() throws Exception {
		obj = new SimpleClass();
	}

	public TestSimpleClassParameterized(int n) {
		this.n = n;
	}
	
	@Test
	public void attribute_value_is_n_after_setting() {
		obj.setAttribute(n);
		assertThat(obj.getAttribute(), is(n));
	}
}

