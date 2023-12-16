package com.lyming;

import com.lyming.entity.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext
				= new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		Person lyming = (Person)applicationContext.getBean("lyming");
		System.out.println(lyming.getName());

	}
}