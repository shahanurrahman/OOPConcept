package oop3;

import oop1.Addition;

public class Divition extends Addition {
			
			int x;
			int y;
			
	// THIS METHOD IS A constructor - Same as class name;	
	public Divition(){
			int x= 10;
			int y= 6;
		}
	public Divition(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
			
		void divides() {
		double d = x/y;
		System.out.println(d);	
			}
		
		void divides (int a,int b,int c) {
			double d =(a+b)/c;
			System.out.println(d);
		}
		
		void didides(double a, double b) {
			double d= a/b;
			System.out.println(d);
			
		}

	public static void main(String[] args) {
		
		Divition d1 = new Divition();
		// and perform (100+100+50)/10
		double div2 = d1.nur(100.0, 100.0, 50.0);
		d1.didides(div2, 10.0);		

	}

}
