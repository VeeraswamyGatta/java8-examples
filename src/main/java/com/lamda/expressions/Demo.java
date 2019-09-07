package com.lamda.expressions;


// Anonymous ,Name less ,No Modifier ,No return type  
@FunctionalInterface
interface Test{
		public void disp();
		
		default public int add (int a, int b) {
			
			return a+b;
		}
		
		public static int square(int a) {
			
			return a*a;
		}
}

class testDemo implements  Test{

	public void disp() {
		System.out.println("Hello world");
		
				
	}
	
	
	
	
}

public class Demo {
	
	public static void main(String[] args) {
		
		
		Test t =new testDemo();
		t.disp();
		
		Test t1 =new Test() {

			@Override
			public void disp() {
				System.out.println( " hello world");
			}
			
		};
		
		t1.disp();
		
		Test l = () -> System.out.println("Hello world Lamba");
		l.disp();
	}

}
