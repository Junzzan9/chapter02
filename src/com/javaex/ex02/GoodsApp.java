package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {


		Goods camera=new Goods();
		Goods computer=new Goods();
		Goods cup=new Goods();
		
		
		//camera.name = "니콘";
		camera.setname("니콘");
		//camera.price=400000;
		camera.setprice(400000);
		
		//computer.name="LG";
		computer.setname("LG그램");
		//computer.price=1000000;
		computer.setprice(1000000);
		
		//cup.name="머그컵";
		cup.setname("머그컵");
		//cup.price=2000;
		cup.setprice(2000);
		
		
		camera.showInfo();
		computer.showInfo();
		cup.showInfo();
		
		/*
		System.out.println("상품명:"+camera.getName()+","+camera.getPrice());
		System.out.println("상품명:"+computer.getName()+","+computer.getPrice());
		System.out.println("상품명:"+cup.getName()+","+cup.getPrice());
		*/
		
	}

}
