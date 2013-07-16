package jp.co.nts.test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

import java.awt.GraphicsConfiguration.DefaultBufferCapabilities;
import java.security.PublicKey;

import jp.co.nts.SimpleClass;

import org.junit.Before;
import org.junit.Test;

class TestSimpleClass {
	def obj1;
	
	@Before
	public void setUp() throws Exception {
		obj1 = new SimpleClass()
	}

	@Test
	public void attribute_value_is_0_before_setting() {
		assertThat obj1.attr, is(0)
		assertThat obj1.attribute, is(0)
		assertThat obj1.getAttribute(), is(0)
		
		def n = 5;
		obj1.attr = n;
		assertThat obj1.attr, is(n)
		assertThat obj1.attribute, is(n)
		assertThat obj1.getAttribute(), is(n)
	}
	
	@Test
	public void private_is_can_call_from_groovy() {
		def pi = obj1.pi()
		assertThat pi, is(3.14D)
	}
}
