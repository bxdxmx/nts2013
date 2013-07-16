package jp.co.nts.logic;

public class Sample {

	public static abstract class Creator {
		public void anOperation() {
			Car car = factoryMethod();
			System.out.println(car.content());
		}
		
		protected abstract Car factoryMethod();
	}
	
	public static class No1Creator extends Creator {
		@Override
		protected Car factoryMethod() {
			return new Car1();
		}
	}
	
	public static class No2Creator extends Creator {
		@Override
		protected Car factoryMethod() {
			return new Car2();
		}
	}
	
	public abstract static class Car {
		public abstract String content();
	}
	
	public static class Car1 extends Car {
		@Override
		public String content() {
			return "hello, car";
		}
	}

	public static class Car2 extends Car {
		@Override
		public String content() {
			return "‚±‚ñ‚É‚¿‚Í, ŽÔ";
		}
	}
}

