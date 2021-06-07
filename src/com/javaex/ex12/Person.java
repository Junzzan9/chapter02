package com.javaex.ex12;

public class Person {

	private String name;
	private int age;
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public Person() {
		
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
	
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public void showInfo() {    //화면출력 만들기 힘듦
		System.out.println("이름: "+name+", 나이: "+age);
	}
	

}
