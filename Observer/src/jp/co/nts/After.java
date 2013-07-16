package jp.co.nts;

import static jp.co.nts.logic.Sample.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

public class After {

	public static void main(String[] args) {
		
		Subject subject = new Subject();
		Observer observer = new PrintObserver();
		Observer superObserver = new SuperPrintObserver();
		
		subject.addObserver(observer);
		subject.addObserver(superObserver);
		
		subject.setName("Hello");
		subject.setName("‚±‚ñ‚É‚¿‚Í");
	}
}
