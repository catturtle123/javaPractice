package com.in28minutes.springstudy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {
}

record Address(String firstLine, String city) {
}

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Raby";
	}
	
	@Bean
	public int age() {
		return 15;
	}
	
	@Bean
	public Person person() {
		return new Person("Rabo",9,new Address("a","b"));
	}
	
	@Bean
	public Person person2Methods() {
		return new Person(name(),age(),address2());
	}
	
	@Bean
	public Person person3Parameters(String name, int age,Address address2) {
		return new Person(name,age,address2);
	}
	
	
	@Bean(name="address2")
	public Address address() {
		return new Address("Yeonhang 2-ro","suncheon");
	}
	
	@Bean(name="address3")
	public Address address2() {
		return new Address("Yeonhang 2-ro123123","suncheon");
	}
	
	
}