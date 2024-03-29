package com.lyming.entity;

/**
 * @ClassName Person
 * @Description TODO
 * @Author lyming
 * @Date 2023/12/17 02:21
 */
public class Person {

	private String name;

	private int age;

	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				", person=" + person +
				'}';
	}
}
