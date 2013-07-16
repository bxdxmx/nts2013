package jp.co.nts.logic;

import java.util.ArrayList;
import java.util.List;

public class Sample {

	static public class FlyweightFactory {
		private static FlyweightFactory flyweightFactory;
		private FlyweightFactory(){}
		
		public static FlyweightFactory getInstance() {
			if( flyweightFactory == null ) {
				flyweightFactory = new FlyweightFactory();
			}
			return flyweightFactory;
		}
		
		private Flyweight grade1 = new Flyweight(1);
		private Flyweight grade2 = new Flyweight(2);
		private Flyweight grade3 = new Flyweight(3);
		
		public Flyweight getFlyweight(int grade) {
			switch (grade) {
			case 1:
				return grade1;
			case 2:
				return grade2;
			default:
				return grade3;
			}
		}
	}
	
	static public class Flyweight {
		final int grade;
		final int width;
		final int height;
		
		public Flyweight(int grade ) {
			this.grade = grade;
			if( grade == 1 ) {
				width = 100;
				height = 200;
			} else if( grade == 2 ) {
				width = 500;
				height = 800;
			} else {
				width = 3;
				height = 5;
			}
		}
	}
}
