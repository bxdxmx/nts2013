package jp.co.nts.logic;

public class Sample {
	public static interface Car {
		int getCost();
	}
	
	public static class NormalCar implements Car {
		@Override
		public int getCost() {
			return 50;
		}
	}

	public static class SuperCar implements Car {
		SuperParts superParts = new SuperParts();
		
		@Override
		public int getCost() {
			return superParts.getPrice();
		}
	}
	
	public static class SuperParts {
		public int getPrice() {
			return 10000;
		}
	}
}
