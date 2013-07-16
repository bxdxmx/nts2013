package jp.co.nts.logic;

public class Sample {

	public static interface Car extends Cloneable {
		Car prototype() throws CloneNotSupportedException;
	}
	
	public static class Car1 implements Car {
		public Car1() {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public Car prototype() throws CloneNotSupportedException {
			return (Car)this.clone();
		}
		
	}
	
	public static class Car2 implements Car {
		public Car2() {
			for(int i=0; i< 100; i++ ) {
				object = new Object();
			}
		}

		private volatile Object object;
		
		@Override
		public Car prototype() throws CloneNotSupportedException {
			return (Car)this.clone();
		}
	}

}

