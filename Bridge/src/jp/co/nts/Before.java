package jp.co.nts;

import static jp.co.nts.logic.Sample.*;

/*
 * Bridge�p�^�[��
 *  ���o���ꂽ�N���X�Ǝ����𕪗����āA������Ɨ��ɕύX�ł���悤�ɂ���B
 *�@   
 */

public class Before {
	public static void main(String[] args) {
		/*
		 * ���݂����ȃN���X�\�����ƁA��ނ��������Ƃ��ɑ�ρB 
		 * ��蕨�̎�ށA�O���[�h�̎��
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
