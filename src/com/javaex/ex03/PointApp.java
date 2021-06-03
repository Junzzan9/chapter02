package com.javaex.ex03;

import java.util.Scanner;

public class PointApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(a==0&&b==0) {
				System.out.println("종료합니다.");
				break;
			}
			else {
				Point x = new Point();
				Point y = new Point();
				
				
				x.setX(a);
				y.setY(b);
				
				x.drawX();
				y.drawY();
			
			}
		}
		sc.close();

	}
}
