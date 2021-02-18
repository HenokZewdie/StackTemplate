package com.java.interview.exercise.java8;


import java.util.List;

public class PersonData {

	private String firstName;
	private String lastName;
	private int age;
	private List<Integer> phones;

	public PersonData(String firstName, String lastName, int age, List<Integer> phones) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.phones = phones;
	}

	public PersonData(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "LambdaJava8 [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	public List<Integer> getPhones() {
		return phones;
	}

	public void setPhones(List<Integer> phones) {
		this.phones = phones;
	}

}
