package io.javabrains;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		List<Integer> collect = Stream.iterate(1, element->element+1)
		.filter(element -> element%5==0)
		.limit(5).collect(Collectors.toList());
		collect.forEach((n)-> System.out.println(n));
	}
}
