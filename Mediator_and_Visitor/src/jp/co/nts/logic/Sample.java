package jp.co.nts.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

import javax.swing.text.View;

import org.ietf.jgss.Oid;

public class Sample {
	
	
	static public class Mediator {
		final int maxValue = 100;
		
		List<Value> shareValues = new ArrayList<>();
		List<Value> freeValues = new ArrayList<>();
		
		public void addValue(Value value) {
			value.visit(this);
		}
		
		public void addValue(ShareValue value) {
			shareValues.add(value);
		}
		
		public void addValue(FreeValue value) {
			freeValues.add(value);
		}
		
		public void mediate() {
			int sumFreeValues = 0;
			
			for( Value value : freeValues) {
				sumFreeValues += value.getValue();
			}
			
			int eachShareValues = (maxValue - sumFreeValues) / shareValues.size();
			
			for( Value value : shareValues) {
				value.setValue(eachShareValues);
			}
		}
	}
	
	static public abstract class Value {
		private int value;
		
		public void setValue(int value) {
			this.value = value;
		}
		
		public int getValue() {
			return value;
		}
		
		public abstract void visit(Mediator mediator);
	}
	
	static public class ShareValue extends Value{
		@Override
		public void visit(Mediator mediator) {
			mediator.addValue(this);
		}
	}
	
	static public class FreeValue extends Value{
		@Override
		public void visit(Mediator mediator) {
			mediator.addValue(this);
		}
	}
}
