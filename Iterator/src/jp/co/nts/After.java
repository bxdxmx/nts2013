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
		String[] source1 = {"a","b","c"};
		
		for( String attr : source1) {
			System.out.println(attr);
		}
		
		List<String> arrayList = new ArrayList<>();
		Collections.addAll(arrayList, source1);
		
		for( String attr : arrayList) {
			System.out.println(attr);
		}

		List<String> linkedList = new LinkedList<>();
		Collections.addAll(linkedList, source1);
		
		for( String attr : linkedList) {
			System.out.println(attr);
		}
		
		Set<String> set = new HashSet<>();
		Collections.addAll(set, source1);
		
		for( String attr : set) {
			System.out.println(attr);
		}
		
	}
}
