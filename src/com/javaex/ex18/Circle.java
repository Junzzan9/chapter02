package com.javaex.ex18;

public class Circle extends Shape {
	
	private int Radius;
	
	public Circle() {
		
	}
	
	public Circle(String fill,String line,int Radius) {
		super(fill,line);
		this.Radius=Radius;
	}


	public int getRadius() {
		return Radius;
	}

	public void setRadius(int radius) {
		Radius = radius;
	}
	
	@Override
	public String toString() {
		return "Circle [fillColor=" + super.getFillColor() + ", lineColor=" + super.getLineColor() + ", radius=" + Radius + "]";
	}
	
	public void draw() {
		System.out.println("[면색:"+super.getFillColor()+", 선색:"+super.getLineColor()+", 반지름:"+Radius+"] 원을 그렸습니다.");
	}
	
	public double area() {
		return Radius*3.14;
	}
	
	
}
