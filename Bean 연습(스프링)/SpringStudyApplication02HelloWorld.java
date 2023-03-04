package com.in28minutes.springstudy;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringStudyApplication02HelloWorld {

	public static void main(String[] args) {
		
		
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		
		System.out.println(context.getBean("name"));
		
		System.out.println(context.getBean("age"));
		
		System.out.println(context.getBean("person"));
		
		System.out.println(context.getBean("address2"));
		
		System.out.println(context.getBean("person"));
		
		System.out.println(context.getBean("person2Methods"));
		
		System.out.println(context.getBean("person3Parameters"));
	}

}
