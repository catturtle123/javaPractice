package com.person;

public class PersonRunner {
	public static void main(String[] args) {
		Employee person = new Employee("hi", "hi2");


		person.setPhone("010-1111-7111");
		person.setEmail("a@email.com");
		person.setEmployer("me");

		System.out.println(person.toString());
	}
}
