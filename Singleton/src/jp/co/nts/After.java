package jp.co.nts;

import static jp.co.nts.logic.Sample.*;
import jp.co.nts.logic.Sample.Car;

public class After {

	public static void main(String[] args) throws CloneNotSupportedException {
		for(int i=0;i<10;i++) {
			Car car = Car.getInstance();
			System.out.println(car.incrementNum());
		}
	}
}
