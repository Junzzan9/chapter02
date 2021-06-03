package com.javaex.ex03;


public class Point {

	//필드
	private int x;
	private int y;
	
	
	
	
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
	public void drawX() {
		System.out.print("점 [x="+x);
				
	}
	public void drawY() {
		System.out.println(", y="+y+"]을(를) 그렸습니다.");
	}
}
