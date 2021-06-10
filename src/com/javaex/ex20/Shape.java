package com.javaex.ex20;

public abstract class Shape {
	
	private String fillColor;
	private String lineColor;
	
	public Shape() {
		
	}
	
	public Shape(String fill,String line) {
		this.fillColor=fill;
		this.lineColor=line;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	
	public void draw() {
		System.out.println("[면색:"+fillColor+", 선색:"+lineColor+"] 도형을 그렸습니다.");
	}
	
	public abstract double area();
	
	
}
