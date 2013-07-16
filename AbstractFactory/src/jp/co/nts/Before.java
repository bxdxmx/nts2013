package jp.co.nts;

import static jp.co.nts.logic.Sample.*;

/*
 * Abstract factoryパターン
 * 互いに関連したり 依存しあうオブジェクト群を、その具象クラスを明確にせずに生成するためのインタフェースを提供する。
 */

public class Before {
	public static void main(String[] args) {
		int a = 1;

		ICar car = null;
		ITrain train = null;
		
		if( a == 1 ) {
			car = new Car1();
			train = new Train1();
		} else if( a == 2 ) {
			car = new Car2();
			train = new Train2();
		}
		
		car.drive();
		train.move();
		
		/*
		 * program側で具象クラスを意識しないといけない。。
		 * program側でインスタンス生成するときに、間違えて設定する可能性もある。
		 * a==3の実装が必要になった時に、ifの分岐を増やさないといけない。
		 */
	}
}
