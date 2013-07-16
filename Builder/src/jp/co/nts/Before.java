package jp.co.nts;

import static jp.co.nts.logic.Sample.*;

/*
 * Builderパターン
 *  複合オブジェクトについて、その作成過程を表現形式に依存しないものにすることにより、
 *  同じ作成過程で異なる表現形式のオブジェクトを生成できるようにする。
 * 
 */

public class Before {
	public static void main(String[] args) {
		int a = 1;
		Car car = new Car();

		if( a == 1) {
			car.setHandle("my handle");
			car.setDoor("your door");
			car.setMirror("a mirror");
		} else if( a == 2 ) {
			car.setHandle("only handle?");
		}
		
		System.out.println(car.content());
		
		/*
		 * オブジェクト呼び出し側で、それぞれのパラメータをどうセットしなければならないか意識する必要がある。
		 * 中途半端な状態でオブジェクトを使うことができてしまう。
		 * a==3の実装が必要になった時に、ifの分岐を増やさないといけない。
		 */
	}
}
