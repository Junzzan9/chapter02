package com.javaex.ex12;

public class PersonApp {

	public static void main(String[] args) {

		//테스트
		Person p00 =new Person("정우성",46);
		p00.showInfo();
		System.out.println(p00.toString());
		
		Student s00=new Student("이효리",22,"용마");
		System.out.println(s00.toString());
	}

}
