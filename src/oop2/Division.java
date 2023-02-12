package oop2;

import oop1.Addition;

public class Division extends Addition{
	
	void Divition(int a, int b) {
		int d = a/b;
		System.out.println(d);
	}

	public static void main(String[] args) {
		

		Division d1 = new Division();
		
		// (100=100=100)/10
		
		d1.add(100, 100, 100);
		int done = d1.add(100, 100, 100);
		d1.Divition(d1.add(100, 100, 100), 10);
		d1.Divition(done, 10);
		
		
	
		
		

	}

}
