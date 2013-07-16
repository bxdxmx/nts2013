package jp.co.nts.test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;
import static org.hamcrest.core.IsNot.*;

import java.awt.GraphicsConfiguration.DefaultBufferCapabilities;

import jp.co.nts.*; 

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import spock.lang.Unroll;

@RunWith(Enclosed)
class TestSimpleFizzBuzz {
	
	static class TestSimpleFizzBuzzByJUnit {
		def obj1;
		
		@Before
		public void setUp() throws Exception {
			obj1 = new SimpleFizzBuzz()
		}
	
		@Test
		void testFizzBuzz() {
			assertThat obj1.fizzBuzz(1), is("1")
			assertThat obj1.fizzBuzz(2), is("2")
			assertThat obj1.fizzBuzz(3), is(not("3"))
			assertThat obj1.fizzBuzz(4), is("4")
			assertThat obj1.fizzBuzz(5), is(not("5"))
		} 
	}
	
	static class TestSimpleFizzBuzzBySpock  extends spock.lang.Specification {

		def "test"() {
			expect: true
		}
			
		@Unroll
		def "testFizzBuzz"() {
			def obj1 = new SimpleFizzBuzz();
			
			expect: obj1.fizzBuzz(n) == res
			where:
			n	|	res
			1	|	"1"
			2	|	"2"
			3	|	"Fizz"
			4	|	"4"
			5	|	"Buzz"
			6	|	"Fizz"
			7	|	"7"
			8	|	"8"
			9	|	"Fizz"
			10	|	"Buzz"
			11	|	"11"
			12	|	"Fizz"
			13	|	"13"
			14	|	"14"
			15	|	"FizzBuzz"
			16	|	"16"
			17	|	"17"
			18	|	"Fizz"
			19	|	"19"
			20	|	"Buzz"
		}
	}
}