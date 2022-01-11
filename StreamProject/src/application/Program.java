package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
//		primeira stream
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);		
		Stream<Integer> st1 = list.stream().map(x -> x*10);		
		System.out.println(Arrays.toString(st1.toArray()));
		
//		segunda stream
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st2.toArray()));

//		terceira stream
		Stream<Integer> st3 = Stream.iterate(0, x -> x+2);		
		System.out.println(Arrays.toString(st3.limit(10).toArray()));

//		quarta stream
		Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1],p[0]+p[1]}).map(p -> p[0]);		
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
		
	}
}

		