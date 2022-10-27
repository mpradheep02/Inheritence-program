package org.SingleInheritence;

public class Single {
	
	public void one() {
		System.out.println("person");
	}
	
	public void two () {
		System.out.println("girls");
	}
	
	public static void main (String [] args) {
		Single s = new Single();
		s.one();
		s.two();
	}

}
