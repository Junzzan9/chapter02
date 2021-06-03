package com.javaex.ex05;

public class GoodsApp {
	public static void main(String[] args) {
		
		Goods camera=new Goods();
		
		camera.setName("니콘");
		camera.setPrice(400000);
		camera.getName();
		camera.getPrice();
		
		// 생성자는 한개에 하나만 사용할 수 있다.
		
		camera.showInfo();
		
		Goods computer=new Goods("그램",1000000);
		computer.getName();
		computer.getPrice();
		computer.showInfo();
	}
}
