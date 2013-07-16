package jp.co.nts.logic;

public class Sample {
	public static class Car {
		private static Car car;
		
		/*
		 * Before‚Ìˆ×‚ÉƒRƒƒ“ƒg‰»
		private Car() {
		}
		*/
		
		public static Car getInstance() {
			if( car == null ) {
				car = new Car();
			}
			
			return car;
		}
		
		private int num=0;
		public int incrementNum() {
			return num++;
		}
	}
}

