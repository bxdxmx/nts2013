package jp.co.nts.logic;

import java.util.ArrayList;
import java.util.List;

public class Sample {
	
	
	public static abstract class Component {
		protected String name;
		
		public Component(String name) {
			this.name = name;
		}
		
		public abstract void operation();
	}
	
	public static class Leaf extends Component {
		public Leaf(String name) {
			super(name);
		}

		@Override
		public void operation() {
			System.out.println(name);
		}
	}
	
	public static class Composite extends Component {
		public Composite(String name) {
			super(name);
		}

		private List<Component> collection = new ArrayList<>();
		
		public void add(Component component) {
			collection.add(component);
		}
		
		@Override
		public void operation() {
			System.out.println(name);
			for (Component component : collection) {
				component.operation();
			}
		}
	}
}

