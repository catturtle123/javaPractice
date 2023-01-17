package student;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		Student student = new Student("kim", 1, 2, 3);
		Student student2 = new Student("kim", 4, 5, 6);

		int number = student.getNumberOfMarks();
		int sum = student.getTotalSumOfMarks();
		int maximumMark = student.getMaximumMark();
		int minimumMark = student.getMinmumMark();
		BigDecimal average = student.getAverageMarsk();

		System.out.println(maximumMark);
		System.out.println(minimumMark);
		System.out.println(average);

	}


}
