package jp.co.nts.logic;

import java.util.ArrayList;
import java.util.List;

import org.ietf.jgss.Oid;

public class Sample {

	public static abstract class View {
		private View nextView = null;
		protected boolean clickable = false;
		private String name;

		public void setNextView(View view) {
			this.nextView = view;
		}

		public View(String name) {
			this.name = name;
		}
		
		public void onClick() {
			if(clickable) {
				System.out.println("クリックされました。name:" + name);
			} else {
				if( nextView != null) {
					nextView.onClick();
				} else {
					System.out.println("クリック対象のオブジェクトが存在しません");
				}
			}
		}
	}

	public static class TextView extends View {
		public TextView(String name) {
			super(name);
		}
	}
	
	public static class EditView extends View {
		public EditView(String name) {
			super(name);
			clickable = true;
		}
	}

	public static class GroupView extends View {
		public GroupView(String name) {
			super(name);
		}
	}
}
