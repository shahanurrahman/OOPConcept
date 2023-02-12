package oop4;

public class Calculator  implements  AdvCalc, BasicCalc{

	
			//Implements keyword for Interface 
			// Extends keyword for java class
	public static void main(String[] args) {	
		

	}

			@Override
			public void add(int a, int b) {
			// TODO Auto-generated method stub
			int sum = a+b;
			System.out.println(sum);
				
			}

			@Override
			public void sub(int a, int b) {
			// TODO Auto-generated method stub
			int sub = a+b;
			System.out.println(sub);
				
			}

			@Override
			public void multiple(int a, int b) {
			// TODO Auto-generated method stub
			int d = a+b;
			System.out.println(d);
				
			}

}
