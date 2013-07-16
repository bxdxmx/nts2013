package jp.co.nts;

import static jp.co.nts.logic.Sample.*;
import jp.co.nts.logic.Sample.Car;

public class After {

	public static void main(String[] args) throws CloneNotSupportedException {
		/*
		 * ↓のようなクラス構成にすることで、
		 * 乗り物の種類を増やしたいときは、１つクラスを追加するだけで済む。
		 * グレードの種類を増やしたいときも、１つクラスを追加するだけで済む。
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
