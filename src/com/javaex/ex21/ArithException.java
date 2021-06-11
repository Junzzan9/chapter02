package com.javaex.ex21;

import java.util.Scanner;

public class ArithException {
	public static void main(String[] args) {
		
		double result;
		int num;
		Scanner sc =new Scanner(System.in);
		
		num=sc.nextInt();
		
		try {
			result= 100/num;
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("Cannot divide to 0");
		}
			
		
		sc.close();
		
	}
}
