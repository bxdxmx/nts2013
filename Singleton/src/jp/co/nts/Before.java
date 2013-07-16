package jp.co.nts;

import static jp.co.nts.logic.Sample.*;

/*
 * Singletonパターン
 *  あるクラスに対してインスタンスが１つしか存在しないことを保証し、
 *  それにアクセスするためのグローバルな方法を提供する。
 */

public class Before {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			Car car = new Car();
			System.out.println(car.incrementNum());
		}
	}
}
