package com.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunner {

	static <T extends Number> Number num(T i) {
		return i;
	}

	static void addValues(List<? super Number> numbers) {
		numbers.add(1);
		numbers.add(1.0);
		numbers.add(1l);
	}

	static double sumOfNumberList(List<? extends Number> numbers) {
		double sum = 0.0;
		for (Number number : numbers) {
			sum += number.doubleValue();
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sum = sumOfNumberList(List.of(1, 2, 3, 4, 5));
		System.out.println(sum);
		
		List emptyList = new ArrayList<>();
		addValues(emptyList);
		System.out.println(emptyList);
		

		MyCustomList<String> list = new MyCustomList<>();
		list.addElement("1");
		list.addElement("2");
		String value = list.get(0);

		System.out.println(list);

		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElement(5);
		list2.addElement(2);

		Integer number = list2.get(0);
		System.out.println(list2);
	}
}
