package jp.co.nts;

public class SimpleFizzBuzz {
	public String fizzBuzz(int n) {
		return n % 15 == 0 ? "FizzBuzz"
				: n % 3 == 0 ? "Fizz"
				: n % 5 == 0 ? "Buzz"
				: String.valueOf(n);
	}
	
	public static void main(String[] args) {
		SimpleFizzBuzz obj = new SimpleFizzBuzz();
		
		for( int i = 1 ; i <= 20 ; i++) {
			System.out.println(obj.fizzBuzz(i));
		}
	}
}
