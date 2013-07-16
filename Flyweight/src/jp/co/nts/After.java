package jp.co.nts;

import static jp.co.nts.logic.Sample.*;

public class After {

	public static void main(String[] args) {
		FlyweightFactory factory = FlyweightFactory.getInstance();
		
		Flyweight f1 = factory.getFlyweight(1);
		Flyweight f2 = factory.getFlyweight(1);

		System.out.println(f1==f2);
	}
}
