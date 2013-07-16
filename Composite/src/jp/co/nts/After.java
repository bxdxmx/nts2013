package jp.co.nts;

import static jp.co.nts.logic.Sample.*;

public class After {

	public static void main(String[] args) {
		Component com1 = new Leaf("leaf1");
		Component com2 = new Leaf("leaf2");
		Component com3 = new Leaf("leaf3");
		Component com4 = new Leaf("leaf4");
		Component com5 = new Leaf("leaf5");
		Component com6 = new Leaf("leaf6");
		Component com7 = new Leaf("leaf7");
		Component com8 = new Leaf("leaf8");
		
		Composite col1 = new Composite("composite1");
		Composite col2 = new Composite("composite2");
		Composite col3 = new Composite("composite3");

		col1.add(com1);
		col1.add(com2);
		col1.add(com3);

		col2.add(com4);
		col2.add(com5);
		col2.add(com6);

		col3.add(com7);
		col3.add(com8);
	
		col1.add(col2);
		col1.add(col3);
	
		col1.operation();
	}
}
