package com.javaex.ex21;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] iArr=new int[3];
		
		iArr[0]=0;
		iArr[1]=1;
		iArr[2]=2;
		
		try {
			System.out.println(iArr[3]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("not exist array");
		}
		
			
	}

}
