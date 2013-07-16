package jp.co.nts.test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

import java.util.Arrays;
import java.util.Collection;

import jp.co.nts.SimpleClass;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

public class TestSimpleClass {
	private SimpleClass obj;
	
	@Before
	public void setUp() throws Exception {
		obj = new SimpleClass();
	}

	@Test
	public void sample_Test() {
		assertEquals(5, 5);
	}
	
	@Test
	public void attribute_value_is_0_before_setting() {
		assertThat(obj.getAttribute(), is(0));
	}

	@Test
	public void setメソッド呼び出しの後はその値が取得できること() {
		obj.setAttribute(234);
		assertThat(obj.getAttribute(), is(234));
	}
}
