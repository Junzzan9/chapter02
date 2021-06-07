package com.javaex.ex14;

public class Student extends Person{

	private String schoolName;
	
	public Student() {
		System.out.println("student()");
		
	}
	
	
	public Student(String schoolName) {
		this.schoolName= schoolName;
	}
	
	public Student(String name,int age,String schoolName) {
		//super(name,age);
		this.schoolName= schoolName;
		System.out.println("student(3)");
	}
	
	
	public String getSchoolName() {
		return schoolName;
	}
	
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName +" age="+getAge()+"]";
	}
	
	public void showInfo() {
		System.out.println("학교: "+schoolName+"  이름: "+getName()+"  나이: "+getAge());
	}


}
