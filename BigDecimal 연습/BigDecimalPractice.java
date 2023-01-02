package com.proj1;

import java.math.BigDecimal;

public class javaPractice1 {
	public static void main(String[] args) {
		BigDecimal number1 = new BigDecimal("34.54645");
		BigDecimal number2 = new BigDecimal("34.4564564");

		BigDecimal number3 = number1.add(number2);

		System.out.println(number3);
	}
}
