package jp.co.nts;

import static jp.co.nts.logic.Sample.*;
import jp.co.nts.logic.Sample.Car;

public class After {

	public static void main(String[] args) throws CloneNotSupportedException {
		/*
		 * ���̂悤�ȃN���X�\���ɂ��邱�ƂŁA
		 * ��蕨�̎�ނ𑝂₵�����Ƃ��́A�P�N���X��ǉ����邾���ōςށB
		 * �O���[�h�̎�ނ𑝂₵�����Ƃ����A�P�N���X��ǉ����邾���ōςށB
		 */
	}
	
	private static abstract class Vehicle {
		Grade grade;
		
		public Vehicle(Grade grade) {
			this.grade = grade;
		}
	}
	
	private static abstract class Car extends Vehicle {

		public Car(Grade grade) {
			super(grade);
		}
	}

	private static abstract class Train extends Vehicle {

		public Train(Grade grade) {
			super(grade);
		}
	}

	private static interface Grade {
		
	}
	
	private static class NormalGrade implements Grade {
		
	}

	private static class SuperGrade implements Grade {
		
	}
}
