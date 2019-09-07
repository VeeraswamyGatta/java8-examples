package com.lamda.expressions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {
	
	public static void main(String[] args) {
		
		
		Map<String,String> map= new HashMap<String, String>();
		
		map.put("Veera", "Swamy");
		map.put("g", "l");
		
		map.forEach(new BiConsumer() {
			@Override
			public void accept(Object t, Object u) {
				System.out.println(t + " " + u);
			}
		});
		
		map.forEach( (Object t,Object u) -> { 
			
			System.out.println(t + ""+ u );
			
		});
		
		List<String> names = Arrays.asList("veera","swamy","gatta");
		
		
		List<String> n =names.stream().parallel().map(name -> name.toUpperCase()).collect(Collectors.toList());
		System.out.println(n);
		
		List<String> list = Arrays.asList("geeks", "gfg", "g", 
                "e", "e", "k", "s"); 

// Using Stream map(Function mapper) to 
// convert the Strings in stream to 
// UpperCase form 
List<String> answer = list.stream().map(String::toUpperCase). 
collect(Collectors.toList()); 

// displaying the new stream of UpperCase Strings 
System.out.println(answer); 
		
		

Stream.of("John", "Mike", "Ryan","Donald", "Matthew").parallel().forEach(System.out::println);
		
	}

}
