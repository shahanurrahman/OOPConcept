package oop1;

public class Subtraction extends Addition {
	
	void sub(int a, int b) {
		int s= a-b;
		System.out.println(s);
		
	}
	
	
	public static void main(String[] args) {
		
		
		Subtraction s1 = new Subtraction();
		s1.sub(90, 10);
		
		// (100+100+100)-75
		s1.add(100,100,100);
		int store = s1.add(100,100,100);
		s1.sub(s1.add(100,100,100), 75);
		s1.sub(store, 75);
		
		
		
		
		
		
	}

}
