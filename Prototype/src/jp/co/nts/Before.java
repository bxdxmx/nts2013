package jp.co.nts;

import static jp.co.nts.logic.Sample.*;

/*
 * Prototypeパターン
 *  生成すべきオブジェクトの種類を原型となるインスタンスを使って明確にし、
 *  それをコピーすることで新たなオブジェクトの生成を行う
 *  
 *  
 *  オブジェクトのcloneを作成する、というだけ。
 */

public class Before {
	public static void main(String[] args) {
		for( int i=0;i<10;i++) {
			System.out.println(i);
			Car car1 = new Car1();
			Car car2 = new Car2();
		}
		
		/*
		 * 前処理に時間のかかるオブジェクトを何回も生成するのは大変
		 * 前処理にメモリを対象に使用するオブジェクトを何かいも生成するのは大変
		 */
	}
}
