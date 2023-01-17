package student;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {

	private String string;
	private int[] marks;

	public Student(String string, int... marks) {
		this.string = string;
		this.marks = marks;
	}

	public int getNumberOfMarks() {
		return this.marks.length;
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int i : this.marks) {
			sum += i;
		}
		return sum;
	}

	public int getMaximumMark() {
		int pivot = Integer.MIN_VALUE;
		for (int i : this.marks) {
			if (pivot < i) {
				pivot = i;
			}
		}
		return pivot;
	}

	public int getMinmumMark() {
		int pivot = Integer.MAX_VALUE;
		for (int i : this.marks) {
			if (pivot > i) {
				pivot = i;
			}
		}
		return pivot;
	}

	public BigDecimal getAverageMarsk() {
		int sum = getTotalSumOfMarks();
		int total = getNumberOfMarks();
		BigDecimal average = new BigDecimal(sum).divide(new BigDecimal(total), 3, RoundingMode.UP);
		return average;
	}

}
