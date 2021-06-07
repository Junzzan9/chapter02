package com.javaex.ex10;

public class Goods {
	
	private String name;
	private int price;
	private static int count=1;
	
	public Goods() {
		count=count+1;
		
	}
	
	public Goods(String name,int price) {
		count=count+1;
		this.name=name;
		this.price=price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("상품이름: " + name);
		System.out.println("가격:" + price);
		System.out.println("===========================");
	}
	
}
