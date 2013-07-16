package jp.co.nts;

import static jp.co.nts.logic.Sample.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

import javax.net.ssl.SSLContext;

public class After {

	public static void main(String[] args) {
		int[] array = new int[100];
		
		for( int i = 0 ; i < 100 ; i++) {
			array[i] = (int)(Math.random() * 100);
		}
		int[] array2 = array.clone();

		System.out.println(Arrays.toString(array));

		Sorter sorter = new Sorter(new BubbleSortStrategy());
		sorter.sort(array);

		System.out.println(Arrays.toString(array));
		
		Sorter sorter2 = new Sorter(new FastSortStrategy());
		sorter.sort(array2);

		System.out.println(Arrays.toString(array2));
	}
}
