package com.javaex.ex20;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape sArr0[]=new Shape[3];
		
		
		Shape sr01=new Rectangle("빨강","검정",10,10);
		Shape sc01=new Circle("orange","검정",5);
		Shape st01=new Triangle("yellow","black",3,3);
		
		sArr0[0]=sr01;
		sArr0[1]=sc01;
		sArr0[2]=st01;
		
		for(int i=0;i<sArr0.length;i++) {
			sArr0[i].draw();
			System.out.println("넓이: "+sArr0[i].area());
		}
		
		
		
		System.out.println(((Rectangle)sr01).getWidth());
		
		
		//도형(shape) 배열을 만든다
		Shape sArr[]=new Shape[3];
		
		Rectangle r01=new Rectangle("빨강","검정",10,10);
		
		Circle c01=new Circle("주황","검정",30);
		
		Triangle t01=new Triangle("노랑","검정",5,5);
		
		
		//배열<-사각형
		sArr[0]=r01;
		//배열<-원
		sArr[1]=c01;
		//배열<- 삼각형
		sArr[2]=t01;
		
		for(int i=0;i<sArr.length;i++) {
			sArr[i].draw();
		}
		
	}

}
