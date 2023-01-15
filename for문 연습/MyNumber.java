package com.example.myN;

public class MyNumber {

	private int num;

	public MyNumber(int num) {
		this.num = num;
	}

	public void isPrime() {
		int j = 0;
		for (int i = 1; i <= this.num; i++) {
			if (this.num % i == 0) {
				j++;
			}
		}
		if (j == 2) {
			System.out.println("true");

		} else {
			System.out.println("false");
		}

	}
	
	

	public int sumUptoN() {
		int sum = 0;
		for (int i = 1; i <= this.num; i++) {
			sum += i;
		}

		return sum;
	}

	public int sumOfDivisors() {
		int sum = 0;
		for (int i = 2; i < this.num; i++) {
			if (this.num % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public void printANumberTriangle() {
		for (int i = 1; i <= this.num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
