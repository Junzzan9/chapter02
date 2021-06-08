package com.javaex.ex15;

public class ColorPoint extends Point{
	
	private String color;
	
	public ColorPoint() {
		
	}
	
	/*
	public ColorPoint(int x,int y,String color) {
		super(x,y);
		this.color=color;
	}
	*/
	
   public ColorPoint(int x, int y, String color) {
      //super(x, y);
        super.setX(x);
        super.setY(y);
        this.color = color;
    }
   
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	
	public void showInfo2() {
		System.out.println(x+","+y+","+color);
	}
	
	
	
	
	
	
	
	
	
}
