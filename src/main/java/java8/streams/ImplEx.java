package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ImplEx {
	//Streams are created from data sources like Arrays, Collections, I/O channels
	/*
	 * Immediate Operators - These are lazy operations that transform the stream in to another stream without producing a final result.
	 * E.g: map, filter, sorted, distinct, limit
	 */
	
	/*
	 * Terminal Operators - These can produce a result and mark end of the stream pipeline. 
	 * E.g: Collect, forEach, reduce, count, anyMatch
	 */
	
	/*
	 * Optional: Some terminal operations produce optional object to avoid null results. 
	 * E.g. findFirst
	 */
	
	public static void main(String[] args) {
		checkStreams();
	}
	
	static void checkStreams() {
		
		//Defining a stream in many ways
		List<String> test = Arrays.asList("Aj", "Pj", "Rj", "Aj");
		Stream<String> sdxsd = test.stream();
		
		Stream<Integer> s2 = Stream.of(1,2,5,3,0);
		
		IntStream rangeStream = IntStream.range(1, 5);
		
		//Infinite Streams
		Stream<Double> infinteStream = Stream.generate(Math::random).limit(5);
		
		//s1.forEach(a -> System.out.println("All Values of S1 are: "+a));
		//s2.forEach(a -> System.out.println("All Values of S1 are: "+a));
		//rangeStream.forEach(a -> System.out.println("All Values of S1 are: "+a));
		//infinteStream.forEach(a -> System.out.println("All Values of S1 are: "+a));
		
		
		//Immediate Operations
		//filter
		test.stream().filter(a -> a.startsWith("A") ).forEach(b -> System.out.println("Filtered stream:"+b));
		
		//map
		test.stream().map(String::length).forEach(b -> System.out.println("Mapped stream:"+b));
		test.stream().map(t -> t.concat("mapped")).forEach(b -> System.out.println("Mapped stream:"+b));
		
		//sorted -natural order 
		test.stream().sorted().forEach(b -> System.out.println("Sorted stream:"+b));
		
		//distinct - remove duplicates
		test.stream().distinct().forEach(b -> System.out.println("Distinct stream:"+b));
		
		
		//Terminal Operations
		//collect
		List<String> collectedList = test.stream().filter(a -> a.length()>1).collect(Collectors.toList());
		collectedList.forEach(a -> System.out.println("Collect List"+a));
		
		//reduce
		String reducedString = test.stream().reduce("", (a, b) -> a + b);
		System.out.println("reduce String:"+reducedString);
		
		int count = test.stream().reduce(0,
				(accumulator, currentValue) -> currentValue.equals("Aj") ? accumulator + 1 : accumulator, Integer::sum);
		int count1 = test.stream().reduce(0, (a, o) -> o.equals("Aj") ? a + 1 : a , Integer::sum);
		System.out.println("reduce String count:"+count);
		
		//forEach
		test.stream().sorted().forEach(b -> System.out.println("Sorted stream:"+b));
		
		//findFirst / findAny
		Optional<String> os = test.stream().findFirst();
		
		//count: Counts the number of elements.
		long countTerminal = test.stream().filter(a -> a.length()>1).count();
		System.out.println("countterminal:"+countTerminal);
		
		//Example using Map, Filter, reduce
		int aC = test.stream()
				.map(a -> a.concat("Map"))
				.filter(a -> a.contains("Aj"))
				.reduce(0, (a, o) -> o.contains("Aj") ? a + 1 : a, Integer::sum);
		System.out.println("combinedStuff:"+aC);
		
		
	}

}
