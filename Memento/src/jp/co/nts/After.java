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
		Sum sum = new Sum();
	
		sum.add(1);
		sum.add(2);
		sum.add(3);
		sum.add(4);
		sum.add(5);
		
		System.out.println(sum.getNum());
		
		SumMemento sumMemento = new SumMemento();

		sumMemento.add(1);
		sumMemento.add(2);
		sumMemento.add(3);
		sumMemento.add(4);
		sumMemento.add(5);
		
		System.out.println(sumMemento.getNum());
		System.out.println(sumMemento.getMemento(4));
		System.out.println(sumMemento.getMemento(3));
		System.out.println(sumMemento.getMemento(2));
		System.out.println(sumMemento.getMemento(1));
		System.out.println(sumMemento.getMemento(0));
	}
}
