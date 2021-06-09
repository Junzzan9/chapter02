package com.javaex.ex16;

public class ShapeApp {

	public static void main(String[] args) {
		
		Rectangle[] arr=new Rectangle[3];

		Rectangle r01=new Rectangle("빨강","검정",5,5);
		Rectangle r02=new Rectangle("노랑","검정",6,6);
		Rectangle r03=new Rectangle("초록","검정",7,7);
		
		arr[0]=r01;
		arr[1]=r02;
		arr[2]=r03;
		
		
		for(int i=0;i<arr.length;i++) {
			//arr[i].draw();
		}
		
		for(int i=0;i<arr.length;i++) {
			arr[i].setFillColor("파랑");
			arr[i].draw();
		}
		/*
		r01.draw();
		r02.draw();
		r03.draw();
		*/
		
		Circle[] cArr=new Circle[3];
		
		Circle c01=new Circle("빨강","초록",3);
		Circle c02=new Circle("파랑","빨강",4);
		Circle c03=new Circle("초록","파랑",5);
		
		cArr[0]=c01;
		cArr[1]=c02;
		cArr[2]=c03;
		/*
		c01.draw();
		c02.draw();
		c03.draw();
		*/
		
		for(int i=0;i<cArr.length;i++) {
			cArr[i].draw();
		}
		
		
	}
	
	

}
