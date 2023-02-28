package com.in28minutes.g;

public class RecordRunner {
	
	record Person (String name, String email, String phoneNumber) {
		Person{
			if(name == null)
				throw new IllegalArgumentException("name null");
		}
	}
	
	public static void main(String[] args) {
		Person person1 = new Person("man1","a@email.com","010-1111-1111");
		Person person2 = new Person("man2","b@email.com","010-1111-1111");
		
		person1.name();
		
		System.out.println(person1.equals(person2));
	}
}
