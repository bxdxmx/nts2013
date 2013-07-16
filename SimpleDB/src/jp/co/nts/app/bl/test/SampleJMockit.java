package jp.co.nts.app.bl.test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;
import mockit.Expectations;
import mockit.Mocked;

import org.junit.Before;
import org.junit.Test;

public class SampleJMockit {
	@Mocked
	final System system = null;

	@Test
	public void test() {
		new Expectations() {
			{
				System.nanoTime();
				result = 0L;
			}
		};
		
		assertThat(System.nanoTime(), is(0L));
	}
}
