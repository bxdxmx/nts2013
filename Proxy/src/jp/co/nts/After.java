package jp.co.nts;

import static jp.co.nts.logic.Sample.*;

public class After {

	public static void main(String[] args) {
		Car car = new NormalCar();
		car.move(5);
		car.move(18);
		
		Car carProxy = new CarProxy();
		carProxy.move(5);
		carProxy.move(18);
	}
}
