package jp.co.nts.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

import javax.swing.text.View;

import org.ietf.jgss.Oid;

public class Sample {
	
	static public class Sum {
		private int num = 0;
		
		public void add(int n) {
			num += n;
		}
		
		public int getNum() {
			return num;
		}
	}
	
	static public class SumMemento extends Sum {
		@Override
		public void add(int n) {
			super.add(n);
			createMemento();
		}
		
		private List<Memento> mementos = new ArrayList<>();
		
		private void createMemento() {
			mementos.add(new Memento(getNum()));
		}
		
		public int getMemento(int i) {
			return mementos.get(i).n;
		}
		
		private class Memento {
			private int n;
			
			public Memento(int n) {
				this.n = n;
			}
		}
	}
}
