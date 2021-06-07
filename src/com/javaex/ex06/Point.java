package com.javaex.ex06;


public class Point {

	//필드
	private int x;
	private int y;
	
	//생성자
	
	public Point() {
		//default
	}
	
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public Point(int x) {
		this.x=x;
	}
	
	
	
	//메소드 겟터셋터//
	public void setX(int x) {
		this.x=x;
	}
	public void setY(int y) {
		this.y=y;
	}
	
	public int getX() {
		return x;
		}
	public int getY() {
		return y;
	}
	
	//메소드 일반//
	
	public void draw() {
		System.out.println("점 [x="+x+", y="+y+"]을(를) 그렸습니다.");
	}
	public void draw(boolean flag) {
		
		if(flag==true) {
			System.out.println("점 [x="+x+", y="+y+"]을(를) 그렸습니다.");
		}
		else {
			System.out.println("점 [x="+x+", y="+y+"]을(를) 지웠습니다.");
		}
				
	}
	
}
