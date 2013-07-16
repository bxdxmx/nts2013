package jp.co.nts.logic;

import java.util.ArrayList;
import java.util.List;

public class Sample {

	public static interface Car {
		void move(int age);
	}

	public static class NormalCar implements Car {
		@Override
		public void move(int age) {
			System.out.println("“®‚«‚Ü‚·Bage:" + String.valueOf(age));
		}
	}
	
	public static class CarProxy implements Car {
		Car car = new NormalCar();
		
		@Override
		public void move(int age) {
			if( age >= 18 ) {
				car.move(age);
			} else {
				System.out.println("“®‚©‚¹‚Ü‚¹‚ñBage:" + String.valueOf(age));
			}
		}
	}
}
