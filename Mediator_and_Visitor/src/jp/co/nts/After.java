package jp.co.nts;

import static jp.co.nts.logic.Sample.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class After {

	public static void main(String[] args) {
		FreeValue f1 = new FreeValue();
		FreeValue f2 = new FreeValue();
		ShareValue s1 = new ShareValue();
		ShareValue s2 = new ShareValue();
		ShareValue s3 = new ShareValue();
		
		f1.setValue(20);
		f2.setValue(10);
		
		Mediator mediator = new Mediator();
		mediator.addValue(f1);
		mediator.addValue(f2);
		mediator.addValue(s1);
		mediator.addValue(s2);
		mediator.addValue(s3);
		
		mediator.mediate();
		
		System.out.println(f1.getValue());
		System.out.println(f2.getValue());
		System.out.println(s1.getValue());
		System.out.println(s2.getValue());
		System.out.println(s3.getValue());
	}
}
