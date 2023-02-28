package com.in28minutes.textBlock;

public class TextBlockRunner {
	public static void main(String[] args) {
		String str1 = """
				안녕하세요""";
		
		String str2 = """
				level 1: %s
				level 2: %s
				level 3:
				""".formatted("easy","normal");
		
		System.out.println(str1);
		System.out.println(str2);
		
	}
}
