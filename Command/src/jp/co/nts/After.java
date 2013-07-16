package jp.co.nts;

import static jp.co.nts.logic.Sample.*;

public class After {

	public static void main(String[] args) {
		View view = new ButtonView("Button");
		Command command = new ClickCommand(view);
		
		command.execute();
		command.execute();
		command.execute();
	}
}
