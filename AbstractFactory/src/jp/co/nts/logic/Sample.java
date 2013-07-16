package jp.co.nts.logic;

public class Sample {

	public static interface ICar {
		void drive();
	}
	
	public static class Car1 implements ICar {
		@Override
		public void drive() {
			System.out.println("Car1:drive");
		}
	}
	public static class Car2 implements ICar {
		@Override
		public void drive() {
			System.out.println("Car2:drive");
		}
	}
	
	public static interface ITrain {
		void move();
	}
	
	public static class Train1 implements ITrain {
		@Override
		public void move() {
			System.out.println("Train1:move");
		}
	}
	public static class Train2 implements ITrain {
		@Override
		public void move() {
			System.out.println("Train2:move");
		}
	}
	
	public static abstract class AbstractFactory {
		public static AbstractFactory createFactory(int a) {
			if( a == 1 ) {
				return new No1Factory();
			} else if( a == 2 ) {
				return new No2Factory();
			}
			
			return null;
		}
		
		public abstract ICar createCar();
		public abstract ITrain createTrain();
	}
	
	public static class No1Factory extends AbstractFactory {

		@Override
		public ICar createCar() {
			return new Car1();
		}

		@Override
		public ITrain createTrain() {
			return new Train1();
		}
	}
	
	public static class No2Factory extends AbstractFactory {

		@Override
		public ICar createCar() {
			return new Car2();
		}

		@Override
		public ITrain createTrain() {
			return new Train2();
		}
	}
}
