package com.javaex.ex16;

public class Triangle {
	
	private String fillColor;
	private String lineColor;
	private int width;
	private int height;
	

	public Triangle() {
		
	}
	
	public Triangle(String fillColor,String lineColor,int width, int height) {
		this.fillColor=fillColor;
		this.lineColor=lineColor;
		this.width=width;
		this.height=height;
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
	
	
	
}
