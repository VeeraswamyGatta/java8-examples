package com.lamda.expressions;

import java.util.function.Function;

public class Lamda_Examples {

	
	public void disp(){
		System.out.println("Hello World");
	}
	
	//() -> { System.out.println();}
	
	public void add(int a, int b) {
		
		System.out.println(a+b); 
	}
	
	//(int a, int b) -> { System.out.println(a+b);}
	
	public int addreturn ( int a ,int b) {
		
		return a+b;
	}
	
	//(int a, int b) -> {return a+b}
	
	//(a,b)-> a+b;
	
	
	
	
  public static void main(String[] args) {
	
	  
	  //Lamda_Examples le=new Lamda_Examples();
	  //le.disp();
	  //le.add(1, 2);
	  //System.out.println(le.addreturn(2, 3));
	  
	 Function<Integer,Integer> f=i->i*i;
	 
	 Function<String,Integer> auto= i->Integer.valueOf(i); //Function<String,Integer> auto=Integer::valueOf;
	 
	 Function<String,String> tobackString= auto.andThen(String::valueOf);
	 System.out.println(auto.apply("234")); 
	 System.out.println(tobackString.apply("123"));
	 
      System.out.println(f.apply(6));
	  
	  
	  
	  
}
}
