package jp.co.nts;

import static jp.co.nts.logic.Sample.*;

public class After {

	public static void main(String[] args) {
		int a = 1;
		Director director1 = new Director(new No1Builder());
		Director director2 = new Director(new No2Builder());

		Car car1 = director1.construct();
		Car car2 = director2.construct();
		
		System.out.println(car1.content());
		System.out.println(car2.content());
	}
}
