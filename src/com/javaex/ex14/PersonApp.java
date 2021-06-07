package com.javaex.ex14;

public class PersonApp {

	public static void main(String[] args) {
		//default 값\
		/*
		Student s01=new Student();
		s01.setName("정우성");
		s01.setAge(50);
		s01.setSchoolName("서울대");
		*/
		
		//Student 생성자(3) 사용
		//생성자 순서(부모까지 포함)
		
		Student s02=new Student("이효리",45,"제주고등학교");
		s02.showInfo();
		
		/*
		Student s03=new Student();
		System.out.println(s03);
		 */
		
		
	}

}
