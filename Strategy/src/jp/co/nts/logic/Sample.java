package jp.co.nts.logic;

import java.util.Arrays;

public class Sample {

	static public class Sorter {
		private Strategy sortStrategy;
		
		public Sorter(Strategy strategy) {
			this.sortStrategy = strategy;
		}
		
		public void sort(int[] array) {
			sortStrategy.sort(array);
		}
	}
	
	static public interface Strategy {
		void sort(int[] array);
	}

	static public class BubbleSortStrategy implements Strategy{
		@Override
		public void sort(int[] array) {
			for( int i = 0 ; i < array.length ; ++i ) {
				for( int j = i ; j < array.length ; ++j ) {
					if( array[i] > array[j] ) {
						int temp = array[i];
						array[i] = array[j];
						array[j] = temp; 
					}
				}
			}
		}
	}

	static public class FastSortStrategy implements Strategy {
		@Override
		public void sort(int[] array) {
			Arrays.sort(array);
		}
	}
}
