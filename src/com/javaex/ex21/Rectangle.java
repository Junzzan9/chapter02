package com.javaex.ex21;

public class Rectangle {
	
	private String fill;
	private String line;
	private int width;
	private int height;
	
	public Rectangle() {
		
	}
	public Rectangle(String fill,String line,int width, int height) {
		this.fill=fill;
		this.line=line;
		this.width=width;
		this.height=height;
	}
	
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	public void draw() {
		System.out.println(fill+line+width+""+height);
	}
	
	public double area() {
		return width*height;
	}
}
