package jp.co.nts;

import static jp.co.nts.logic.Sample.*;

public class After {

	public static void main(String[] args) {
		View groupView = new GroupView("GroupView");
		View editView = new EditView("EditView");
		View textView = new TextView("TextView");
		
		groupView.setNextView(editView);
		editView.setNextView(textView);
		
		groupView.onClick();
	}
}
