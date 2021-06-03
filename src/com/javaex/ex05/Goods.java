package com.javaex.ex05;

public class Goods {
	//필드
	private String name;
	private int price;
	
	//생성자
	//Goods를 힙에 올리는거 
	public Goods() {
		//default 생성자 --> 자동으로 만들어지지만 다름생성자를 만들면 없어짐
	}
	
	public Goods(String name, int price) {
		this.name=name;
		this.price=price;
	}
	//메소드 g/s
	public void setName(String name){
		this.name = name;
	}
	public void setPrice(int price) {
		this.price=price;
	}

	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
	//메소드 일반
	public void showInfo() {
		System.out.println("상품명 :"+name);
		System.out.println("가격 :"+price);
		System.out.println("====================");
		
	}
}
