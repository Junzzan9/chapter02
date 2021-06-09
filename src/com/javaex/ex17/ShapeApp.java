package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {
		
		
		//부모클래스 테스트
		Shape s01=new Shape("빨강","검정");
		
		System.out.println(s01.toString());
		System.out.println("-------------");
		s01.draw();
		
		
		//사각형 테스트
		/*
		Rectangle r01=new Rectangle("빨강","검정",3,3);
		System.out.println(r01.toString());
		r01.draw();
		*/
		
		//사각형 관리//
		//배열
		Rectangle[] rArr=new Rectangle[3];
		
		rArr[0]=new Rectangle("빨","검",3,3);
		rArr[1]=new Rectangle("파","검",4,4);
		rArr[2]=new Rectangle("초","검",6,6);
		
		for(int i=0;i<rArr.length;i++) {
			rArr[i].draw();
		}
		
		
		//원관리,배열
		
		Circle[] cArr=new Circle[3];
		
		cArr[0]=new Circle("빨","검",5);
		cArr[1]=new Circle("파","검",6);
		cArr[2]=new Circle("초","검",7);
		
		for(int i=0;i<cArr.length;i++) {
			cArr[i].draw();
		}
		
		
		//삼각형관리,배열
		
		Triangle[] tArr=new Triangle[3];
		
		tArr[0]=new Triangle("빨","검",3,3);
		tArr[1]=new Triangle("파","검",3,3);
		tArr[2]=new Triangle("초","검",3,3);
		
		for(int i=0;i<tArr.length;i++) {
			tArr[i].draw();
		}
	}

}
