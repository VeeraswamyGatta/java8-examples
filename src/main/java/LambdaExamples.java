import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class LambdaExamples{
	
	
	public static void main(String[] args) {
		
		
		Function<String,String> in=String::toUpperCase;
		System.out.println(in.apply("Veera"));
		
		
		List<String> str=Arrays.asList("Girish","Shai","Muarli");
		
		/*for(int i=0; i<str.size();i++) {
			
			System.out.println(str.get(i));
		}*/
		
		/*for(String s:str) {
			System.out.println(s);
			
			
		}*/
		
		
		str.forEach(System.out::println);
	
		List<String> s1=str.stream().parallel().map(String::toUpperCase).filter(s->s.equalsIgnoreCase("Girish")).collect(Collectors.toList());
		System.out.println(s1);
		
		
		
		
		
	}
}