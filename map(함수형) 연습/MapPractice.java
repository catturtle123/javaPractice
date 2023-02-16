package com.mapPractice;

import java.util.List;
import java.util.stream.IntStream;

public class MapRunner {
	public static void main(String[] args) {
		
		IntStream.range(1,11).map(e->e*e).forEach(e->System.out.println(e));
		
		List.of("Apple","Ant","Bat").stream().map(e->e.toLowerCase()).forEach(e->System.out.println(e));
	
		List.of("Apple","Ant","Bat").stream().forEach(e->System.out.println(e.length()));	
		}
}
