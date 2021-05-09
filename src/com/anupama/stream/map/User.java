package com.anupama.stream.map;

import java.util.List;

/**
 * @author Anupama Khangar
 *
 */
public class User {
	
	private String name;
	private Integer age =10;
	private List<String> phoneNumbers;
	
	public User(String name, Integer age, List<String> phoneNumbers) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNumbers = phoneNumbers;
	}
	
	public User(String name) {
		 this.name = name;
	}	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", phoneNumbers=" + phoneNumbers + "]";
	}
	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	
}
