package com.practice.animal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return Integer.compare(o1.getId(), o2.getId());
	}

}

class Student implements Comparable<Student> {

	private int id;
	private String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.id + " " + this.name;
	}

	@Override
	public int compareTo(Student that) {
		return Integer.compare(this.id, that.id);

	}


}

public class CollectionRunner {
	public static void main(String[] args) {
		List<Student> students = List.of(new Student(1, "hi"), new Student(2, "no"));
		ArrayList<Student> students2 = new ArrayList<>(students);
		Collections.sort(students2);
		System.out.println(students2);

		students2.add(new Student(0, "w"));
		students2.sort(new StudentComparator());

		System.out.println(students2);

	}

}
