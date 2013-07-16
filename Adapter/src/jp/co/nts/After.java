package jp.co.nts;

import static jp.co.nts.logic.Sample.*;
import jp.co.nts.logic.Sample.Car;

public class After {

	public static void main(String[] args) throws CloneNotSupportedException {
		Car normalCar = new NormalCar();
		Car superCar = new SuperCar();
		
		System.out.println(normalCar.getCost());
		System.out.println(superCar.getCost());
	}
}
