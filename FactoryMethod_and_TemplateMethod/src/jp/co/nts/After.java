package jp.co.nts;

import static jp.co.nts.logic.Sample.*;

public class After {

	public static void main(String[] args) {
		Creator creator1 = new No1Creator();
		Creator creator2 = new No2Creator();

		creator1.anOperation();
		creator2.anOperation();
	}
}
