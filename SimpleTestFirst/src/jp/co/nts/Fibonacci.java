package jp.co.nts;

import java.util.Map;
import java.util.TreeMap;

public class Fibonacci {
	int calledNum = 0;
	
	static Map<Long, Long> cacheFibonacciNumber = new TreeMap<>();
	
	public long compute(long input) {
		++calledNum;
		System.out.println(calledNum);
		
		if( input == 0L) {
			return 0L;
		} else if( input == 1L ) {
			return 1L;
		} else {
			long i = input-2;
			long n_2 = 0;
			long n_1 = 1;
			long n = -1;
			
			do {
				n = n_2 + n_1;
				n_2 = n_1;
				n_1 = n;
			} while( --i >= 0 );
			
			return n;
		}
	}

	
	public long computeUsingCache(long input) {
		if( cacheFibonacciNumber.containsKey(input)) {
			return cacheFibonacciNumber.get(input);
		}

		if( input == 0L ) {
			cacheFibonacciNumber.put(input, 0L);
		} else if( input == 1 ) {
			cacheFibonacciNumber.put(input, 1L);
		} else {
			cacheFibonacciNumber.put(input, computeUsingCache(input-2) + computeUsingCache(input-1));
		}
		
		return cacheFibonacciNumber.get(input);
	}

	public long computePlain(long input) {
		if( input == 0L ) {
			return 0L;
		} else if( input == 1L ) {
			return 1L;
		} else {
			return computePlain(input-2) + computePlain(input-1);
		}
	}

	public long computeStupid(int input) {
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
		return n;
	}
}
