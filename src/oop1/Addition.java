package oop1;

public class Addition {
	
	private int x;
	private int y; // Global / instance variable
	
	
	void add(){
		
		int sum = x+y;
		System.out.println(sum);	
	}
	
	public int add (int a,int b,int c) {
		int sum = a+b+c;
		return sum;
		
	}
		
	protected double nur (double a, double b, double c) {
		double nur = a+b+c;
		return nur;
		
	}

	public static void main(String[] args) {

		
	// object creation with a new keyword
		
			Addition a1 = new Addition();
			a1.x =5;
			a1.y =7;
			System.out.println(a1.x+a1.y);
				
			// a1. add();
			int sum3 = a1.add(7, 9, 3);
			System.out.println(sum3);
				
			double sum2 = a1.nur(2.4, 5.5, 7.2) ;
			System.out.println(sum2);
				
			Addition a2 = new Addition();
			a2.add(sum3, sum3, sum3);	
			
			Addition a3 = new Addition ();
			a3.x = 56;
			a3.y = 78;
			a3.add();
			a3.add(sum3, sum3, sum3);
			
			
			
			
			
			
			
			
			
			
			
				
	}

}
