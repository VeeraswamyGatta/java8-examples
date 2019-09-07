package com.lamda.expressions;

import java.util.function.Function;

@FunctionalInterface
interface Foo {
    String method(String string);
}
public class Demo1 {
	
	public String add(String string, Foo foo) {
	    return foo.method(string);
	}
	
	public String addFunciton(String string, Function<String, String> fn) {
	    return fn.apply(string);
	}
	
	public static void main(String[] args) {
		
		
		Foo f= p -> p + "i am good how are you";
		Demo1 d =new Demo1();
		
		System.out.println(d.add("Veera", f));
		
		Function<String, String> fn = 
				  parameter -> parameter + " from lambda";
				d.addFunciton("Message ", fn);
	}

}
