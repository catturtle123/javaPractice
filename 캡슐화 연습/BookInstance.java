package com.bookPractice;

public class BookInstance {

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book(1000);
		Book effectiveJava = new Book(1000);
		Book cleanCode = new Book(1000);
		Book newCode = new Book();

		System.out.println(newCode.getNoOfcopies());
		System.out.println(artOfComputerProgramming.getNoOfcopies());

		artOfComputerProgramming.setNoOfCopies(10);
		effectiveJava.setNoOfCopies(20);
		cleanCode.setNoOfCopies(30);

		artOfComputerProgramming.increaseSetNoOfCopies(100);
		artOfComputerProgramming.decreaseSetNoOfCopies(80);

		System.out.println(artOfComputerProgramming.getNoOfcopies());
	}

}
