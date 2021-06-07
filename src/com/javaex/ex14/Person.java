package com.javaex.ex14;

public class Person {

	protected String name;
	protected int age;
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
		System.out.println("person(2)");
	}
	
	
	public Person() {
		System.out.println("person()");
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
