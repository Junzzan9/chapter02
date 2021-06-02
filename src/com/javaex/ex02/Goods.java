package com.javaex.ex02;

public class Goods {

	//필드	
	private String name;
	private int price;
	
	//생성자
	
	
	//메소드 (겟터,셋터)
	
	
	//메소드 (일반)
	//네임의 값을 넣는 기능 6가지 규칙
	public void setname(String n) {
		name=n;
	}
	public void setprice(int p) {
		price=p;
	}
	public String getName() {
		return name;
	}
	public int getPrice()	{
		return price;
	}
	
	public void showInfo() {
		System.out.println("상품이름 : "+name);
		System.out.println("가격 : "+price+"원");
		System.out.println("-------------------");
	}
	
	
}



