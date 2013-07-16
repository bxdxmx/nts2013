package jp.co.nts;

public class SimpleClass {
	private int attr;
	
	public void setAttribute(int attribute) {
		this.attr = attribute;
	}

	public int getAttribute() {
		return this.attr;
	}

	private double pi() {
		return 3.14;
	}
	
	public static void main(String[] args) {
		SimpleClass obj = new SimpleClass();
		
		// before setting attribute
		System.out.println(obj.getAttribute());
		
		// after setting attribute
		obj.setAttribute(3);
		System.out.println(obj.getAttribute());
		
		//-----
		// confirm the result to see the console output.
		//-----
	}
}
