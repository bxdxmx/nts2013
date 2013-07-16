package jp.co.nts;

import static jp.co.nts.logic.Sample.*;

public class After {

	public static void main(String[] args) {
		int a = 1;
		AbstractFactory factory = AbstractFactory.createFactory(a);
		
		ICar car = factory.createCar();
		ITrain train = factory.createTrain();
		
		car.drive();
		train.move();
	}
}
