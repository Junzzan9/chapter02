package com.javaex.ex06;

public class PointApp {
	public static void main(String[] args) {
		
		Point p01 = new Point();
		
		p01.setX(5);
		p01.setY(5);
		p01.draw();
		
		
		Point p02=new Point(0,0);
		
		p02.draw();
		
		Point p03=new Point(10);
		p03.setY(10);
		//p03.setX(3);
		p03.draw();
		
		//Point p04=new Point(100);
	}
}
