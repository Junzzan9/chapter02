package com.javaex.ex20;

public class Circle extends Shape {
	
	private int radius;
	/*
	public Circle() {
		
	}
	*/
	
	public Circle(String fillColor,int Radius) {
		//super(fillColor);
		this.radius=Radius;
	}


	/*public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "Circle [fillColor=" + super.getFillColor() +  ", radius=" + radius + "]";
	}
	*/
	
	public void draw() {
		System.out.println("[원]#면색:"+super.getFillColor()+", 반지름:"+radius+" 그렸습니다.");
	}
	
	
	public double area() {
		return radius*radius*3.14;
	}
	
	
	
}
