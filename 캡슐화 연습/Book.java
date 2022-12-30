package com.bookPractice;

public class Book {
	private int noOfcopies;

	Book() {
		this(5);
	}

	Book(int noOfcopies) {
		this.noOfcopies = noOfcopies;
	}

	void setNoOfCopies(int count) {
		this.noOfcopies = count;
	}

	public void increaseSetNoOfCopies(int howMuch) {
		setNoOfCopies(this.noOfcopies + howMuch);
	}

	public void decreaseSetNoOfCopies(int howMuch) {
		setNoOfCopies(this.noOfcopies - howMuch);
	}

	public int getNoOfcopies() {
		return this.noOfcopies;
	}
}
