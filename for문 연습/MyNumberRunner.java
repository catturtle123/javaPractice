package com.example.myN;

public class MyNumberRunner {

	public static void main(String[] args) {
		MyNumber number = new MyNumber(9);

		number.isPrime();

		int sum = number.sumUptoN();

		System.out.println(sum);

		int sumOfDivisors = number.sumOfDivisors();

		System.out.println(sumOfDivisors);

		number.printANumberTriangle();


	}

}
