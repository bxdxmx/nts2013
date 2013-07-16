package jp.co.nts;

import static jp.co.nts.logic.Sample.*;

public class After {

	public static void main(String[] args) throws CloneNotSupportedException {
		Car car1proto = new Car1();
		Car car2proto = new Car2();
		
		for(int i=0 ; i< 10; i++ ) {
			System.out.println(i);
			Car car1 = car1proto.prototype();
			Car car2 = car2proto.prototype();
		}
	}
}
