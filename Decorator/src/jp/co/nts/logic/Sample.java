package jp.co.nts.logic;

import java.util.ArrayList;
import java.util.List;

public class Sample {
	
	static public class Printer {
		public void print() {
			System.out.println("normal print");
		}
	}
	
	static public class SuperPrinter extends Printer {
		@Override
		public void print() {
			System.out.println("pre-super");
			super.print();
			System.out.println("post-supser");
		}
	}
	
	static public class HyperPrinter extends SuperPrinter {
		@Override
		public void print() {
			System.out.println("pre-hyper");
			super.print();
			System.out.println("pre-hyper");
		}
	}
	
	static public class SuperPrinterComposite {
		private Printer printer = new Printer();
		
		public void print() {
			System.out.println("pre-super");
			printer.print();
			System.out.println("post-super");
		}
	}
	
	static public class HyperPrinterComposite {
		private SuperPrinterComposite printer = new SuperPrinterComposite();
		
		public void print() {
			System.out.println("pre-hyper");
			printer.print();
			System.out.println("pre-hyper");
		}
	}
	
}

