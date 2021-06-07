package com.javaex.ex10;

public class GoodsApp {

	public static void main(String[] args) {
		//int[] intArray=new int[3];
		
		Goods[] goodsArray = new Goods[3];
		System.out.println(goodsArray.length);
		
		Goods computer = new Goods ("그램",1000000);
		Goods camera = new Goods("니콘",400000);
		
		/*
		computer.showInfo();
		camera.showInfo();
		*/
		
		goodsArray[0]=computer;
		goodsArray[1]=camera;
		
		for(int i=0;i<goodsArray.length;i++) {
			if(goodsArray[i]!=null) {
				System.out.println(goodsArray[i].getName());
		
			}
			
		}
		
	}
}
