package jp.co.nts;

import static jp.co.nts.logic.Sample.*;

public class After {

	public static void main(String[] args) {
		Printer printer = new HyperPrinter();
		printer.print();

		HyperPrinterComposite printerComposite = new HyperPrinterComposite();
		printerComposite.print();
	}
}
