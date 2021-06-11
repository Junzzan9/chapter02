package com.javaex.ex21;

public class Ex01 {
	public static void main(String[] args){
		
		Rectangle r01= new Rectangle("빨","주",5,5);
		
		r01=null;
		
		
		try {
			r01.draw();
		}
		catch(NullPointerException e) {
			r01= new Rectangle("빨","주",5,5);
			r01.draw();
		}
		
		
	}
	
}
	
		
		

