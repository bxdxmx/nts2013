package jp.co.nts.logic;

import java.util.Observable;
import java.util.Observer;


public class Sample {

	static public class Subject extends Observable {
		private String name;
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
			
			setChanged();
			notifyObservers();
		}
	}
	
	static public class PrintObserver implements Observer{

		@Override
		public void update(Observable o, Object arg) {
			Subject subject = (Subject)o;
			System.out.println(subject.getName());
		}
	}
	
	static public class SuperPrintObserver implements Observer{

		@Override
		public void update(Observable o, Object arg) {
			Subject subject = (Subject)o;
			System.out.println("super, " + subject.getName());
		}
	}
}
