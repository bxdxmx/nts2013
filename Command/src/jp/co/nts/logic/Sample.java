package jp.co.nts.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

import javax.swing.text.View;

import org.ietf.jgss.Oid;

public class Sample {
	
	static public abstract class Command {
		View view;
		
		public Command(View view) {
			this.view = view;
		}
		
		public abstract void execute();
	}
	
	static public class ClickCommand extends Command {

		public ClickCommand(View view) {
			super(view);
		}

		@Override
		public void execute() {
			view.onClick();
		}
	}
	
	static public abstract class View {
		protected String name;
		
		public View(String name) {
			this.name = name;
		}
		
		public void onClick() {}
	}
	
	static public class ButtonView extends View {

		public ButtonView(String name) {
			super(name);
		}
		
		@Override
		public void onClick() {
			System.out.println( name + "がクリックされました。");
		}
	}
}
