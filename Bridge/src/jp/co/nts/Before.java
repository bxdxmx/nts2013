package jp.co.nts;

import static jp.co.nts.logic.Sample.*;

/*
 * Bridgeパターン
 *  抽出されたクラスと実装を分離して、それらを独立に変更できるようにする。
 *　   
 */

public class Before {
	public static void main(String[] args) {
		/*
		 * ↓みたいなクラス構成だと、種類が増えたときに大変。 
		 * 乗り物の種類、グレードの種類
		 */
	}
	
	private static interface Vehicle {
		
	}
	
	private static abstract class Car implements Vehicle {
		
	}

	private static class NormalCar extends Car {
		
	}

	private static class SuperCar extends Car {
		
	}
	
	private static abstract class Train implements Vehicle {
		
	}
	
	private static class NormarlTrain extends Train {
		
	}
	
	private static class SuperTrain extends Train {
		
	}
}
